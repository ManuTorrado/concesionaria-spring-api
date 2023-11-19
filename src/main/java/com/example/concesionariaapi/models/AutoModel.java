package com.example.concesionariaapi.models;


import jakarta.persistence.*;

@Entity
@Table(name = "auto")
public class AutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    
    private String patente;
    private String marca;
    private String color;
    private Long titular;
    private String modelo;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatente() {
        return this.patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getTitular() {
        return this.titular;
    }

    public void setTitular(Long titular) {
        this.titular = titular;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
