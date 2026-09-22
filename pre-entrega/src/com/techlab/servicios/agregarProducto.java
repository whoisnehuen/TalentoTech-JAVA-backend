package com.techlab.servicios;

import com.techlab.modelos.*;
import com.techlab.catalogo.Catalogo;

public class agregarProducto {
    public static void ejecutar(String tipo, String nombre, double precio, int stock) {
        if (tipo.equalsIgnoreCase("Te")) {
            Catalogo.productos.add(new Te(nombre, precio, stock));
        } else {
            Catalogo.productos.add(new Cafe(nombre, precio, stock));
        }
        System.out.println("-> Producto '" + nombre + "' agregado exitosamente.");
    }
}