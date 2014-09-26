package com.tecsup.castell.model;

import java.io.Serializable;
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

@Entity
@Table(name = "archivo")
public class Archivo implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "ruta")
    private String ruta;
    
    @Column(name = "mime")
    private String mime;
    
    @Column(name = "tamanio")
    private Integer tamanio;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_bitacora")
    private Bitacora bitacora;

    public Bitacora getBitacora() {
        return bitacora;
    }

    public void setBitacora(Bitacora bitacora) {
        this.bitacora = bitacora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }
    

}
