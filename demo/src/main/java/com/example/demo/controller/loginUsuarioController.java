package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class loginUsuarioController {
    
    @GetMapping("/loginUsuario")
    public String loginAdmin() {
        return "loginUsuario";
    }

}

