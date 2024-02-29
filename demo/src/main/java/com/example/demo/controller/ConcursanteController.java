package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ConcursanteController {
    
    @PostMapping("/subirMaterial")
    public String handleFileUpload(@RequestParam("documento") MultipartFile file) {
        // Aquí puedes implementar la lógica para manejar el archivo cargado
        // Puedes acceder a los datos del archivo a través de la variable 'file'
        // Realiza las acciones necesarias, como guardar el archivo en el sistema de archivos o en una base de datos

        // Por ahora, solo redirigiremos a una página de éxito
        return "redirect:/inicioConcursante";
    }
}
