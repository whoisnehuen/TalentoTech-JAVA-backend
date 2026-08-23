/* 1. Manipulación de cadenas:
○ Dada una cadena " té CHAi ", formateala para que quede "Té Chai".
○ Mostrá su longitud, su primera letra y verificá si contiene la palabra "Chai".
2. Arrays:
○ Creá un array de 5 productos.
○ Imprimí sus elementos y luego intentá agregar un sexto producto (analizá el resultado).
3. ArrayList:
○ Creá un ArrayList<String> para productos.
○ Agregá varios productos, eliminá uno, verificá si otro existe y luego imprimí la lista final.
4. Combinar cadenas y listas:
○ Tené una lista de productos con nombres desprolijos.
○ Creá un método que recorra la lista y aplique el formateo a cada nombre, volviendo a imprimir la lista con nombres prolijos. */

import java.util.ArrayList;
public class clase3 {
    public static void main(String[] args) {
        // Manipulación de cadenas
        String cadena = " té CHAi ";
        System.out.println(cadena);
        cadena = cadena.trim();
        cadena = cadena.toLowerCase();
        String[] palabras = cadena.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].isEmpty()) {
                String primeraLetra = palabras[i].substring(0,1).toUpperCase();
                String resto = palabras[i].substring(1);
                sb.append(primeraLetra).append(resto);
                if (i < palabras.length - 1) {
                    sb.append(" ");
                }
            }
            
        }
        String resultado = sb.toString();
        System.out.println(resultado);
        System.out.println("Longitud: " + resultado.length());
        System.out.println(resultado.substring( 0,  1));
        System.out.println("Contiene 'Chai': " + resultado.contains("Chai"));

        // Arrays
        String[] productos = new String[5];
        productos[0] = "Café Premium Molido";
        productos[1] = "Té Verde Orgánico";
        productos[2] = "Chocolate Amargo 80%";
        productos[3] = "Yerba Mate Tradicional";
        productos[4] = "Galletas Integrales";
        for (String producto : productos) {
            System.out.println(producto);
        }
        productos[5] = "Miel Natural";

        // ArrayList
        ArrayList<String> listaProductos = new ArrayList<>();
        listaProductos.add("Protoboard");
        listaProductos.add("Resistencia 220 Ohm");
        listaProductos.add("LED RGB");
        listaProductos.add("Buzzer");
        listaProductos.remove("Protoboard");
        System.out.println("Contiene 'Chocolate Amargo 80%': " + listaProductos.contains("Chocolate Amargo 80%"));
        System.out.println("Lista final de productos:");
        for (String producto : listaProductos) {
            System.out.println(producto);
        }
        
        // Combinar cadenas y listas
        ArrayList<String> listaDesprolija = new ArrayList<>();
        listaDesprolija.add("  té chai  ");
        listaDesprolija.add("café expresso");
        listaDesprolija.add("  chocolate caliente ");
        listaDesprolija.add("Galletas de avena");
        listaDesprolija.add("  jugo de naranja ");

        System.out.println("Lista desprolija:");
        for (String producto : listaDesprolija) {
            System.out.println(producto);
        }
    }
        
}
}


       
