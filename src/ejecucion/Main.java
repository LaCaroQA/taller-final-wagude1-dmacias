package ejecucion;

import explicaciones.Detalle;
import menus.MenuPrincipal;
import menus.SubMenus;
import utilidades.Validaciones;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // construccion menu principal

        int opcion = 0;

        do {
            MenuPrincipal.menuPrincipal();

            Validaciones.opcionvalida(scanner);

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    datosPrimitivos();
                    break;
                case 2:
                    datosString();
                    break;
                case 3:
                    constantes();
                    break;
                case 4:
                    tiposOperadores();
                    break;
                case 5:
                    condicionalesIfElseIfelse();
                    break;
                case 6:
                    condicionalSwitch();
                    break;
                case 7:
                    condicionalTernaria();
                    break;
                case 8:
                    bucleDoWhile();
                    break;
                case 9:
                    bucleWhile();
                    break;
                case 10:
                    bucleFor();
                    break;
                default:
                    System.out.println("Ingrese una opción correcta");
            }
        } while (opcion != 0);

        scanner.close();
    }
    private static void datosPrimitivos() {
        int opcion;

        do {
            SubMenus.datosPrimitivos();

            Validaciones.opcionvalida(scanner);

            opcion = scanner.nextInt();

            scanner.nextLine();


            switch (opcion) {
                case 1:
                    do {
                        Detalle.explicacionByte();
                        opcion = scanner.nextInt();
                        scanner.nextLine();

                    } while (opcion != 0);
                    break;
                case 2:
                    do {
                        Detalle.explicacionShort();
                        opcion = scanner.nextInt();
                        scanner.nextLine();

                    } while (opcion != 0);
                    break;
                case 3:
                    do {
                        Detalle.explicacionInt();
                        opcion = scanner.nextInt();
                        scanner.nextLine();

                    } while (opcion != 0);
                    break;
                case 4:
                    do {
                        Detalle.explicacionLong();
                        opcion = scanner.nextInt();
                        scanner.nextLine();


                    } while (opcion != 0);
                    break;
                case 5:
                    do {
                        Detalle.explicacionFloat();
                        opcion = scanner.nextInt();
                        scanner.nextLine();


                    } while (opcion != 0);
                    break;
                case 6:
                    do {
                        Detalle.explicacionDouble();
                        opcion = scanner.nextInt();
                        scanner.nextLine();


                    } while (opcion != 0);
                    break;
                case 7:
                    do {
                        Detalle.explicacionChar();
                        opcion = scanner.nextInt();
                        scanner.nextLine();


                    } while (opcion != 0);
                    break;
                case 8:
                    do {
                        Detalle.explicacionBoolean();
                        opcion = scanner.nextInt();
                        scanner.nextLine();

                    } while (opcion != 0);

                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 0);
    }
    private static void datosString() {
        int opcion;

        do {
            SubMenus.datosString();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch
            (opcion) {
                case 1:
                    do {
                        Detalle.explicacionString();
                        opcion = scanner.nextInt();
                        scanner.nextLine();

                    } while (opcion != 0);

                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }

        } while (opcion != 0);


    }
    private static void constantes() {
        int opcion;

        do {
            Detalle.explicacionConstante();
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 0);
    }
    private static void tiposOperadores() {
        int opcion=0;
        do {
            SubMenus.tiposOperadores();

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    do {
                        Detalle.explicaionAritmeticos();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();

                    } while (opcion != 0);
                    break;
                case 2:
                    do {
                        Detalle.explicacionRelacionales( );
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();

                    } while (opcion != 0);
                    break;
                case 3:
                    do {
                        Detalle.explicacionLogicos( );
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();

                    } while (opcion != 0);
                    break;
                case 4:
                    do {
                        Detalle.explicacionAsignacion( );
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();

                    } while (opcion != 0);
                    break;
                case 5:
                    do {
                        Detalle.explicacionIncrementoDecremento( );
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();

                    } while (opcion != 0);
                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 0);
    }
    private static void condicionalesIfElseIfelse() {
        int opcion=0;
        do {
            SubMenus.codicionalesIfElse();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    do {
                        Detalle.explicacionIf();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);

                    break;
                case 2:
                    do {
                        Detalle.explicacionElseIf();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);
                    break;
                case 3:
                    do {
                        Detalle.explicacionElse();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);
                    break;
                case 4:

                    do {
                        Detalle.programaIfElse();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);
                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 0);
    }
    private static void condicionalSwitch() {
        int opcion=0;
        do {
           SubMenus.condicionalSwitch();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:

                    do {
                        Detalle.explicacionSwitch();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);

                    break;
                case 2:

                    do {
                        Detalle.programaSwitch();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);

                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 0);
    }
    private static void condicionalTernaria() {
        int opcion=0;
        do {
            SubMenus.ternaria();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:

                    do {
                        Detalle.explicacionTernaria();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);
                    break;
                case 2:

                    do {
                        Detalle.programaTernaria();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);
                    break;

                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 0);
    }
    private static void bucleDoWhile() {
        int opcion=0;
        do {
            SubMenus.bucleDoWhile();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    do {
                        Detalle.explicacionDoWhile();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);
                    break;
                case 2:
                    do {
                        Detalle.programaDoWhile();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);
                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 0);
    }
    private static void bucleWhile() {
        int opcion=0;
        do {
            SubMenus.bucleWhile();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                       do {
                        Detalle.explicacionWhile();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);
                    break;
                case 2:
                    //Programa_de_WHILE();
                    do {
                        Detalle.programaWhile();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);
                    break;

                default:
                    System.out.println("- por favor digite una opcion correcta: ");
            }
        } while (opcion != 0);
    }
    private static void bucleFor() {
        int opcion=0;
        do {
            SubMenus.bucleFor();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:

                    do {
                        Detalle.explicacionFor();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);
                    break;
                case 2:

                    do {
                        Detalle.programaFor();
                        System.out.println("Ingrese la opción 0 para regresar al menu: ");
                        opcion = scanner.nextInt();
                        scanner.nextLine();
                    } while (opcion != 0);
                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 0);
    }

}