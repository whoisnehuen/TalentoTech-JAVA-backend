/* 1. Encapsulación:
○ Convertí los atributos de Cliente a private.
○ Creá getters y setters para nombre y email.
○ Asegurá que email contenga un @ antes de asignarlo.
2. Colaboración entre clases:
○ Creá una clase Carrito que contenga una ArrayList<Producto>.
○ Agregale métodos para sumar productos y calcular el total.
○ Demostrá el uso creando un Carrito, agregándole productos y mostrando el total.
3. Variables estáticas:
○ En Producto, agregá una variable estática que lleve la cuenta de cuántos productos se crean.
○ Mostrá ese valor luego de instanciar varios productos.
4. Control de acceso con setters:
○ Añadí una validación en el setter de cantidadEnStock para que no se permita asignar valores negativos.
○ Probá asignar -10 y verificá que el valor no cambie. */

import java.util.ArrayList;



public class clase6 {
    public static class Cliente {
    private String nombre;
    private String email;
    public Cliente(String nombre, String email){
        setNombre(nombre);
        setEmail(email);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email inválido. Debe contener un '@'.");
        }
    }
}
public static class Producto{
    private String nombre;
    private double precio;
    private int unidades;
    private static int totalProductos = 0;
    public Producto(String nombre, double precio, int unidades) {
        setNombre(nombre);
        setPrecio(precio);
        setUnidades(unidades);
        totalProductos++;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getUnidades() {
        return unidades;
    }
    public void setUnidades(int unidades) {
        if (unidades < 0) {
            System.out.println("No se permite una cantidad negativa.");
            return;
        }
        this.unidades = unidades;
    }
    public static int getTotalProductos() {
        return totalProductos;
    }

}
public static class Carrito{
    private ArrayList<Producto> productos;
    public Carrito() {
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio() * p.getUnidades();
        }
        return total;
    }


}
    public static void main(String[] args) {
        // Prueba de Cliente
        Cliente cliente1 = new Cliente("Juan", "juan@example.com");
        System.out.println("Cliente: " + cliente1.getNombre() + ", Email: " + cliente1.getEmail());
        Cliente cliente2 = new Cliente("Ana", "anaexample.com"); // Email inválido
        System.out.println("Cliente: " + cliente2.getNombre() + ", Email: " + cliente2.getEmail());
        Cliente cliente3 = new Cliente("Luis", "luis@example.com");
        System.out.println("Cliente: " + cliente3.getNombre() + ", Email: " + cliente3.getEmail());


        // Prueba de Producto y Carrito
        Producto producto1 = new Producto("Caramelo", 250.00, 55);
        Producto producto2 = new Producto("Alfajor", 1999.99, 20);
        Producto producto3 = new Producto("Auriculares", 2500.25, 3);
        Producto producto4 = new Producto("Galletitas", 3000.00, 5);
        Producto producto5 = new Producto("Agua", 1555.55, 5);

        Carrito compra = new Carrito();

        for (Producto p : new Producto[]{producto1, producto2, producto3, producto4, producto5}) {
            compra.agregarProducto(p);
        }

        System.out.println("Total de la compra: $" + compra.calcularTotal());
        System.out.println("Total de productos creados: " + Producto.getTotalProductos());

    }
}
