package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Evaluacion {
    
    @Id
    private Long idEvaluacion;

    //Cada material puede tener varios evaluadores pero,
    //cada evaluador hace su propia evaluación. 
    @OneToOne
    @JoinColumn(name = "mailIdEvaluador", referencedColumnName = "mail") // Clave en Usuario
    private Usuario evaluador;
    
    @OneToOne
    @JoinColumn (name = "idMaterial")
    private MaterialEducativo material;
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
    public void setIdEvaluacion(Long idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public MaterialEducativo getMaterial() {
        return this.material;
    }

    public void setMaterial(MaterialEducativo material) {
        this.material = material;
    }


}
