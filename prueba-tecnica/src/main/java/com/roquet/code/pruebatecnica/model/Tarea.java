package com.roquet.code.pruebatecnica.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Tarea {

    private Long id;
    private String nombre;
    private String descripcion;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaInicio;

    // Constructor vacío
    public Tarea() {
    }

    // Constructor con todos los campos
    public Tarea(Long id, String nombre, String descripcion, Date fechaInicio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
    }

    // Getters y Setters
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}