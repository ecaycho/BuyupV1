/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.castell.model;


import java.io.Serializable;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author rtorres
 */
@Entity
@Table(name = "bitacora")
public class Bitacora implements Serializable {

    private Long id;
    
    private String tipo;
    
    private Date fecha_hora;
    
    private Date fecha_registro;
    
    private String email;
    
    private String telefono;
    
    private String comentario;
    
    private ProspectoVenta prospectoVenta;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "tipo")
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Column(name = "fecha_hora")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    @Column(name = "fecha_registro")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Column(name = "comentario")
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_prospecto")
    public ProspectoVenta getProspectoVenta() {
        return prospectoVenta;
    }

    public void setProspectoVenta(ProspectoVenta prospectoVenta) {
        this.prospectoVenta = prospectoVenta;
    }
    
    private List<Archivo> archivo; 

    @OneToMany(mappedBy="bitacora", fetch= FetchType.LAZY)
    public List<Archivo> getArchivo() {
        return archivo;
    }

    public void setArchivo(List<Archivo> archivo) {
        this.archivo = archivo;
    }


}
