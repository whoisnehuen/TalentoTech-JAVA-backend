package com.techlab.modelos;
import com.techlab.modelos.Producto;
public class Te extends Producto implements Descontable {
    private double descuento = 0.75;
    public Te(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }
    @Override
    public double calcularPrecioFinal() {
        return precio * descuento;
    }
}