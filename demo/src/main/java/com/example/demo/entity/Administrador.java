package com.example.demo.entity;

import java.util.ArrayList;

public class Administrador extends Usuario{


    public Administrador (){
        super();
    }
    
    public void asignarRol (Visitante usuarioVisante){
        //se le asigna un rol un usuario previamente registrado. Evaluador o Concursante
    }

    public void asignarMaterialAEvaluador (MaterialEducativo material, Evaluador evaluador){

    }

    public void agregarMaterialAConcursar (MaterialEducativo material){
        //se agrega luego de ser seleccionado por la comisión. 
    }

    public void publicarMaterialesSeleccionados (ArrayList <MaterialEducativo> materiales){

    }

    public void publicarMaterialGanador (MaterialEducativo material){

    }
}