
import java.util.ArrayList;

public class clase5 {
    static ArrayList<Cliente> catalogoClientes = new ArrayList<>();

    public static class Cliente {
        String nombre;
        String mail;

        public Cliente(String nombre, String mail) {
            this.nombre = nombre;
            this.mail = mail;
            catalogoClientes.add(this);
        }
    }
    public static class Producto {
        String nombre;
        double precio;
        int stock;
    }
    public static void mostrarInformacion(ArrayList<Producto> catalogo) {
        for (Producto producto : catalogo) {
            System.out.println("Nombre: " + producto.nombre);
            System.out.println("Precio: $" + producto.precio);
            System.out.println("Stock: " + producto.stock);
            System.out.println("------------------------");
        }
        
    }

    public static void calcularDescuento(ArrayList<Producto> catalogo) {
        for (Producto producto : catalogo) {
            double precioD = producto.precio - (producto.precio * 0.10);
            System.out.println("Descuento final de 10% sobre " + producto.nombre + ": $" + precioD);
        }
    }

    public static void mostrarClientes(ArrayList<Cliente> catalogo) {
        for (Cliente cliente : catalogo) {
            System.out.println("Cliente: " + cliente.nombre + " - " + cliente.mail);
        }
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan", "juan@example.com");
        Cliente cliente2 = new Cliente("Juana", "juana@example.com");
        Cliente cliente3 = new Cliente("Esteban", "esteban@example.com");
        Cliente cliente4 = new Cliente("Elena", "elena@example.com");
        Cliente cliente5 = new Cliente("Pipe", "pipe@example.com");


        Producto producto1 = new Producto();
        producto1.nombre = "Laptop";
        producto1.precio = 8500.0;
        producto1.stock = 20;

        Producto producto2 = new Producto();
        producto2.nombre = "Mouse";
        producto2.precio = 150.0;
        producto2.stock = 10;

        Producto producto3 = new Producto();
        producto3.nombre = "Teclado";
        producto3.precio = 300.0;
        producto3.stock = 7;

        ArrayList<Producto> catalogo = new ArrayList<>();
        catalogo.add(producto1);
        catalogo.add(producto2);
        catalogo.add(producto3);

        mostrarInformacion(catalogo);
        calcularDescuento(catalogo);

        System.out.println("Cliente actual: " + cliente1.nombre + " - " + cliente1.mail);

        

        mostrarClientes(catalogoClientes);
    }
}