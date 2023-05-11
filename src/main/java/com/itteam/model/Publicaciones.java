package com.itteam.model;

import jakarta.persistence.*;

import jakarta.persistence.Table;

@Entity
@Table(name = "publicaciones")

public class Publicaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long idusuario;
    private String titulo;
    private String descripcion;

    @ManyToOne
    private Usuario usuario;

    
    public Publicaciones() {
    }
    
    public Publicaciones(long id, long idusuario, String titulo, String descripcion, Usuario usuario) {
        this.id = id;
        this.idusuario = idusuario;
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

     public long getIdusuario() {
        return idusuario;
    }
    public void setIdusuario(long idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Publicaciones [id=" + id + ", idusuario=" + idusuario + ", titulo=" + titulo + ", descripcion="
                + descripcion + "]";
    }
   

    
}
