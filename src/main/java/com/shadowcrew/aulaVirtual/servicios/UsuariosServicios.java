package com.shadowcrew.aulaVirtual.servicios;
import com.shadowcrew.aulaVirtual.modelo.Usuario;
import com.shadowcrew.aulaVirtual.repositorios.UsuarioRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional

public class UsuariosServicios {
    @Autowired
    public UsuarioRepositorio repositorio;

    public Usuario crear(Usuario usuario) {return repositorio.save(usuario);}

    public List<Usuario> buscarTodo(){return(ArrayList<Usuario>) repositorio.findAll();}

    public Usuario buscarPorId (Integer id) {return repositorio.findById(id).get();}

    public Usuario actualizar (Usuario usuarioActualizar){
        Usuario usuarioActual = repositorio.findById(usuarioActualizar.getIdUser()).get();
        usuarioActual.setIdUser(usuarioActualizar.getIdUser());
        usuarioActual.setUsername(usuarioActualizar.getUsername());
        usuarioActual.setPassword(usuarioActualizar.getPassword());
        usuarioActual.setNombuser(usuarioActualizar.getNombuser());
        usuarioActual.setApelluser(usuarioActualizar.getApelluser());
        usuarioActual.setCorreo(usuarioActualizar.getCorreo());
        usuarioActual.setTelefono(usuarioActualizar.getTelefono());
        usuarioActual.setCodperf(usuarioActualizar.getCodperf());

        Usuario usuarioActualizado = repositorio.save(usuarioActual);
        return usuarioActualizado;
    }

    public void eliminarUsuario(Integer id){repositorio.deleteById(id);}

    public void actualizar(int id, Usuario users) {
        Usuario usuarioActual = repositorio.findById(id).get();
        usuarioActual.setIdUser(users.getIdUser());
        usuarioActual.setUsername(users.getUsername());
        usuarioActual.setPassword(users.getPassword());
        usuarioActual.setNombuser(users.getNombuser());
        usuarioActual.setApelluser(users.getApelluser());
        usuarioActual.setCorreo(users.getCorreo());
        usuarioActual.setTelefono(users.getTelefono());
        usuarioActual.setCodperf(users.getCodperf());
        repositorio.save(usuarioActual);

    }
}


