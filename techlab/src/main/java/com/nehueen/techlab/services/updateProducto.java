package com.nehueen.techlab.services;

import com.nehueen.techlab.models.*;

import exceptions.ProductoNoEncontradoException;

public class updateProducto {
    public static void ejecutar(String nombre, int nuevoStock) throws ProductoNoEncontradoException {
        for (Producto p : Catalogo.productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                p.setStock(nuevoStock);
                System.out.println("-> Stock actualizado para " + p.getNombre() + ": " + nuevoStock);
                return;
            }
        }
        throw new ProductoNoEncontradoException("No se encontró el producto: " + nombre);
    }
}