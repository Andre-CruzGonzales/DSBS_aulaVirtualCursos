package com.shadowcrew.aulaVirtual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shadowcrew.aulaVirtual.model.Rol;
import com.shadowcrew.aulaVirtual.services.RolServices;


@RestController
@RequestMapping("/api/rol")
public class RolController {
	@Autowired
	private RolServices service;
	
	@GetMapping
	public ResponseEntity<Object> all(){
		List<Rol> roles = service.all();
		return new ResponseEntity<>(roles ,HttpStatus.OK);
	}
}