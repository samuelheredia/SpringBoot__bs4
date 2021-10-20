package com.bosonit.springboot.bs4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${VAR}")
    String var1;

    @Value("${my.var2}")
    String var2;

    @Value("${VAR3:var3 no tiene valor}")
    String var3;

    @Value("${url}")
    String url;

    @Value("${password}")
    String pass;

    @Autowired
    MyVariables myVariables;

    @Autowired
    MyConfig myConfig;

    @Autowired
    Perfiles miPerfil;

    @GetMapping("/valores")
    public String printValores(){
        System.out.println("Valor de var1 es: "+var1+" valor de my.var2 es: "+var2);
        return "Valor de var1 es: "+var1+" valor de my.var2 es: "+var2;
    }

    @GetMapping("/var3")
    public String printValor3(){
        System.out.println("Valor de var3 es "+var3);
        return "Valor de var3 es "+var3;
    }

    @GetMapping("/config")
    public String printConfig(){
        System.out.println("Configuration my: "+ myVariables.getVar1()+" - "+ myVariables.getVar2());
        return "Configuration my: "+ myVariables.getVar1()+" - "+ myVariables.getVar2();
    }

    @GetMapping("/parametros")
    public String printParametros(){
        System.out.println("Url: "+url+"\nPassword: "+pass);
        System.out.println("MyConfig.var1: "+ myConfig.getVar1()+"\nMyConfig.var2: "+ myConfig.getVar2());
        return "Url: "+url+"\nPassword: "+pass;
    }

    @GetMapping("/perfil")
    public void printPerfil(){
        miPerfil.miFuncion();
    }
}