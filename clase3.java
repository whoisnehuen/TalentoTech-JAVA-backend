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


public class clase3 {
    public static void main(String[] args) {
        String cadena = " té CHAi ";
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
        System.out.println("Cadena formateada: " + resultado);
        System.out.println("Longitud: " + resultado.length());
        System.out.println("Primera letra: " + resultado.substring(0, 1));
        System.out.println("Contiene la palabra 'Chai': " + resultado.contains("Chai"));
        
    }
}


       
