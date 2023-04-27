package com.shadowcrew.aulaVirtual.model;
import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


@Entity
@Table(name = "tema")
@NamedQueries ({
	@NamedQuery(name = "Tema.findAll", query = "SELECT p FROM Tema p")
	,@NamedQuery(name = "Tema.findByIdtema", query = "SELECT P FROM Tema p WHERE p.idTema = :idTema")
	,@NamedQuery(name = "Tema.findByNombre", query = "SELECT P FROM Tema p WHERE p.nombre = :nombre")
	,@NamedQuery(name = "Tema.findByDuracion", query = "SELECT P FROM Tema p WHERE p.duracion= :duracion")
	,@NamedQuery(name = "Tema.findByDescripcion", query = "SELECT P FROM Tema p WHERE p.descripcion = :descripcion")
	,@NamedQuery(name = "Tema.findByPrecio", query = "SELECT P FROM Tema p WHERE p.precio= :precio")
	,@NamedQuery(name = "Tema.findByContenido", query = "SELECT P FROM Tema p WHERE p.contenido= :contenido")
	
})
public class Tema implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idTema")
	private Integer idTema;
	
	@Basic(optional = false)
	@Column(name = "nombre")
	private String nombre;
	
	@Basic(optional = false)
	@Column(name = "duracion")
	private String duracion;
	
	@Basic(optional = false)
	@Column(name = "descripcion")
	private String descripcion;
	
	@Basic(optional = false)
	@Column(name = "precio")
	private String precio;
	
	@Basic(optional = false)
	@Column(name = "contenido")
	private String contenido;
}