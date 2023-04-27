package com.shadowcrew.aulaVirtual.modelo;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="curso")
@NamedQueries({
        @NamedQuery(name = "Curso.findAdll", query = "SELECT p FROM Curso p")
        ,@NamedQuery(name = "Curso.findByIdcurso", query="SELECT p FROM Curso p WHERE p.idCurso = :idCurso")
        ,@NamedQuery(name = "Curso.findByNombre", query="SELECT p FROM Curso p WHERE p.nombre = :nombre")
        ,@NamedQuery(name = "Curso.findByCodcurso", query="SELECT p FROM Curso p WHERE p.codcurso = :codcurso")
        ,@NamedQuery(name = "Curso.findByDescripcion", query="SELECT p FROM Curso p WHERE p.descripcion = :descripcion")
        ,@NamedQuery(name = "Curso.findByDocente", query="SELECT p FROM Curso p WHERE p.docente = :docente")
        ,@NamedQuery(name = "Curso.findByTemario", query="SELECT p FROM Curso p WHERE p.temario = :temario")
        ,@NamedQuery(name = "Curso.findByImg", query="SELECT p FROM Curso p WHERE p.img = :img")


})
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false) //representa que este campo es obligatorio en base de datos
    @Column(name ="idCurso")
    private Integer idCurso;

    @Basic(optional = false)
    @Column(name ="nombre")
    private String nombre;

    @Column(name="codcurso")
    private String codcurso;

    @Column(name= "descripcion")
    private String descripcion;

    @Column(name="docente")
    private String docente;

    @Column(name= "temario")
    private String temario;

    @Column(name= "img")
    private String img;

    public Curso() {

    }
    public Curso(Integer idCurso, String nombre) {

        this.idCurso = idCurso;
        this.nombre = nombre;
    }

    public Curso(String nombre, String codcurso, String descripcion, String docente, String temario, String img) {
        super();
        this.nombre = nombre;
        this.codcurso = codcurso;
        this.descripcion = descripcion;
        this.docente = docente;
        this.temario = temario;
        this.img = img;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodcurso() {
        return codcurso;
    }

    public void setCodcurso(String codcurso) {
        this.codcurso = codcurso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getTemario() {
        return temario;
    }

    public void setTemario(String temario) {
        this.temario = temario;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }



    @Override
    public int hashCode() {
        return Objects.hash(idCurso);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        return Objects.equals(idCurso, other.idCurso);
    }

    @Override
    public String toString() {
        return "Curso [idCurso=" + idCurso + "]";
    }


    public Curso buscarPorID(int i) {
        return null;
    }

}
