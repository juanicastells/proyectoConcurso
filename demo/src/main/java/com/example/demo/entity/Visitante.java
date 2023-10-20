package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class Visitante extends Usuario {
    //los visitantes deben esatr registrados para poder votar. 

    private Like like;
    private boolean dioLike; //A determinar, ¿puede darle like solo a varios proyectos 
                            //pero no mas de un like a cada uno?


    public Visitante() {
        dioLike = false;
    }

    public Like getLike() {
        return this.like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    public boolean isDioLike() {
        return this.dioLike;
    }

    public boolean getDioLike() {
        return this.dioLike;
    }

    public void setDioLike(boolean dioLike) {
        this.dioLike = dioLike;
    }
    
    public void darLike (MaterialEducativo material){
        Like like = new Like();
        like.setMaterial(material);
        like.setVisitante(this);
    }
}
