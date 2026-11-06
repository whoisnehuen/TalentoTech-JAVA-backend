package com.nehueen.techlab.services;

import com.nehueen.techlab.models.*;

public class showProducto {
    public static void ejecutar() {
        if (Catalogo.productos.isEmpty()) {
            System.out.println("-> No hay productos registrados.");
            return;
        }
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        for (Producto p : Catalogo.productos) {
            System.out.println("- " + p.getNombre() + " | Precio orig: $" + p.getPrecio() 
                + " | Precio final: $" + p.calcularPrecioFinal() + " | Stock: " + p.getStock());
        }
    }
}