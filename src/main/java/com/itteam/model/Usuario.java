package com.itteam.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    private String nombre;
    private String password;
    private String seguidos;
    private String publicacion;

    @OneToMany(mappedBy = "usuario")
    private List<Publicaciones> publicacioness;

    
    public Usuario(){

    }
    
    public Usuario(long id, String nombre, String password, String seguidos, String publicacion,
            List<Publicaciones> publicacioness) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.seguidos = seguidos;
        this.publicacion = publicacion;
        this.publicacioness = publicacioness;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getSeguidos() {
        return seguidos;
    }

    public void setSeguidos(String seguidos) {
        this.seguidos = seguidos;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public List<Publicaciones> getPublicacioness() {
        return publicacioness;
    }

    public void setPublicacioness(List<Publicaciones> publicacioness) {
        this.publicacioness = publicacioness;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", password=" + password + ", seguidos=" + seguidos
                + ", publicacion=" + publicacion + ", publicacioness=" + publicacioness + "]";
    }

    

    

    
    
}
