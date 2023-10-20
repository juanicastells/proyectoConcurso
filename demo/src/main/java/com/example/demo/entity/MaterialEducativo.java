package com.example.demo.entity;

import java.util.ArrayList;

public class MaterialEducativo {
    private ArrayList <Concursante> concursantes; //un material es de uno o varios concursantes.
    private ArrayList <Like> likes; //cantidad de likes. 
    private Evaluador evaluador;

    public MaterialEducativo() {
        likes = new ArrayList <Like> (null);
    }


    public ArrayList<Concursante> getConcursantes() {
        return this.concursantes;
    }

    public void setConcursantes(ArrayList<Concursante> concursantes) {
        this.concursantes = concursantes;
    }

    public ArrayList <Like> getLikes() {
        return this.likes;
    }

    public Evaluador getEvaluador() {
        return this.evaluador;
    }

    public void setEvaluador(Evaluador evaluador) {
        this.evaluador = evaluador;
    }

    public int cantidadLikes (){
        return likes.size();
    }

    public void agregarConcursante (Concursante concursante){
        concursantes.add (concursante);        
    }
}
