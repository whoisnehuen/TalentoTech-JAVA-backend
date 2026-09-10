import java.util.Arrays;
public class clase4 {    
    public static double calcularImpuesto(double precio, double porcentaje) {
        return precio * (porcentaje / 100);
    }
    public static double calcularPrecioFinal(double precio, double descuento, int cantidad) {
        double precioConDescuento = precio*cantidad - (precio *cantidad* (descuento / 100));
        return precioConDescuento;
    }
    public static void reponerStock(int[] inventario, int indiceProducto, int unidadesNuevas) {
    inventario[indiceProducto] += unidadesNuevas;
    }
    public static void mostrarMensaje(String nombre) {
    System.out.println("Cliente nuevo: " + nombre);
    }
    public static void mostrarMensaje(String nombre, int cantidadCompras) {
    System.out.println("Cliente recurrente: " + nombre + " - Compras realizadas: " + cantidadCompras);
    }
    public static void main(String[] args) {
        int[] stocks = {20, 10, 7};
        double impuesto = calcularImpuesto(8500.0, 21.0);
        System.out.println("El impuesto es: $" + impuesto);
        double precioFinal = calcularPrecioFinal(8500.0, 10.0, 2);
        System.out.println("El precio final es: $" + precioFinal);
        System.out.println(Arrays.toString(stocks));
        reponerStock(stocks, 1, 5);
        System.out.println(Arrays.toString(stocks));
        mostrarMensaje("Juan");
        mostrarMensaje("Maria", 3);
    }
    
}
