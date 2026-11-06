package com.nehueen.techlab.models;

import jakarta.persistence.*;

interface Descontable {
    void aplicarDescuento(double porcentaje);
}

@Entity
@Table(name = "producto")
public abstract class Producto {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    protected double precio;
    private int stock;
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public double getPrecio() {
        return precio;
    }
    public abstract double calcularPrecioFinal();
}
