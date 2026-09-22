package com.techlab.modelos;

interface Descontable {
    void aplicarDescuento(double porcentaje);
}

public abstract class Producto {
    private String nombre;
    protected double precio;
    private int stock;
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
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
