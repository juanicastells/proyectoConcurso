package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.business.CustomUserDetailsBusiness;

@Controller
public class AuthConcursanteController {
    
    @Autowired
    private CustomUserDetailsBusiness customUserDetailsBusiness;

    
    @GetMapping("/")
    public String principal(){
        return "loginConcursante";
    }
    
    @GetMapping("/loginConcursante")
    public String loginConcursante(){
        return "loginConcursante";
    }

    @GetMapping("/inicioConcursante")
    public String inicioConcursante(){
        return "inicioConcursante";
    }

    /*En el controlador, el método loginConcursantePost no realiza ninguna lógica de autenticación. Puedes ajustarlo para que Spring Security maneje el proceso de autenticación. Puedes eliminar este método del controlador si no necesitas realizar ninguna lógica adicional después del inicio de sesión.
    Además, ten en cuenta que en tu controlador 
    AuthConcursanteController, el método inicioConcursante debería 
    devolver simplemente el nombre de la vista, no una redirección, ya que Spring Security 
    se encargará de redirigir después del inicio de sesión exitoso.
    @PostMapping("/loginConcursante")
    public String loginConcursantePost(){
        return "loginConcursante";
    }
    
    /*@PostMapping ("/inicioConcursante")
    public String inicioConcursante (){
        return "inicioConcursante";
    }*/

}
