package com.shadowcrew.aulaVirtual.modelo;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper=false)
@Builder
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name="user")
@NamedQueries({
        @NamedQuery(name = "Usuario.findAdll", query = "SELECT p FROM Usuario p")
        ,@NamedQuery(name = "Usuario.findByIduser", query="SELECT p FROM Usuario p WHERE p.idUser = :idUser")
        ,@NamedQuery(name = "Usuario.findByUsername", query="SELECT p FROM Usuario p WHERE p.username = :username")
        ,@NamedQuery(name = "Usuario.findByPassword", query="SELECT p FROM Usuario p WHERE p.password = :password")
        ,@NamedQuery(name = "Usuario.findByNombuser", query="SELECT p FROM Usuario p WHERE p.nombuser = :nombuser")
        ,@NamedQuery(name = "Usuario.findByApelluser", query="SELECT p FROM Usuario p WHERE p.apelluser = :apelluser")
        ,@NamedQuery(name = "Usuario.findByTelefono", query="SELECT p FROM Usuario p WHERE p.telefono = :telefono")
        ,@NamedQuery(name = "Usuario.findByCodperf", query="SELECT p FROM Usuario p WHERE p.codperf = :codperf")

})




public class Usuario implements Serializable {
    private static final long serialVersionUID=1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUser")
    private Integer idUser;

    @Basic(optional = false)
    @Column(name = "username")
    private String username;

    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    @Basic(optional = false)
    @Column(name = "nombuser")
    private String nombuser ;

    @Basic(optional = false)
    @Column(name = "apelluser")
    private String apelluser;

    @Basic(optional = false)
    @Column(name = "correo")
    private String correo;

    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;

    @Basic(optional = false)
    @Column(name = "codperf")
    private String codperf;

    //@JoinColumn(name = "curso", referencedColumnName = "idCurso")
   // @ManyToOne(optional = false)
//    private Curso curso;

    //@JoinColumn(name = "secciones", referencedColumnName = "idSecciones")
    //@ManyToOne(optional = false)
    //private Secciones secciones;




















}
