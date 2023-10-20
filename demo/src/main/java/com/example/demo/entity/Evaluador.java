package com.example.demo.entity;

public class Evaluador extends Usuario {
    
    private MaterialEducativo materialAsignado; //Un evaluador tiene solo un material educativo asignado
                                                //Los materiales solo tienen un evaluador
    private Rubrica rubrica;


    public Evaluador() {
    }


    public MaterialEducativo getMaterialAsignado() {
        return this.materialAsignado;
    }

    public void setMaterialAsignado(MaterialEducativo materialAsignado) {
        this.materialAsignado = materialAsignado;
    }

    public Rubrica getRubrica() {
        return this.rubrica;
    }

    public void setRubrica(Rubrica rubrica) {
        this.rubrica = rubrica;
    }

}
