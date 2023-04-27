package com.shadowcrew.aulaVirtual.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shadowcrew.aulaVirtual.model.User;
import com.shadowcrew.aulaVirtual.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServices {
	
	@Autowired
	private UserRepository repository;
	public UserServices() {
		
	}
	public List<User> all(){
		return (List<User>) repository.findAll();
	}
	public User findById(Integer id) {
		return repository.findById(id).get();
	}
	public User crear(User funciones) {
		return repository.save(funciones);
	}

}
