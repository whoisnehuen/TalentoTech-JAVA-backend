package com.techlab.productos;
import java.util.ArrayList;
import com.techlab.excepciones.ProductoNoEncontradoException;
import com.techlab.excepciones.StockInsuficienteException;

interface Descontable {
    void aplicarDescuento(double porcentaje);
}

abstract class Producto {
    private String nombre;
    protected double precio;
    private int stock;
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public String getNombre() {
        return nombre;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public abstract double calcularPrecioFinal();
}

class Te extends Producto implements Descontable {
    private double descuento = 0.75;
    public Te(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }
    @Override
    public double calcularPrecioFinal() {
        return precio * descuento; // Ejemplo de cálculo con un 25% de descuento
    }
}

class Cafe extends Producto implements Descontable {
    private double descuento = 0.90;
    public Cafe(String nombre, double precio, int stock) {
        super(nombre, precio, stock);
    }
    @Override 
    public double calcularPrecioFinal() {
        return precio * descuento; // Ejemplo de cálculo con un 10% de descuento
    }
}

public class Productos {
    private static ArrayList<Producto> listaProductos = inicializarProductos();

    private static ArrayList<Producto> inicializarProductos() {
        ArrayList<Producto> lista = new ArrayList<>();
        lista.add(new Te("Verde", 100, 10));
        lista.add(new Cafe("Espresso", 150, 200));
        lista.add(new Cafe("Caramel Macchiato", 100, 500));
        lista.add(new Te("Chai", 150, 250));
        lista.add(new Te("Rojo", 50, 10));
        lista.add(new Cafe("Cookie", 50, 200));
        lista.add(new Cafe("Submarino", 200, 200));
        lista.add(new Te("Matcha", 1500, 67000));
        return lista;
    }
    public static String buscarProductoPorNombre(String nombre) throws ProductoNoEncontradoException {
        for (Producto p : listaProductos) {
            if (p.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                return p.getNombre();
            }
        }
        throw new ProductoNoEncontradoException("No se encontró el producto: " + nombre);
    }
    public static void venderProducto(String nombre, int cantidad) throws ProductoNoEncontradoException, StockInsuficienteException {
        for (Producto p : listaProductos) {
            if (p.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                if (cantidad > p.getStock()) {
                    throw new StockInsuficienteException("Stock insuficiente para '" + p.getNombre() 
                        + "'. Stock disponible: " + p.getStock() + " - Intentaste vender: " + cantidad);
                }
                p.setStock(p.getStock() - cantidad);
                System.out.println("Venta realizada con éxito. Stock restante de " + p.getNombre() + ": " + p.getStock());
                return;
            }
        }
        throw new ProductoNoEncontradoException("No se encontró el producto: " + nombre);
    }
}