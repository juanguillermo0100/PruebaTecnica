package com.itteam.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itteam.models.Usuario;
import com.itteam.services.Serviceusuario;

@RestController
@RequestMapping("/usuarios")
public class Controlusuario {
    @Autowired
    Serviceusuario serviceusuario;

    @GetMapping()
    public ArrayList<Usuario> obtenerUsuarios(){
        return serviceusuario.obtenerUsuarios();
    }
    @PostMapping
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return this.serviceusuario.guardarUsuario(usuario);

    }
    @GetMapping(path = "/{id}")
    public Optional<Usuario> obtenerusuarioporId(@PathVariable("id") long id){
        return this.serviceusuario.obternerporId(id);
    }
    @GetMapping("/query")
    public ArrayList<Usuario> obtenerporNombre(@RequestParam("nombre") String nombre){
        return this.serviceusuario.obtenerporNombre(nombre);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarporId(@PathVariable("id") long id){
        boolean ok= this.serviceusuario.eliminarUsuario(id);
        if(ok){
            return "Se elimino el Usuario";

        }else{
        return "no se pudo eliminar el usuario";
        }
    }
}
