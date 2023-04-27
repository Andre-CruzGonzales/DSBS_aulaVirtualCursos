package com.shadowcrew.aulaVirtual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shadowcrew.aulaVirtual.model.Rol;
import com.shadowcrew.aulaVirtual.repository.RolRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class RolServices {
	@Autowired
	private RolRepository repository;
	
	public RolServices() {}
	
	public List<Rol> all(){
		return (List<Rol>) repository.findAll();
	}
}