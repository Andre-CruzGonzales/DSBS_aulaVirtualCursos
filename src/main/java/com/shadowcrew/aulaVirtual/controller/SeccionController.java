package com.shadowcrew.aulaVirtual.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shadowcrew.aulaVirtual.model.Seccion;
import com.shadowcrew.aulaVirtual.services.SeccionServices;

import java.util.List;

@Controller
@RequestMapping("/seccion")
public class SeccionController {



    @Autowired // Inyección de Depencia
    private SeccionServices servicio;


    @RequestMapping("/Listageneral")
    public String listarPeliculas (Model model) {

        List<Seccion> listaPeliculas = servicio.buscarTodo();
        System.out.println("LISTA DE PELICULAS : " + listaPeliculas);
        model.addAttribute("listaPeliculas", listaPeliculas);
        return "/moduloPeliculas/Listageneral";
    }

    @RequestMapping("/nuevo")
    public String nuevaPelicula(Model model) {
        Seccion pelicula = new Seccion ();
        model.addAttribute("pelicula",pelicula);
        return "/moduloPeliculas/nuevaPelicula";
    }

    @RequestMapping(value ="/guardar", method= RequestMethod.POST)
    public String crearPelicula(@ModelAttribute("pelicula") Seccion seccion) {
        servicio.crear(seccion);
        return "redirect:/seccion/Listageneral";

    }

    @RequestMapping(value ="/actualizar/{id}")
    public ModelAndView editarPelicula(@PathVariable(name="id") int id) {
        ModelAndView mav = new ModelAndView("/moduloPeliculas/editarPelicula");
        Seccion pelicula = servicio.buscarPorId(id);
        mav.addObject("pelicula",pelicula);
        return mav;
    }

    @RequestMapping(value = "/eliminar/{id}")
    public String elimnarPelicula(@PathVariable(name="id") int id) {
        servicio.borrarPorId(id);
        return "redirect:/peliculas/listarTodo";
    }

}