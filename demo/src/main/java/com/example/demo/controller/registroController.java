package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.business.UsuarioBusiness;
import com.example.demo.entity.Usuario;

@Controller
public class registroController {
    @Autowired
    private UsuarioBusiness usuarioBusiness;
    
    @GetMapping("/registro")
    public String registar(){
        return "registro";
    }

    @PostMapping ("/registro")
    public String altaUsuario(Usuario usuario){
        usuarioBusiness.insertUsuario(usuario);
        return "/inicioAdmin";
    }
}

