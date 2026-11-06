package com.nehueen.techlab.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nehueen.techlab.models.Catalogo;
import com.nehueen.techlab.models.Producto;


@RestController 
@RequestMapping("/pedidos")
public class PedidoController {
    @GetMapping
    public List<Producto> listarProductos() {
        return Catalogo.productos;
    }    
}