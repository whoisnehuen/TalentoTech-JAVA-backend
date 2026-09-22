package com.techlab.servicios;

import com.techlab.catalogo.Catalogo;

public class listarPedido {
    public static void ejecutar() {
        if (Catalogo.pedidos.isEmpty()) {
            System.out.println("-> Aún no hay pedidos registrados.");
            return;
        }
        System.out.println("\n--- LISTA DE PEDIDOS ---");
        for (String p : Catalogo.pedidos) {
            System.out.println("- " + p);
        }
    }
}