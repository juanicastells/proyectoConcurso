package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class inicioConcursanteController {
    @GetMapping("/inicioConcursante")
    public String inicioConcursante(){
        return "inicioConcursante";
    }

    @GetMapping("/panelSubirMaterial")
        public String panelSubirMaterial(){
            return "panelSubirMaterial";
        }
    
}
