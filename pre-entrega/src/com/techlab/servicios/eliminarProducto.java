package com.techlab.servicios;
import com.techlab.modelos.*;
import com.techlab.catalogo.Catalogo;
import com.techlab.excepciones.ProductoNoEncontradoException;
public class eliminarProducto {
    public static void ejecutar(String nombre) throws ProductoNoEncontradoException {
        for (int i = 0; i < Catalogo.productos.size(); i++) {
            if (Catalogo.productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                Catalogo.productos.remove(i);
                System.out.println("-> Producto '" + nombre + "' eliminado correctamente.");
                return;
            }
        }
        throw new ProductoNoEncontradoException("No se encontró el producto: " + nombre);
    }
}
