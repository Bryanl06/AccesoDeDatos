package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Atributos mínimos pedidos
    private String nombre;
    private Integer capacidad;
    private Integer edificio;

    // Constructor vacío
    public Aula() {}

    // Constructor con parámetros
    public Aula(String nombre, Integer capacidad, Integer edificio) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.edificio = edificio;
    }

    // Getters y setters
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

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getEdificio() {
        return edificio;
    }

    public void setEdificio(Integer edificio) {
        this.edificio = edificio;
    }
}
