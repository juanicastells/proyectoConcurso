package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.business.MaterialEducativoBusiness;
import com.example.demo.entity.MaterialEducativo;

@Controller
public class ConcursanteController {
    
    @Autowired
    MaterialEducativoBusiness materialEducativoBusiness;

    @PostMapping("/subirMaterial")
    public String handleFileUpload(@RequestParam("documento") MultipartFile file) {
        //crear un objeto material educativo
        MaterialEducativo nuevoMaterial = materialEducativoBusiness.crearNuevoMaterial();
        System.out.println(nuevoMaterial.getId());
        return "redirect:/inicioConcursante";
    }
}
