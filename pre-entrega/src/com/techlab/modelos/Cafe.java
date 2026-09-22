package com.techlab.modelos;
import com.techlab.modelos.Producto;
public class Cafe extends Producto implements Descontable {
    private double descuento = 0.90;
    public Cafe(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }
    @Override 
    public double calcularPrecioFinal() {
        return precio * descuento; // Ejemplo de cálculo con un 10% de descuento
    }
}