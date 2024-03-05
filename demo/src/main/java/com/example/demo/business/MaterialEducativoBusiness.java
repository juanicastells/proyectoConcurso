package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MaterialEducativo;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.MaterialEducativoRepository;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
public class MaterialEducativoBusiness {
    
    @Autowired
    MaterialEducativoRepository materialEducativoRepository;

    public MaterialEducativo crearNuevoMaterial (/*Usuario autorMaterial*/){
        MaterialEducativo nuevoMaterial = new MaterialEducativo();
        //autorMaterial.setMaterialEducativo(nuevoMaterial);
        return materialEducativoRepository.save(nuevoMaterial);
    }

    public MaterialEducativo actualizarMaterialEducativo (Long idMaterial, String nuevoNombre, String nuevaDescripcion) /*MultipartFile documento)*/{
        MaterialEducativo materialEducativo = materialEducativoRepository.findById(idMaterial).orElse(null);
        if (materialEducativo != null) {
            materialEducativo.setNombre(nuevoNombre);
            materialEducativo.setDescripcion(nuevaDescripcion);
            //materialEducativo.setArchivoMaterial(documento);
            return materialEducativoRepository.save(materialEducativo);
        } else {
            return null;
        }
    }
}