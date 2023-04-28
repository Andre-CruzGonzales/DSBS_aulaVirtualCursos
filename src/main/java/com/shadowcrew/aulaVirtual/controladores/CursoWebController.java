package com.shadowcrew.aulaVirtual.controladores;

import com.shadowcrew.aulaVirtual.modelo.Curso;
import com.shadowcrew.aulaVirtual.servicios.CursosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/cursos")
public class CursoWebController {

    @Autowired // Inyección de Depencia
    private CursosServicios servicio;


    @RequestMapping("/listarTodo")
    //public ResponseEntity<Object> listarCursos(Model model){
    public String listarCursos (Model model) {

        List <Curso> listaCursos = servicio.buscarTodo();
        System.out.println("Lista de cursos disponibles : " + listaCursos);
        //return new Response<>(listaCursos, HttpStatus.OK);
        model.addAttribute("listaCursos", listaCursos);
       return "/moduloCursos/listarTodo";

    }

    @RequestMapping("/nuevo")
    public String nuevoCurso(Model model) {
        Curso curso = new Curso ();
        model.addAttribute("curso",curso);
        return "/moduloCursos/nuevaCurso";
    }

    @RequestMapping(value ="/guardar", method= RequestMethod.POST)
    public String crearCurso(@ModelAttribute("curso") Curso curso) {
        servicio.crear(curso);
        return "redirect:/cursos/listarTodo";

    }

    @RequestMapping(value ="/actualizar/{id}")
    public ModelAndView editarCurso(@PathVariable(name="id") int id) {
        ModelAndView mav = new ModelAndView("/moduloCursos/editarCurso");
        Curso curso = servicio.buscarPorId(id);
        mav.addObject("curso",curso);
        return mav;
    }

    @RequestMapping(value = "/eliminar/{id}")
    public String elimnarCurso(@PathVariable(name="id") int id) {
        servicio.borrarPorId(id);
        return "redirect:/cursos/listarTodo";
    }

}
