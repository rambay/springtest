package com.empresa.iglesia.repository;

import com.empresa.iglesia.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {
}
