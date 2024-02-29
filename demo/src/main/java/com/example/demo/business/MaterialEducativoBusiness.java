package com.example.demo.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MaterialEducativo;
import com.example.demo.repository.MaterialEducativoRepository;

@Service
public class MaterialEducativoBusiness {
    
    @Autowired
    MaterialEducativoRepository materialEducativoRepository;

    public MaterialEducativo crearNuevoMaterial (){
        MaterialEducativo nuevoMaterial = new MaterialEducativo();
        materialEducativoRepository.save(nuevoMaterial);
        return nuevoMaterial;
    }
}