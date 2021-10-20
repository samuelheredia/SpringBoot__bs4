package com.bosonit.springboot.bs4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Configuration
@PropertySource("classpath:miconfiguracion.properties")
public class MyConfig {

    @Value("${var1}")
    private String var1;

    @Value("${var2}")
    private String var2;

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    @PostConstruct
    public void ejecutar() {
        System.out.println("Iniciando MyConf -> Var1="+getVar1()+" ; Var2="+getVar2());
    }
}
