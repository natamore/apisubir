package com.unab.apiproductos.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "producto")
public class ProductoEntidad implements Serializable{

    private static final long serialVersionUID= 1L;

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String idProducto;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private int precio;

    @Column(nullable = false)
    private float iva;

    @Column(nullable = false)
    private boolean estado;
    

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public float getIva() {
        return this.iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public boolean isEstado() {
        return this.estado;
    }


    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
