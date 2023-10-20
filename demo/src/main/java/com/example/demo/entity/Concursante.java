package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class Concursante extends Usuario {
    
    private MaterialEducativo material; //Un concursante presenta un material. 
                                        //Un material puede ser presentado por varios concursantes

    public Concursante() {
        super();
    }


    public MaterialEducativo getMaterialEducativo() {
        return this.material;
    }

    public void setProyecto(MaterialEducativo material) {
        this.material = material;
    }

    public void enviarMaterial(){

    }

}
