package com.bosonit.springboot.bs4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import java.util.List;

@SpringBootApplication
public class Bs4Application {

	public static void main(String[] args) {
		SpringApplication.run(Bs4Application.class, args);
	}

	@Autowired
	private Environment environment;

	@Bean
	@Profile("dev")
	String getStringDev(){
		System.out.println("Dev activado: "+getProfile());
		return "Activado perfil "+getProfile();
	}

	@Bean
	@Profile("default")
	String getStringDefault(){
		System.out.println("Default activado: "+getProfile());
		return "Activado perfil "+getProfile();
	}

	String getProfile(){
		if(environment.getActiveProfiles()==null)
			return "default";
		String[] profiles = environment.getActiveProfiles();
		return profiles.length > 0 ? profiles[0]:"default";
	}
}