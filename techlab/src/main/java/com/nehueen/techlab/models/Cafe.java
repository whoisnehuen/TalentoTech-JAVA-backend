package com.nehueen.techlab.models;


public class Cafe extends Producto implements Descontable {
    private double descuento = 0.90;
    public Cafe(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }
    @Override 
    public double calcularPrecioFinal() {
        return precio * descuento;
    }
    @Override
    public void aplicarDescuento(double porcentaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aplicarDescuento'");
    }
}