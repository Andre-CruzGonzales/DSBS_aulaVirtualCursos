package com.shadowcrew.aulaVirtual.modelo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="secciones")
@NamedQueries({
        @NamedQuery(name = "Secciones.findAdll", query = "SELECT p FROM Secciones p")
        ,@NamedQuery(name = "Secciones.findByIdsecciones", query="SELECT p FROM Secciones p WHERE p.idSecciones = :idSecciones")
        ,@NamedQuery(name = "Secciones.findByDiseño", query="SELECT p FROM Secciones p WHERE p.diseño = :diseño")
        ,@NamedQuery(name = "Secciones.findByMobile", query="SELECT p FROM Secciones p WHERE p.mobile = :mobile")
        ,@NamedQuery(name = "Secciones.findByArquitectura", query="SELECT p FROM Secciones p WHERE p.arquitectura = :arquitectura")
        ,@NamedQuery(name = "Secciones.findByQa", query="SELECT p FROM Secciones p WHERE p.qa = :qa")
        ,@NamedQuery(name = "Secciones.findByMetodologiasagiles", query="SELECT p FROM Secciones p WHERE p.metodologiasagiles = :metodologiasagiles")})

public class Secciones implements Serializable {
    private static final long serialVersionUID=1l;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSecciones")
    private Integer idSecciones;

    @Basic(optional = false)
    @Column(name = "diseño")
    private String diseño;

    @Basic(optional = false)
    @Column(name = "mobile")
    private String mobile;

    @Basic(optional = false)
    @Column(name = "arquitectura")
    private String arquitectura;

    @Basic(optional = false)
    @Column(name = "qa")
    private String qa;

    @Basic(optional = false)
    @Column(name = "metodologiasagiles")
    private String metodologiasagiles;


}
