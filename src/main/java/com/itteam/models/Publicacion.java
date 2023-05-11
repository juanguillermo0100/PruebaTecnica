package com.itteam.models;

import jakarta.persistence.*;

import jakarta.persistence.Table;

@Entity
@Table(name = "publicaciones")

public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String titulo;
    private String descripcion;

    @ManyToOne
    private Usuario usuario;

    
    public Publicacion() {
    }


    public Publicacion(long id, String titulo, String descripcion, Usuario usuario) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.usuario = usuario;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    @Override
    public String toString() {
        return "Publicacion [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", usuario=" + usuario
                + "]";
    }


}
