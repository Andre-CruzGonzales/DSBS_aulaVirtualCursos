package com.shadowcrew.aulaVirtual.model;


import jakarta.persistence.*;
import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;



    @Entity
    @Table(name="seccion")
    @NamedQueries({
            @NamedQuery(name = "seccion.findAdll", query = "SELECT p FROM Seccion p")
            ,@NamedQuery(name = "seccion.findBydiseño", query="SELECT p FROM Seccion p WHERE p.diseño = :diseño")
            ,@NamedQuery(name = "seccion.findBymobile", query="SELECT p FROM Seccion p WHERE p.mobile = :mobile")
            ,@NamedQuery(name = "seccion.findByarquitectura", query="SELECT p FROM Seccion p WHERE p.arquitectura = :arquitectura")
            ,@NamedQuery(name = "Pelicula.findByqa", query="SELECT p FROM Seccion p WHERE p.qa = :qa")
            ,@NamedQuery(name = "Pelicula.findBymetodologiasagiles", query="SELECT p FROM Seccion p WHERE p.metodologiasagiles = :metodologiasagiles")

    })
    public class Seccion implements Serializable {


        private static final long serialVersionUID = 1L;

        @Basic(optional = false)
        @Column(name ="diseño")
        private String diseño;

        @Column(name="mobile")
        private String mobile;

        @Column(name= "arquitectura")
        private String arquitectura;

        @Column(name="qa")
        private String qa;

        @Column(name= "metodologiasagiles")
        private String metodologiasagiles;


        public Seccion() {

        }

        public String getDiseño() {
            return diseño;
        }

        public void setDiseño(String diseño) {
            this.diseño = diseño;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getArquitectura() {
            return arquitectura;
        }

        public void setArquitectura(String arquitectura) {
            this.arquitectura = arquitectura;
        }

        public String getQa() {
            return qa;
        }

        public void setQa(String qa) {
            this.qa = qa;
        }

        public String getMetodologiasagiles() {
            return metodologiasagiles;
        }

        public void setMetodologiasagiles(String metodologiasagiles) {
            this.metodologiasagiles = metodologiasagiles;
        }

 //       public Secciones(Integer idPelicula, String nombre) {
//
//            this.idPelicula = idPelicula;
//        this.nombre = nombre;
 //       }

        public Seccion(String diseño, String mobile, String arquitectura, String qa, String metodologiasagiles) {
            super();
            this.diseño = diseño;
            this.mobile = mobile;
            this.arquitectura = arquitectura;
            this.qa = qa;
            this.metodologiasagiles = metodologiasagiles;

        }





        public Seccion buscarPorID(int i) {
            return null;
        }

    }