package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.business.UsuarioBusiness;
import com.example.demo.entity.Rol;
import com.example.demo.entity.Usuario;

@SpringBootApplication
public class ConcursoMaterialesEducativosApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConcursoMaterialesEducativosApplication.class, args);
		UsuarioBusiness usuarioBusiness = context.getBean(UsuarioBusiness.class);
		usuarioBusiness.asignarRol("jicastells@comunidad.unnoba.edu.ar", Rol.CONCURSANTE);

	}

}
