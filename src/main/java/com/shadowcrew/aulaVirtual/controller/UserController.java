package com.shadowcrew.aulaVirtual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import com.shadowcrew.aulaVirtual.model.User;
import org.springframework.web.server.ResponseStatusException;

import com.shadowcrew.aulaVirtual.services.UserServices;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserServices service;
	
	@GetMapping
	public ResponseEntity<Object> all(){
		List<User> users = service.all();
		return new ResponseEntity<>(users ,HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseEntity<Object> findById(@PathVariable("id") int id) {
		User user = service.findById(id);
		if (user == null)

			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
					"Funcion no encontrada,id porporcionado no es correcto");
		return new ResponseEntity<Object>(user, HttpStatus.OK);

	}
	
	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, 
            consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }
		)
	public  ResponseEntity <Object> crear (@RequestBody User newUser){
	
	    service.crear(newUser);
	    return new ResponseEntity<Object>("Usuario creada correctamente", HttpStatus.OK);

}

}
