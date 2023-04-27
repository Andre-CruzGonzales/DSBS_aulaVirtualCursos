package com.shadowcrew.aulaVirtual.servicios;


import com.shadowcrew.aulaVirtual.modelo.Curso;
import com.shadowcrew.aulaVirtual.repositorios.CursoRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CursosServicios {
    @Autowired // Inyección de dependencia
    private CursoRepositorio repositorio;

    public CursosServicios() {

    }

    public List<Curso> buscarTodo(){
        return (List<Curso>) repositorio.findAll();
    }

    public Curso actualizar(Curso cursoActualizar) {

        Curso cursoActual = repositorio.findById(cursoActualizar.getIdCurso()).get();

        //peliculaActual.setIdPelicula(peliculaActualizar.getIdPelicula());
        cursoActual.setNombre(cursoActualizar.getNombre());
        cursoActual.setCodcurso(cursoActualizar.getCodcurso());
        cursoActual.setDescripcion(cursoActualizar.getDescripcion());
        cursoActual.setDocente(cursoActualizar.getDocente());
        cursoActual.setTemario(cursoActualizar.getTemario());
        cursoActual.setImg(cursoActualizar.getImg());

        Curso cursoActualizado = repositorio.save(cursoActual); // registra en base de datos
        return cursoActualizado;

    }


    public Curso crear(Curso curso) {
        return repositorio.save(curso);
    }

    public Curso buscarPorId(Integer id) {
        return repositorio.findById(id).get();
    }

    public void borrarPorId(Integer id) {
        repositorio.deleteById(id);

    }

}

