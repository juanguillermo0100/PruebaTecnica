package com.itteam.model;

public class Publicaciones {
    private long id;
    private long usuario;
    private String titulo;
    private String descripcion;
    public Publicaciones() {
    }
    public Publicaciones(long id, long usuario, String titulo, String descripcion) {
        this.id = id;
        this.usuario = usuario;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getUsuario() {
        return usuario;
    }
    public void setUsuario(long usuario) {
        this.usuario = usuario;
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
    @Override
    public String toString() {
        return "Publicaciones [id=" + id + ", usuario=" + usuario + ", titulo=" + titulo + ", descripcion="
                + descripcion + "]";
    }

    
}
