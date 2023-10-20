package com.example.demo.entity;


import jakarta.persistence.*;
import jakarta.persistence.MappedSuperclass;


/*con @MappedSuperclass, lo que se indica es que esta clase no se mapeará directamente a 
una tabla, pero sus atributos serán heredados por las clases hijas que se mapearán a tablas.*/

@MappedSuperclass
public class Usuario{
    @Id
    private long id;
    private String apellidoNombre;
    private String mail;
    private String pass;
    

    public Usuario() {
    }
    

    public long getId() {
        return this.id;
    }

    /*public void setId(long id) {
        this.id = id;
    }*/

    public String getApellidoNombre() {
        return this.apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}