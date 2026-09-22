package com.techlab.servicios;

import com.techlab.modelos.*;
import com.techlab.catalogo.Catalogo;
import com.techlab.excepciones.*;

public class crearPedido {
    public static void ejecutar(String nombre, int cantidad) throws ProductoNoEncontradoException, StockInsuficienteException {
        for (Producto p : Catalogo.productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                if (cantidad > p.getStock()) {
                    throw new StockInsuficienteException("Stock insuficiente para '" + nombre + "'. Disponible: " + p.getStock());
                }
                p.setStock(p.getStock() - cantidad);
                String pedido = "Pedido: " + cantidad + "x " + p.getNombre() + " - Total: $" + (p.calcularPrecioFinal() * cantidad);
                Catalogo.pedidos.add(pedido);
                System.out.println("-> ¡Pedido registrado exitosamente!");
                return;
            }
        }
        throw new ProductoNoEncontradoException("No se encontró el producto: " + nombre);
    }
}