package com.bosonit.springboot.bs4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil1")
public class Perfil1 implements Perfiles {

    String perfil;

    @Override
    public void miFuncion() {
        perfil="perfil1";

        System.out.println("Cargado "+perfil);
    }
}
