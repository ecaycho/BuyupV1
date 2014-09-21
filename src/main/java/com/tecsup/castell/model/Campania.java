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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author rtorres
 */
@Entity
@Table(name = "campania")
public class Campania implements Serializable {
        
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "fecha_inicio")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_inicio;
    
    @Column(name = "fecha_fin")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_fin;
    
    @Column(name = "estado")
    private String estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

  /*  @OneToMany(mappedBy = "campania")
    private List<ProspectoVenta> prospectoVenta;

    public List<ProspectoVenta> getProspectoVenta() {
        return prospectoVenta;
    }

    public void setProspectoVenta(List<ProspectoVenta> prospectoVenta) {
        this.prospectoVenta = prospectoVenta;
    }
   */ 
    
}
