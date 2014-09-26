/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.castell.model;
import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "prospecto_venta")
public class ProspectoVenta  {

    @Id
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_campania")
    private Campania campania;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contacto")
    private Contacto contacto;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_vendedor")
    private Vendedor vendedor;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
    
    @OneToMany(mappedBy = "prospectoVenta", fetch = FetchType.LAZY)
    private Set<Bitacora> bitacora;

    public Campania getCampania() {
        return campania;
    }

    public void setCampania(Campania campania) {
        this.campania = campania;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "fecha_inicio")
    private Date fecha_inicio;
    
    @Column(name = "precio")
    private Double precio;
    
    @Column(name = "estado")
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }    

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Set<Bitacora> getBitacora() {
        return bitacora;
    }

    public void setBitacora(Set<Bitacora> bitacora) {
        this.bitacora = bitacora;
    }

    
    
}
