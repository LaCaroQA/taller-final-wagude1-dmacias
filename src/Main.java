import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // construccion menu principal

        int menuprincipal;

        Scanner in = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------");
        System.out.println("-          MENU DE CAPITULO DE PROGRAMACION               -");
        System.out.println("-                WAGUDE1 - DMACIAS                        -");
        System.out.println("-----------------------------------------------------------");
        System.out.println("- 1. Datos Primitivos                                     -");
        System.out.println("- 2. String                                               -");
        System.out.println("- 3. Constantes                                           -");
        System.out.println("- 4. Tipos de operadores                                  -");
        System.out.println("- 5. Condicionales IF, ELSE, IF ELSE                      -");
        System.out.println("- 6. Condicional Switch                                   -");
        System.out.println("- 7. Condicional Ternaria                                 -");
        System.out.println("- 8. Bucle DO WHILE                                       -");
        System.out.println("- 9. Bucle WHILE                                          -");
        System.out.println("- 10. Bucle FOR                                           -");
        System.out.println("- 0. Salir                                                -");
        System.out.println("- por favor digite una opcion -");

        menuprincipal = in.nextInt();

        switch (menuprincipal) {
            case 1:
                System.out.println("Has seleccionado Datos Primitivos.");

                break;
            case 2:
                System.out.println("Has seleccionado String.");
                break;
            case 3:
                System.out.println("Has seleccionado Constantes.");
                break;
            case 4:
                System.out.println("Has seleccionado Tipos de operadores.");
                break;
            case 5:
                System.out.println("Has seleccionado Condicionales IF, ELSE, IF ELSE.");
                break;
            case 6:
                System.out.println("Has seleccionado Condicional Switch.");
                break;
            case 7:
                System.out.println("Has seleccionado Condicional Ternaria.");
                break;
            case 8:
                System.out.println("Has seleccionado Bucle DO WHILE.");
                break;
            case 9:
                System.out.println("Has seleccionado Bucle WHILE.");
                break;
            case 10:
                System.out.println("Has seleccionado bucle FOR.");
                break;
            case 0:
                System.out.println("Salir del menu...");
                break;
            default:
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
        }
        while (menuprincipal == 0);
        in.close();
    }
}