package services;

import com.nehueen.techlab.models.*;
import list.Catalogo;

public class addProducto {
    public static void ejecutar(String tipo, String nombre, double precio, int stock) {
        if (tipo.equalsIgnoreCase("Te")) {
            Catalogo.productos.add(new Te(nombre, precio, stock));
        } else {
            Catalogo.productos.add(new Cafe(nombre, precio, stock));
        }
        System.out.println("-> Producto '" + nombre + "' agregado exitosamente.");
    }
}