package com.bosonit.springboot.bs4;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my")
public class MyVariables {
    public String var1;
    public String var2;

    public String getVar1(){ return var1; }
    public String getVar2(){ return var2; }
    public void setVar1(String var1){ this.var1 = var1; }
    public void setVar2(String var2){ this.var2 = var2; }


}
