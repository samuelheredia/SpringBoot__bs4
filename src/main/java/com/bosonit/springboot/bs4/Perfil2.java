package com.bosonit.springboot.bs4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
public class Perfil2 implements Perfiles {

    String perfil;

    @Override
    public void miFuncion() {
        perfil = "perfil2";
        System.out.println("Cargado "+perfil);
    }
}