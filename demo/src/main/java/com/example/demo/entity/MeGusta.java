package com.example.demo.entity;

import jakarta.persistence.*;

@Entity 
public class MeGusta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMegusta;
    @OneToOne
    @JoinColumn (name = "mail")
    private Usuario visitante;
    @OneToOne
    @JoinColumn (name = "idMaterial")
    private MaterialEducativo material;
    
    public MeGusta() {
    
    }

    public Long getIdMeGusta() {
        return this.idMegusta;
    }

    public Usuario getVisitante() {
        return this.visitante;
    }

    public void setVisitante(Usuario visitante) {
        this.visitante = visitante;
    }

    public MaterialEducativo getMaterial() {
        return this.material;
    }

    public void setMaterial(MaterialEducativo material) {
        this.material = material;
    }
 
}
