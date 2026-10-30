package com.nehueen.techlab.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nehueen.techlab.models.*;

@RestController
@RequestMapping("/productos")
public class ProductoController {
 @GetMapping
 public List<Producto> listarProductos() {
 // Retorna lista de productos (ejemplo)
 return Arrays.asList(new Cafe("Expresso", 250.0, 100));
 }
}