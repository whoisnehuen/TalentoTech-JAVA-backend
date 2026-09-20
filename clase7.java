/* 
1. Herencia básica:
○ Creá la clase abstracta Producto con un atributo nombre y un método abstracto calcularPrecioFinal().
○ Creá Te y Café que extiendan Producto.
○ Implementá calcularPrecioFinal() en cada subclase.
2. Polimorfismo:
○ Creá un ArrayList<Producto> y agrega instancias de Te y Cafe.
○ Iterá sobre la lista y llamá a calcularPrecioFinal() en cada uno. Observá cómo se ejecuta la versión correspondiente a cada subclase.
3. Uso de super y override:
○ En Cafe, agregá un constructor que llame a super(...) para inicializar atributos comunes.
○ Sobrescribí algún método de Producto y llamá a super en su interior para reutilizar parte de la lógica.
4. Interfaces:
○ Creá la interfaz Descontable con el método aplicarDescuento(double porcentaje).
○ Hacé que Te y Cafe la implementen.
○ Probá aplicar descuentos a diferentes productos.
*/
import java.util.ArrayList;

interface Descontable {
    void aplicarDescuento(double porcentaje);
}

abstract class Producto {
    private String nombre;
    protected double precio;
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public abstract double calcularPrecioFinal();
}

class Te extends Producto implements Descontable {
    private double descuento = 0.75;
    public Te(String nombre, double precio) {
        super(nombre, precio);
    }
    @Override
    public double calcularPrecioFinal() {
        return precio * descuento; // Ejemplo de cálculo con un 25% de descuento
    }
}

class Cafe extends Producto implements Descontable {
    private double descuento = 0.90;
    public Cafe(String nombre, double precio) {
        super(nombre, precio);
    }
    @Override 
    public double calcularPrecioFinal() {
        return precio * descuento; // Ejemplo de cálculo con un 10% de descuento
    }
}
public class clase7 {
public static void main(String[] args) {
    ArrayList<Producto> productos = new ArrayList<>();
    productos.add(new Te("Verde", 100));
    productos.add(new Cafe("Espresso", 150));
    productos.add(new Cafe("Caramel Macciato", 100));
    productos.add(new Te("Chai", 150));
    productos.add(new Te("Rojo", 50));
    productos.add(new Cafe("Cookie", 50));
    productos.add(new Cafe("Submarino", 200));
    productos.add(new Te("Matcha", 1500));

    for (Producto p : productos) {
        System.out.println("Precio final de " + p.getNombre() + ": " + p.calcularPrecioFinal());
    }
}
}