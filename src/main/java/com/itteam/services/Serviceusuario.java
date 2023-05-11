package com.itteam.services;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itteam.models.Usuario;
import com.itteam.repositories.UsuarioRepository;

@Service
public class Serviceusuario {
    @Autowired
    UsuarioRepository repousuario;

    public ArrayList<Usuario> obtenerUsuarios(){
        return (ArrayList<Usuario>) repousuario.findAll();
    }
    public Usuario guardarUsuario(Usuario usuario){
        return repousuario.save(usuario);
    }

    public Optional<Usuario> obternerporId(long id){
        return repousuario.findById(id);
    }
    public ArrayList<Usuario> obtenerporNombre(String nombre){
        return repousuario.findByNombre(nombre);
    }
    public boolean eliminarUsuario(long id){
        try{
            repousuario.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
