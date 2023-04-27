package com.shadowcrew.aulaVirtual.model;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false) // representa que este campo es obligatorio en base de datos
	@Column(name = "id")
	private Integer id;

	@Basic(optional = false)
	@Column(name = "nombres")
	private String nombres;

	@Basic(optional = false)
	@Column(name = "apellidos")
	private String apellidos;

	@Basic(optional = false)
	@Column(name = "email")
	private String email;

	@Basic(optional = false)
	@Column(name = "password")
	private String password;

	@JoinColumn(name = "rol_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Rol rol;
	
	

	public User() {

	}

	public User(String nombres, String apellidos, String email, String password,Rol rol) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.email = email;
		this.password = password;
		this.rol = rol;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	

}
