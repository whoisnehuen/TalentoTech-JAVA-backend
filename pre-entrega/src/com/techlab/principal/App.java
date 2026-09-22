package com.techlab.principal;

import java.util.Scanner;
import com.techlab.servicios.*;
import com.techlab.excepciones.*;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n=================================");
            System.out.println("       SISTEMA DE GESTIÓN       ");
            System.out.println("=================================");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar/Actualizar stock");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Crear un pedido");
            System.out.println("6. Listar pedidos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Tipo (Te/Cafe): ");
                        String tipo = sc.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Precio: ");
                        double precio = Double.parseDouble(sc.nextLine());
                        System.out.print("Stock inicial: ");
                        int stock = Integer.parseInt(sc.nextLine());
                        agregarProducto.ejecutar(tipo, nombre, precio, stock);
                        break;

                    case 2:
                        listarProductos.ejecutar();
                        break;

                    case 3:
                        System.out.print("Ingrese nombre del producto a actualizar: ");
                        String nombreAct = sc.nextLine();
                        System.out.print("Ingrese nuevo stock: ");
                        int nuevoStock = Integer.parseInt(sc.nextLine());
                        actualizarProducto.ejecutar(nombreAct, nuevoStock);
                        break;

                    case 4:
                        System.out.print("Ingrese nombre del producto a eliminar: ");
                        String nombreElim = sc.nextLine();
                        eliminarProducto.ejecutar(nombreElim);
                        break;

                    case 5:
                        System.out.print("Nombre del producto para el pedido: ");
                        String nombrePed = sc.nextLine();
                        System.out.print("Cantidad de unidades: ");
                        int cant = Integer.parseInt(sc.nextLine());
                        crearPedido.ejecutar(nombrePed, cant);
                        break;

                    case 6:
                        listarPedido.ejecutar();
                        break;

                    case 7:
                        System.out.println("¡Saliendo del programa!");
                        break;

                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un valor numérico válido.");
            } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
                System.out.println("Error de operación: " + e.getMessage());
            }

        } while (opcion != 7);

        sc.close();
    }
}