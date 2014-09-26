/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.castell.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author rtorres
 */
@Entity
@Table(name = "contacto")
public class Contacto implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    
    @Column(name = "tipo")
    private String tipo;
    
    @Column(name = "paterno")
    private String paterno;
    
    @Column(name = "materno")
    private String materno;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "titulo")
    private String titulo;
    
    @Column(name = "razon_social")
    private String razon_social;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "celular")
    private String celular;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "website")
    private String website;

    @OneToMany(mappedBy = "contacto", fetch = FetchType.LAZY)
    private List<ProspectoVenta> prospectoVenta;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_empresa")
    private Contacto empresa;
    
    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<Contacto> contactos;    
    
    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }    

    public Contacto getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Contacto empresa) {
        this.empresa = empresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    
    public List<ProspectoVenta> getProspectoVenta() {
        return prospectoVenta;
    }

    public void setProspectoVenta(List<ProspectoVenta> prospectoVenta) {
        this.prospectoVenta = prospectoVenta;
    }
    
}
