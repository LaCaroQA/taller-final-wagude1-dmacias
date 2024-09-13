import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // construccion menu principal

        int opcion = 0;

        do {
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
            System.out.println("-----------------------------------------------------------");
            System.out.println("- Por favor, digite una opción -");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Datos_Primitivos();
                    break;
                case 2:
                    Datos_String();
                    break;
                case 3:
                    Constantes();
                    break;
                case 4:
                    Tiposdeoperadores();
                    break;
                case 5:
                    Condicionalesif_else_ifelse();
                    break;
                case 6:
                    Condicional_Switch();
                    break;
                case 7:
                    Condicional_Ternaria();
                    break;
                case 8:
                    Bucle_do_while();
                    break;
                case 9:
                    Bucle_while();
                    break;
                case 10:
                    Bucle_for();
                    break;
                default:
                    System.out.println("Ingrese una opción correcta");
            }
        } while (opcion != 0);

        scanner.close();
    }
    private static void Datos_Primitivos() {
        int opcion;

        do {

            System.out.println("-----------------------------------------------------------");
            System.out.println("-               DATOS PRIMITIVOS                          -");
            System.out.println("-----------------------------------------------------------");
            System.out.println("- 1. Explicacion byte                                     -");
            System.out.println("- 2. Explicacion short                                    -");
            System.out.println("- 3. Explicacion int                                      -");
            System.out.println("- 4. Explicacion long                                     -");
            System.out.println("- 5. Explicacion float                                    -");
            System.out.println("- 6. Explicacion double                                   -");
            System.out.println("- 7. Explicacion char                                     -");
            System.out.println("- 8. Explicacion boolean                                  -");
            System.out.println("- 0. Salir a menu principal                               -");
            System.out.println("-----------------------------------------------------------");
            System.out.println("- por favor digite una opcion:  -");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Explicacion_byte();
                    break;
                case 2:
                    Explicacion_short();
                    break;
                case 3:
                    Explicacion_int();
                    break;
                case 4:
                    Explicacion_long();
                    break;
                case 5:
                    Explicacion_float();
                    break;
                case 6:
                    Explicacion_double();
                    break;
                case 7:
                    Explicacion_char();
                    break;
                case 8:
                    Explicacion_boolean();
                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 0);
    }
    private static void Explicacion_byte() {
        int opcion;

        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("                              Byte                                     ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("               un byte es una unidad de datos que                      ");
            System.out.println("tiene ocho dígitos binarios de longitud.  Un byte es la unidad que     ");
            System.out.println("la mayoría de las computadoras utilizan para representar un carácter,  ");
            System.out.println("como una letra, un número o un símbolo tipográfico. Cada byte puede    ");
            System.out.println("contener una cadena de bits que deben usarse en una unidad más grande  ");
            System.out.println("para fines de aplicación.                                              ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese la opción 0 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 0);
    }
    private static void Explicacion_short() {
        int opcion;
        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("                              Short                                    ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("               Este tipo de dato utiliza 16 bits con                   ");
            System.out.println("signo y puede almacenar valores numéricos en el rango de -32,768 a     ");
            System.out.println("32,767. Se utiliza cuando se necesita un rango más amplio que el       ");
            System.out.println("proporcionado por los bytes, pero aún se desea ahorrar memoria en      ");
            System.out.println("omparación con los tipos de dato más grandes.                          ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese la opción 0 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 0);
    }
    private static void Explicacion_int() {
        int opcion;
        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("                              int                                      ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Es un tipo de dato de 32 bits con signo utilizado para almacenar       ");
            System.out.println("valores numéricos. Su rango va desde -2,147,483,648 (-2^31)            ");
            System.out.println("hasta 2,147,483,647 (2^31 - 1). Es el tipo de dato más comunmente      ");
            System.out.println("utilizado para representar numeros enteros.                            ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese la opción 0 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 0);
    }
    private static void Explicacion_long() {
        int opcion;
        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("                              Long                                     ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Este tipo de dato utiliza 64 bits con signo y puede almacenar valores  ");
            System.out.println("numéricos en el rango de -9,223,372,036,854,775,808 (-2^63) a          ");
            System.out.println("9,223,372,036,854,775,807 (2^63 - 1). Se utiliza cuando se necesitan   ");
            System.out.println("números enteros muy grandes.                                           ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese la opción 0 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();


        } while (opcion != 0);
    }
    private static void Explicacion_float() {
        int opcion;
        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("                              Float                                    ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Es un tipo de dato diseñado para almacenar números en coma flotante    ");
            System.out.println("con precisión simple de 32 bits. Se utiliza cuando se requieren números");
            System.out.println("decimales con un grado de precisión adecuado para muchas aplicaciones. ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese la opción 0 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();


        } while (opcion != 0);
    }
    private static void Explicacion_double() {
        int opcion;
        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("                             Double                                    ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Este tipo de dato almacena números en coma flotante con doble          ");
            System.out.println("precisión de 64 bits, lo que proporciona una mayor precisión que float.");
            System.out.println("Se usa en aplicaciones que requieren una alta precisión en cálculos    ");
            System.out.println("numéricos.                                                             ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese la opción 0 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();


        } while (opcion != 0);
    }
    private static void Explicacion_char() {
        int opcion;
        do {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("                             Char                                          ");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Es un tipo de datos que representa un carácter Unicode sencillo de 16 bits.");
            System.out.println("Se utiliza para almacenar caracteres individuales,como letras o símbolos en");
            System.out.println("diferentes lenguajes y conjuntos de caracteres.                            ");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Ingrese la opción 0 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 0);
    }
    private static void Explicacion_boolean() {
        int opcion;
        do {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("                             Boolean                                       ");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Sirve para definir tipos de datos booleanos que pueden tener solo dos      ");
            System.out.println("valores: true o false. Aunque ocupa solo 1 bit de información, generalmente");
            System.out.println("se almacena en un byte completo por razones de eficiencia.                            ");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Ingrese la opción 0 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();


        } while (opcion != 0);
    }
    private static void Datos_String() {
        int opcion;

        do {

            System.out.println("-----------------------------------------------------------");
            System.out.println("-                   DATOS STRING                          -");
            System.out.println("-----------------------------------------------------------");
            System.out.println("- 1. Explicacion String                                   -");
            System.out.println("- 0. Salir a menu principal                               -");
            System.out.println("-----------------------------------------------------------");
            System.out.println("- por favor digite una opcion:  -");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Explicacion_byte();
                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 0);
    }
    private static void Constantes() {
        int opcion;

        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("                      Explicacion Constantes                           ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("En Java, una constante es un valor que se asigna a una variable y no   ");
            System.out.println("cambia durante la ejecución del programa. El valor de una constante se ");
            System.out.println("establece en el momento en que se declara y no puede cambiarse         ");
            System.out.println("posteriormente.                                                        ");
            System.out.println("ejemplo -final int DIAS_EN_SEMANA=7-. En este ejemplo, declaramos una  ");
            System.out.println("constante llamada DIAS_EN_SEMANA y le asignamos el valor de 7, que     ");
            System.out.println("representa el número de días en una semana.                            ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese la opción 0 para regresar al menu:                             ");
            opcion = scanner.nextInt();
            scanner.nextLine();


        } while (opcion != 0);
    }
    private static void Tiposdeoperadores() {
        int opcion=0;
        do {
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("                      Tipos de operadores                                          ");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("En el contexto de la programación en Java, los operadores son elementos            ");
            System.out.println("fundamentales que permiten realizar diversas operaciones y manipulaciones          ");
            System.out.println("en datos y variables. Estas operaciones pueden abarcar desde simples cálculos      ");
            System.out.println("matemáticos hasta evaluaciones de condiciones lógicas y manipulación de datos a    ");
            System.out.println("nivel de bits.                                                                     ");
            System.out.println("Los operadores son símbolos o palabras clave que se utilizan para llevar a cabo    ");
            System.out.println("estas acciones de manera eficiente.                                                ");
            System.out.println("En resumen, los operadores en Java te ayudan a manipular datos y realizar cálculos,");
            System.out.println("lo que es esencial para desarrollar aplicaciones Java robustas y funcionales.      ");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("- 1. Aritmeticos                                                -");
            System.out.println("- 2. Relacionales                                               -");
            System.out.println("- 3. Logicos                                                    -");
            System.out.println("- 4. Asignacion                                                 -");
            System.out.println("- 5. Incremento/Decremento                                      -");
            System.out.println("- 6. Salir anterior                                             -");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("- por favor digite una opcion:  -");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Aritmeticos();
                    break;
                case 2:
                    Relacionales();
                    break;
                case 3:
                    Logicos();
                    break;
                case 4:
                    Asignacion();
                    break;
                case 5:
                    Incremento_Decremento();
                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 6);
    }
    private static void Aritmeticos() {
        int opcion;

        do {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("                          Aritmeticos                                  ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Los operadores aritméticos en Java son símbolos especiales que se      ");
            System.out.println("utilizan para realizar operaciones matemáticas en variables numéricas. ");
            System.out.println("Estos operadores permiten realizar cálculos como la suma, resta,       ");
            System.out.println("multiplicación, división, etc.                                         ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese la opción 6 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 6);
    }
    private static void Relacionales() {
        int opcion;
        String titulo = "Relacionales";
        String descripcion = "Los operadores relacionales evalúan dos operandos, de tipo primitivo (byte, int, char, float, etc.)," +
                " relacionándolos entre si (de ahí su nombre). Devuelven un valor de tipo boolean. Dicho valor dependerá de si la relación (especificada por el operador) entre ambos" +
                " operandos es cierta (true) o falsa (false).";

        do {
            crearTabla(titulo, descripcion);
            System.out.println("Ingrese la opción 6 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 6);
    }
    private static void Logicos() {
        int opcion;
        String titulo = "Logicos";
        String descripcion = "Los operadores lógicos son herramientas poderosas para combinar o invertir condiciones lógicas en un programa Java. Los operadores lógicos más comunes son && (AND lógico), || (OR lógico) y ! (NOT lógico)." +
                "El operador && devuelve true si ambas condiciones son verdaderas, || devuelve true si al menos una condición es verdadera, y ! invierte el valor de una condición, es decir, cambia true a false y viceversa." +
                "Estos operadores son esenciales para construir expresiones condicionales complejas y tomar decisiones basadas en múltiples condiciones lógicas. Se utilizan en conjunto con operadores de comparación para crear lógica condicional robusta en programas Java.";

        do {
            crearTabla(titulo, descripcion);
            System.out.println("Ingrese la opción 6 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();


        } while (opcion != 6);
    }
    private static void Asignacion() {
        int opcion;
        String titulo = "Asignacion";
        String descripcion = "Los operadores de asignación son fundamentales en Java ya que permiten asignar valores a variables. A través de estos operadores, se puede almacenar información en variables para su posterior uso en el programa." +
                "El operador más comúnmente utilizado es el signo igual (=), que asigna el valor de la derecha a la variable de la izquierda. Por ejemplo, int x = 10; asigna el valor 10 a la variable x. Además del operador de asignación simple, Java proporciona operadores de asignación compuesta, como +=, -=, *=, /=, entre otros." +
                "Estos operadores permiten actualizar el valor de una variable mediante una operación aritmética y asignación en un solo paso. Por ejemplo, x += 5; aumenta el valor de x en 5 unidades.";

        do {
            crearTabla(titulo, descripcion);
            System.out.println("Ingrese la opción 6 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();


        } while (opcion != 6);
    }
    private static void Incremento_Decremento() {
        int opcion;
        String titulo = "Incremento_Decremento";
        String descripcion = "Los operadores de incremento (++) y decremento (—) son útiles para modificar el valor de una variable en una unidad." +
                "El operador de incremento aumenta el valor de la variable en 1, mientras que el operador de decremento lo disminuye en 1." +
                "Estos operadores son especialmente útiles en bucles y otras situaciones en las que se necesita actualizar una variable de forma repetida. También se pueden utilizar en combinación con operadores de asignación para realizar incrementos o decrementos personalizados, como x += 2; que incrementa x en 2 unidades.";

        do {
            crearTabla(titulo, descripcion);
            System.out.println("Ingrese la opción 6 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 6);
    }
    private static void Condicionalesif_else_ifelse() {        int opcion=0;
        do {
            System.out.println("-------------------------------------------------------------");
            System.out.println("            Condicionales IF - ELSE IF - ELSE                ");
            System.out.println("-------------------------------------------------------------");
            System.out.println("- 1. Explicacion de IF                                      -");
            System.out.println("- 2. Explicacion de ELSE IF                                 -");
            System.out.println("- 3. explicacion de ELSE                                    -");
            System.out.println("- 4. Programa de IF, ELSE IF, ELSE                          -");
            System.out.println("- 5. Salir                                                  -");
            System.out.println("-------------------------------------------------------------");
            System.out.println("- por favor digite una opcion:  -");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Explicacion_de_IF();
                    break;
                case 2:
                    Explicacion_de_ELSE_IF();
                    break;
                case 3:
                    Explicacion_de_ELSE();
                    break;
                case 4:
                    Programa_de_IF_ELSEIF_ELSE();
                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 5);
    }
    private static void Explicacion_de_IF() {
        int opcion;
        String titulo = "Explicacion de IF";
        String descripcion = "En el condicional IF se tiene una condición central que arroja como resultado verdadero o falso. Para cada resultado se puede realizar una acción diferente.";

        do {
            crearTabla(titulo, descripcion);
            System.out.println("Ingrese la opción 5 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 5);
    }
    private static void Explicacion_de_ELSE_IF() {
        int opcion;
        String titulo = "Explicacion de ELSE IF";
        String descripcion = "La estructura if-else se utiliza en Java para tomar decisiones sobre un valor preexistente. Es decir, si una condición basada en ese valor preexistente se cumple (si esa condición es verdadera), el programa tomará un camino.";

        do {
            crearTabla(titulo, descripcion);
            System.out.println("Ingrese la opción 5 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 5);
    }
    private static void Explicacion_de_ELSE() {
        int opcion;
        String titulo = "Explicacion de ELSE";
        String descripcion = "La declaración else especifica un bloque de código Java que se ejecutará si una condición es falsa en una declaración if .";

        do {
            crearTabla(titulo, descripcion);
            System.out.println("Ingrese la opción 5 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 5);
    }
    private static void Programa_de_IF_ELSEIF_ELSE() {
        int opcion;
        String titulo = "Programa de IF ELSEIF ELSE";
        String descripcion = "aqui va le ejecucion de automatizacion de IF, ELSE IF y ELSE";

        do {
            crearTabla(titulo, descripcion);
            System.out.println("Ingrese la opción 5 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 5);
    }
    private static void Condicional_Switch() {
        int opcion=0;
        do {
            System.out.println("-------------------------------------------------------------");
            System.out.println("                           SWITCH                            ");
            System.out.println("-------------------------------------------------------------");
            System.out.println("- 1. Explicacion de SWITCH                                  -");
            System.out.println("- 2. Programa de SWITCH, valide su calificación             -");
            System.out.println("- 3. Salir                                                  -");
            System.out.println("-------------------------------------------------------------");
            System.out.println("- por favor digite una opcion:  -");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Explicacion_de_SWITCH();
                    break;
                case 2:
                    Programa_de_SWITCH();
                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 3);
    }
    private static void Explicacion_de_SWITCH() {
        int opcion;
        String titulo = "Explicacion de SWITCH";
        String descripcion = "El switch en Java es una estructura de control que permite ejecutar diferentes bloques de código en función del valor de una variable. Imagina que tienes un semáforo con múltiples luces; el switch actúa como un operador que selecciona qué luz encender basado en el estado actual del tráfico.";

        do {
            crearTabla(titulo, descripcion);
            System.out.println("Ingrese la opción 3 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } while (opcion != 3);
    }
    private static void Programa_de_SWITCH() {
        int opcion;
        String titulo = "Programa_de_SWITCH";
        String descripcion = "Aqui va el Programa_de_SWITCH de la validacion de calificación";

        do {
            crearTabla(titulo, descripcion);
            System.out.println("Ingrese la opción 3 para regresar al menu: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" redirigiendo al menú                                           ");
                    System.out.println("----------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (opcion != 1);
    }
    private static void Condicional_Ternaria() {
        int opcion=0;
        do {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("                       TERNARIA                                  ");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("- 1. Explicacion de TERNARIA                                    -");
            System.out.println("- 2. Programa Ternaria, Determina si un programa es par o impar -");
            System.out.println("-------------------------------------------------------------");
            System.out.println("- por favor digite una opcion:  -");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Explicacion_de_TERNARIA();
                    break;
                case 2:
                    Programa_de_Ternaria();
                    break;
                case 3:
                    System.out.println("                                                       -");
                    System.out.println("- Salir a menu principal                               -");
                    System.out.println("                                                       -");
                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 3);
    }
    private static void Explicacion_de_TERNARIA() {
        int opcion;
        String titulo = "Explicacion de Ternaria";
        String descripcion = "El operador condicional ternario en Java es una forma abreviada de escribir una estructura condicional if-else en una sola línea de código. Es muy útil para simplificar el código cuando necesitas asignar un valor a una variable basado en una condición.";

        do {
            crearTabla(titulo, descripcion);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" redirigiendo al menú                                           ");
                    System.out.println("----------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (opcion != 1);
    }
    private static void Programa_de_Ternaria() {
        int opcion;
        String titulo = "Programa_de_Ternaria";
        String descripcion = "Aqui va el Programa_de_Ternaria de la validacion de calificación";

        do {
            crearTabla(titulo, descripcion);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" redirigiendo al menú                                           ");
                    System.out.println("----------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (opcion != 1);
    }
    private static void Bucle_do_while() {
        int opcion=0;
        do {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("                       DO WHILE                                  ");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("- 1. Explicacion de DO WHILE                                    -");
            System.out.println("- 2. Programa DO WHILE, Adivina el numero                       -");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("- por favor digite una opcion:  -");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Explicacion_de_DOWHILE();
                    break;
                case 2:
                    Programa_de_DOWHILE();
                    break;
                case 3:
                    System.out.println("                                                       -");
                    System.out.println("- Salir a menu principal                               -");
                    System.out.println("                                                       -");
                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 3);
    }
    private static void Explicacion_de_DOWHILE() {
        int opcion;
        String titulo = "Explicacion de DO WHILE";
        String descripcion = "El operador do-while en Java es una estructura de control de flujo que permite ejecutar un bloque de código al menos una vez y luego repetir la ejecución del bloque mientras se cumpla una condición específica. explicación paso a paso:" +
                "Bloque de código: Las instrucciones dentro del bloque do se ejecutan primero, sin importar si la condición es verdadera o falsa." +
                "Condición: Después de ejecutar el bloque de código, se evalúa la condición. Si la condición es verdadera, el bloque de código se ejecuta nuevamente. Este proceso se repite hasta que la condición sea falsa.";

        do {
            crearTabla(titulo, descripcion);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" redirigiendo al menú                                           ");
                    System.out.println("----------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (opcion != 1);
    }
    private static void Programa_de_DOWHILE() {
        int opcion;
        String titulo = "Programa_de_DOWHILE";
        String descripcion = "Aqui va el Programa_de_DOWHILE Adivina el numero";

        do {
            crearTabla(titulo, descripcion);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" redirigiendo al menú                                           ");
                    System.out.println("----------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (opcion != 1);
    }
    private static void Bucle_while() {
        int opcion=0;
        do {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("                          WHILE                                  ");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("- 1. Explicacion de WHILE                                       -");
            System.out.println("- 2. Programa WHILE, sumatoria de numeros                       -");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("- por favor digite una opcion:  -");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Explicacion_de_WHILE();
                    break;
                case 2:
                    Programa_de_WHILE();
                    break;
                case 3:
                    System.out.println("                                                       -");
                    System.out.println("- Salir a menu principal                               -");
                    System.out.println("                                                       -");
                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 3);
    }
    private static void Explicacion_de_WHILE() {
        int opcion;
        String titulo = "Explicacion de WHILE";
        String descripcion = "El operador while en Java es una estructura de control que permite repetir un bloque de código mientras una condición sea verdadera. La condición se evalúa antes de ejecutar el bloque de código, lo que significa que si la condición es falsa desde el principio, el bloque de código no se ejecutará ni una sola vez.";

        do {
            crearTabla(titulo, descripcion);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" redirigiendo al menú                                           ");
                    System.out.println("----------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (opcion != 1);
    }
    private static void Programa_de_WHILE() {
        int opcion;
        String titulo = "Programa_de_WHILE";
        String descripcion = "Aqui va el Programa_de_WHILE, sumatoria de numeros";

        do {
            crearTabla(titulo, descripcion);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" redirigiendo al menú                                           ");
                    System.out.println("----------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (opcion != 1);
    }
    private static void Bucle_for() {
        int opcion=0;
        do {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("                            FOR                                  ");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("- 1. Explicacion de FOR                                         -");
            System.out.println("- 2. Programa FOR, Ejercicio de sumatoria de numeros            -");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("- por favor digite una opcion:  -");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Explicacion_de_FOR();
                    break;
                case 2:
                    Programa_de_FOR();
                    break;
                case 3:
                    System.out.println("                                                       -");
                    System.out.println("- Salir a menu principal                               -");
                    System.out.println("                                                       -");
                    break;
                default:
                    System.out.println("- por favor digite una opcion correcta:                -");
            }
        } while (opcion != 3);
    }
    private static void Explicacion_de_FOR() {
        int opcion;
        String titulo = "Explicacion de FOR";
        String descripcion = "El operador for en Java es una estructura de control que permite repetir un bloque de código un número específico de veces. Es muy útil cuando sabes exactamente cuántas veces quieres que se ejecute un bloque de código.";

        do {
            crearTabla(titulo, descripcion);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" redirigiendo al menú                                           ");
                    System.out.println("----------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (opcion != 1);
    }
    private static void Programa_de_FOR() {
        int opcion;
        String titulo = "Programa_de_FOR";
        String descripcion = "Aqui va el Programa_de_FOR, sumatoria de numeros";

        do {
            crearTabla(titulo, descripcion);
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(" redirigiendo al menú                                           ");
                    System.out.println("----------------------------------------------------------------");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (opcion != 1);
    }
    public static void Salir() {
        System.out.println("Gracias por usar el programa. ¡Hasta luego!");
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