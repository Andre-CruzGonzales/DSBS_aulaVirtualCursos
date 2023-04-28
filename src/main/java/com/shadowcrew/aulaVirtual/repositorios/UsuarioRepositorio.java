package com.shadowcrew.aulaVirtual.repositorios;

import com.shadowcrew.aulaVirtual.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepositorio  extends CrudRepository<Usuario, Integer> {
}
