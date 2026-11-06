package com.nehueen.techlab.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nehueen.techlab.models.*;

@Service
public class ProductoService {
    public List<Producto> listarTodos() {
        return Catalogo.productos;
    }
    public Producto obtenerPorId(int id) {
        return Catalogo.productos.stream()
                .filter(producto -> producto.getId() == id)
                .findFirst()
                .orElse(null);
    }
    public Producto guardar(String tipo, String nombre, double precio, int stock) {
        Producto p;
        if (tipo.equalsIgnoreCase("Te")) {
            p = new Te(nombre, precio, stock);
        } else {
            p = new Cafe(nombre, precio, stock);
        }
        Catalogo.productos.add(p);
        return p;
    }
    public Producto actualizar(int id, Producto datos) {
        Producto p = obtenerPorId(id);
        if (p != null) {
            p.setStock(datos.getStock());
            return p;
        }
        return null;
    }
    public boolean eliminar(int id) {
        return Catalogo.productos.removeIf(p -> p.getId() == id);
    }
}