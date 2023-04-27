package com.shadowcrew.aulaVirtual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shadowcrew.aulaVirtual.model.Tema;
import com.shadowcrew.aulaVirtual.repository.TemaRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class TemaServices {
	@Autowired
	private TemaRepository repository;
	
	public TemaServices() {}
	
	public List<Tema> all(){
		return (List<Tema>) repository.findAll();
	}
}