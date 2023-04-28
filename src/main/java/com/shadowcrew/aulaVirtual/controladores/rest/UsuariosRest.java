package com.shadowcrew.aulaVirtual.controladores.rest;

import com.shadowcrew.aulaVirtual.modelo.Usuario;
import com.shadowcrew.aulaVirtual.servicios.UsuariosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsuariosRest {
    @Autowired
    private UsuariosServicios servicio;

    @GetMapping
    public ResponseEntity<Object>buscarTodo(){
        List<Usuario> listaUsuarios = servicio.buscarTodo();
        System.out.println("Lista de Usuarios: " + listaUsuarios);
        return new ResponseEntity<Object>(listaUsuarios, HttpStatus.OK);
    }


    @GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseEntity<Object>buscarPorId(@PathVariable("id")int id){
        Usuario users = servicio.buscarPorId(id);
        if (users == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Funcion no encontrada, ID porporcionado no es correcto");
        return new ResponseEntity<Object>(users, HttpStatus.OK);
    }


    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public  ResponseEntity <Object> crear (@RequestBody Usuario users){

        servicio.crear(users);
        return new ResponseEntity<Object>("Funcion creada correctamente", HttpStatus.OK);
    }


    @PutMapping (value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE },
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
    )
    public ResponseEntity<Object> actualizar(@PathVariable("id") int id, @RequestBody Usuario users){

        servicio.actualizar(users);
        return new ResponseEntity<Object>("Funcion actualizada correctamente", HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Object> eliminar(@PathVariable("id") int id) {
        servicio.eliminarUsuario(id);
        return new ResponseEntity<Object>("Funcion eliminada correctamente", HttpStatus.OK);
    }
}
