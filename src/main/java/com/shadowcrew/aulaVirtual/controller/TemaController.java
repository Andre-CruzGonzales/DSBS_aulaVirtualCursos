package com.shadowcrew.aulaVirtual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shadowcrew.aulaVirtual.model.Tema;
import com.shadowcrew.aulaVirtual.services.TemaServices;

@RestController
@RequestMapping("/api/tema")
public class TemaController {
	@Autowired
	private TemaServices service;
	
	@GetMapping
	public ResponseEntity<Object> all(){
		List<Tema> temas = service.all();
		return new ResponseEntity<>(temas ,HttpStatus.OK);
	}
}