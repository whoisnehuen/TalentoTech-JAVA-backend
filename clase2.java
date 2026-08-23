/* Silvia (Product Owner) ha recibido nuevas solicitudes del cliente:
1. Necesita saber el costo total de un pedido sumando el precio unitario por la cantidad de productos.
2. Requerimos solicitar datos al cliente para personalizar la experiencia. 
3. Debemos verificar si tenemos suficiente stock para cubrir una demanda específica.
4. Hay que procesar una lista de productos pendientes de revisión. Primero intentaremos una solución con while y luego notaremos que for podría ser más elegante.
Para cumplir con necesidades el equipo de desarrollo (Matías, Sabrina) y vos deberán:
1) Variables y Operadores:
○ Crear variables para representar el precio de un producto y la cantidad deseada por el cliente. Calculá y mostrale en pantalla el costo total.
○ Modificá el precio o la cantidad y verificá el resultado.
2) Entrada y Salida de Datos:
○ Pedile al usuario que ingrese su nombre y la cantidad de productos que quiere comprar.
○ Mostrá un mensaje personalizado con el monto total (asignando un precio fijo por unidad).
3) Condicionales:
○ Suponé que si el cliente quiere más de 100 unidades, le ofrecemos un descuento.
○ Implementá un if que verifique si cantidad > 100. Si es así, mostrá un mensaje indicando que aplica un descuento especial.
4) Bucles:
○ Pedir al usuario o usuaria que ingrese un número, y luego usá un bucle for para imprimir desde 1 hasta ese número.
○ Repetí lo mismo con un while y compará cuál te resulta más intuitivo.*/

import java.util.Scanner;
public class clase2 {
    public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    String producto = "Figuras de Transformers";
    double precioUnitario = 24999.99;
    System.out.println(producto+ " tiene(n) un valor unitario de: $" + precioUnitario);
    System.out.println("¿Cuánt@s " +producto+ " querés comprar? ");
    int cantidadCliente = sc.nextInt();
    double precioFinal = cantidadCliente*precioUnitario;
    if (cantidadCliente > 10) {
        System.out.println("¡Genial! Al comprar más de 10 unidades, aplicás un 25% de descuento.");
        precioFinal = precioFinal * 0.75;
    }
    System.out.println("Vas a comprar " + cantidadCliente +" "+producto+ ". El precio final es de: $"+precioFinal);
    sc.close();
    }
}
