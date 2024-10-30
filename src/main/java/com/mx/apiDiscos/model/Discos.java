package com.mx.apiDiscos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/*
 * tabla que se ocupo:
 CREATE TABLE DISCOS(
ID NUMBER PRIMARY KEY,
NOMBRE_DISCO VARCHAR2(80) NOT NULL,
GENERO VARCHAR2(80) NOT NULL,
PRECIO FLOAT NOT NULL
);
 * */
@Entity
@Table(name="DISCOS")
public class Discos {

    @Id // Llave primaria
    @Column(name="ID", columnDefinition="NUMBER", nullable=false)
    private Integer id;

    @Column(name="NOMBRE_DISCO", columnDefinition="VARCHAR2(80)", nullable=false)
    private String nombreDisco;

    @Column(name="GENERO", columnDefinition="VARCHAR2(80)", nullable=false)
    private String genero;

    @Column(name="PRECIO", columnDefinition="FLOAT", nullable=false)
    private Float precio;

    // Constructor vacío
    public Discos() {}

    // Constructor con parámetros
    public Discos(Integer id, String nombreDisco, String genero, Float precio) {
        this.id = id;
        this.nombreDisco = nombreDisco;
        this.genero = genero;
        this.precio = precio;
    }

    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreDisco() {
        return nombreDisco;
    }

    public void setNombreDisco(String nombreDisco) {
        this.nombreDisco = nombreDisco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    // Método toString
    @Override
    public String toString() {
        return "Discos [id=" + id + ", nombreDisco=" + nombreDisco + ", genero=" + genero + ", precio=" + precio + "]";
    }
}

