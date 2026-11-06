package com.nehueen.techlab.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nehueen.techlab.models.*;
import com.nehueen.techlab.services.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    public record ProductoRequest(String tipo, String nombre, double precio, int stock) {}
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarTodos();
    }
    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable int id) {
        return productoService.obtenerPorId(id);
    }
    @PostMapping
    public Producto crearProducto(@RequestBody ProductoRequest nuevoProducto) {
        return productoService.guardar(
                nuevoProducto.tipo(),
                nuevoProducto.nombre(),
                nuevoProducto.precio(),
                nuevoProducto.stock());
    }
    @GetMapping("/eliminar/{id}")
    public boolean eliminarProducto(@PathVariable int id) {
        return productoService.eliminar(id);
    }

}