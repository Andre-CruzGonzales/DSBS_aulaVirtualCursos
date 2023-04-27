package com.shadowcrew.aulaVirtual.model;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="rol")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Basic(optional = false) //representa que este campo es obligatorio en base de datos
	 @Column(name ="id")
	 private Integer id;
	 
	 @Basic(optional = false)
	 @Column(name ="nombre")
	 private String nombre;

	public Rol() {
		
	}

	public Rol(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Rol(Integer id,String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	 
	 

}
