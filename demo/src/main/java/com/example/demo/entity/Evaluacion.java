package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Evaluacion {
    
    @Id
    private Long idEvaluacion;
    @OneToOne
    @JoinColumn(name = "mail") // Clave en Usuario
    private Usuario evaluador;
    @OneToOne
    @JoinColumn (name = "idMaterial")
    private Evaluacion evaluacion;
    //faltaria la rúbrica. 

    public Evaluacion() {
    }

    public Long getIdEvaluacion() {
        return this.idEvaluacion;
    }

    public Usuario getEvaluador() {
        return this.evaluador;
    }

    public void setEvaluador(Usuario evaluador) {
        this.evaluador = evaluador;
    }

}
