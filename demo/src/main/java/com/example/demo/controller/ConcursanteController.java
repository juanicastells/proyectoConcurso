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
    public String subirMaterial(/*@RequestParam("documento") MultipartFile file,*/
                                   @RequestParam("nombreMaterial") String nombreMaterial,
                                   @RequestParam("descripcion") String descripcion) {
        //necesito crearlo y persistirlo para que me genere el id el cual asocio con el usuario                     
        //faltaria poder tomar el id del usuario que en ese momento sube el material para luego asociarle el material.
        MaterialEducativo nuevoMaterial = materialEducativoBusiness.crearNuevoMaterial();
        System.out.println(nuevoMaterial.getIdMaterial());
        materialEducativoBusiness.actualizarMaterialEducativo(nuevoMaterial.getIdMaterial(), nombreMaterial, descripcion);
        return "redirect:/inicioConcursante";
    }
}
