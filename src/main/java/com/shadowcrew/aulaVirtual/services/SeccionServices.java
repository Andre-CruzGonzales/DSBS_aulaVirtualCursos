package com.shadowcrew.aulaVirtual.services;




import org.springframework.beans.factory.annotation.Autowired;

import com.shadowcrew.aulaVirtual.model.Seccion;
import com.shadowcrew.aulaVirtual.repository.SeccionRepository;

import java.util.List;

public class SeccionServices {


    @Autowired // Inyección de dependencia
    private SeccionRepository repositorio;

    public SeccionServices() {

    }

    public List<Seccion> buscarTodo(){
        return (List<Seccion>) repositorio.findAll();
    }

    public Seccion seccion(Seccion seccionActualizar) {

        Seccion seccionActual = repositorio.findById(seccionActualizar.getIdPelicula()).get();

        //peliculaActual.setIdPelicula(peliculaActualizar.getIdPelicula());
        seccionActual.setDiseño(seccionActualizar.getDiseño());
        seccionActual.setMobile(seccionActualizar.getMobile());
        seccionActual.setArquitectura(seccionActualizar.getArquitectura());
        seccionActual.setQa(seccionActualizar.getQa());
        seccionActual.setMetodologiasagiles(seccionActualizar.getMetodologiasagiles());


        Seccion peliculaActualizado = repositorio.save(peliculaActual); // registra en base de datos
        return peliculaActualizado;


    }


    public Seccion crear(Seccion seccion) {
        return repositorio.save(seccion);
    }

    public Seccion buscarPorId(Integer id) {
        return repositorio.findById(id).get();
    }

    public void borrarPorId(Integer id) {
        repositorio.deleteById(id);

    }
}
