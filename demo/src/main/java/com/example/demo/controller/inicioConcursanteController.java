package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class inicioConcursanteController {
    @GetMapping("/inicioConcursante")
    public String inicioConcursante(){
        return "inicioConcursante";
    }

    @PostMapping("/inicioConcursante")
    public String inicioConcursantePost(){
        return "inicioConcursante";
    }

    @GetMapping("/panelSubirMaterial")
        public String panelSubirMaterial(){
            return "panelSubirMaterial";
    }
    
}
