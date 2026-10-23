package clase11.src.main.java.com.techlab.clase11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import clase11.src.main.java.com.techlab.productos.Productos;
import clase11.src.main.java.com.techlab.excepciones.ProductoNoEncontradoException;
import clase11.src.main.java.com.techlab.excepciones.StockInsuficienteException;

@SpringBootApplication
public class Clase11Application {

	public static void main(String[] args) {
		SpringApplication.run(Clase11Application.class, args);
		// ----
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
