package utilidades;
import java.util.Scanner;

public class Validaciones {

    public static void opcionvalida(Scanner scanner){
        while (!scanner.hasNextInt())
        {
            System.out.println("Ingrese números válidos.");
            scanner.next(); //Limpiar la entrada incorrecta
            System.out.println("Ingrese su opcion: ");
        }
    }

    public static void crearTabla(String titulo, String contenido) {
        int anchoTotal = 100;     // Ancho total de la tabla
        int margen = 10;         // Margen a los extremos
        int anchoUtil = anchoTotal - 2 * (margen + 1);  // Espacio utilizable en la tabla (1 espacio para el '*')

        // Imprimir el borde superior
        imprimirBorde(anchoTotal);

        // Imprimir el título centrado con márgenes y '*'
        imprimirConMargen(titulo, margen, anchoUtil);

        // Imprimir una línea de separación
        imprimirLinea(anchoTotal);

        // Imprimir el contenido con salto de línea
        imprimirContenido(contenido, margen, anchoUtil);

        // Imprimir el borde inferior
        imprimirBorde(anchoTotal);
    }

    // Función para imprimir el borde superior e inferior con '---'
    private static void imprimirBorde(int ancho) {
        System.out.print("---");
        for (int i = 3; i < ancho - 3; i++) {
            System.out.print("-");
        }
        System.out.println("---");
    }

    // Función para imprimir una línea de separación con '-'
    private static void imprimirLinea(int ancho) {
        System.out.print("---");
        for (int i = 3; i < ancho - 3; i++) {
            System.out.print("-");
        }
        System.out.println("---");
    }

    // Función para imprimir texto con margen y centrado, incluyendo los bordes '*'
    private static void imprimirConMargen(String texto, int margen, int anchoUtil) {
        int espacioUtil = anchoUtil;
        String textoCentrado = String.format("%-" + espacioUtil + "s",
                String.format("%" + (espacioUtil + texto.length()) / 2 + "s", texto));
        System.out.println("*" + " ".repeat(margen) + textoCentrado + " ".repeat(margen) + "*");
    }

    // Función para dividir e imprimir el contenido con saltos de línea, incluye los bordes '*'
    private static void imprimirContenido(String contenido, int margen, int anchoUtil) {
        String[] palabras = contenido.split(" ");
        StringBuilder lineaActual = new StringBuilder();

        for (String palabra : palabras) {
            if (lineaActual.length() + palabra.length() + 1 > anchoUtil) {
                // Si la línea actual supera el ancho permitido, imprimirla con '*'
                System.out.println("*" + " ".repeat(margen) + lineaActual
                        + " ".repeat(anchoUtil - lineaActual.length()) + " ".repeat(margen) + "*");
                lineaActual.setLength(0);  // Limpiar la línea actual
            }
            if (lineaActual.length() > 0) {
                lineaActual.append(" ");
            }
            lineaActual.append(palabra);
        }

        // Imprimir la última línea, si tiene contenido
        if (lineaActual.length() > 0) {
            // Imprimir cada línea del contenido
            System.out.println("*" + " ".repeat(margen) + lineaActual
                    + " ".repeat(anchoUtil - lineaActual.length()) + " ".repeat(margen) + "*");

        }
    }
}
