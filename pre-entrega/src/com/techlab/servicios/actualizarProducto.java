package com.techlab.servicios;

import com.techlab.modelos.*;
import com.techlab.catalogo.*;
import com.techlab.excepciones.ProductoNoEncontradoException;

public class actualizarProducto {
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