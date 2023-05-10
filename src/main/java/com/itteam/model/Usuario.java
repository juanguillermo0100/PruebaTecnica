package com.itteam.model;

public class Usuario {
    private long id;
    private String nombre;
    private String password;
    private String seguidos;
    private String publicaciones;

   

    public String getpublicaciones() {
        return publicaciones;
    }

    public void setpublicaciones(String publicaciones) {
        this.publicaciones = publicaciones;
    }

    public Usuario(){

    }
    
    public Usuario(Long id, String nombre, String password,String seguidos,String publicaciones) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.seguidos=seguidos;
        this.publicaciones=publicaciones;
    }
    public String getseguidos() {
        return seguidos;
    }
    public void setseguidos(String seguidos) {
        this.seguidos = seguidos;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", password=" + password + ", seguidos=" + seguidos
                + ", publicaciones=" + publicaciones + "]";
    }

    
    
}
