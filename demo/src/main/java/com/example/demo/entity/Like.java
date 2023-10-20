package com.example.demo.entity;

import java.time.LocalDate;

public class Like {
    private Visitante visitante;
    private LocalDate fecha;

    public Like (){
        fecha = LocalDate.now ();
    }

    public Visitante getVisitante() {
        return this.visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

}