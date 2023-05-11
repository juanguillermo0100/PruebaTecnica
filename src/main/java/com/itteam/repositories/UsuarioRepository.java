package com.itteam.repositories;



import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itteam.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    public abstract Optional<Usuario> findById(long id);

    public abstract ArrayList<Usuario> findByNombre(String nombre);

}
