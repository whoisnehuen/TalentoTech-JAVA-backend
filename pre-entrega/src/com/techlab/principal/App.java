package com.techlab.principal;

import java.util.Scanner;
import com.techlab.productos.Productos;
import com.techlab.excepciones.ProductoNoEncontradoException;
import com.techlab.excepciones.StockInsuficienteException;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String buscar = sc.nextLine();

        try {
            String nombreEncontrado = Productos.buscarProductoPorNombre(buscar);
            System.out.println("Producto encontrado: " + nombreEncontrado);
            System.out.print("Ingrese la cantidad de unidades a vender: ");
            int cantidad = sc.nextInt();
            Productos.venderProducto(nombreEncontrado, cantidad);

        } catch (ProductoNoEncontradoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (StockInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}