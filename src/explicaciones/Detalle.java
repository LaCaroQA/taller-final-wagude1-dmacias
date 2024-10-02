package explicaciones;

import utilidades.Validaciones;

public class Detalle {
    public static void explicacionByte(){
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
    }

    public static void explicacionShort(){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                              Short                                    ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("               Este tipo de dato utiliza 16 bits con                   ");
        System.out.println("signo y puede almacenar valores numéricos en el rango de -32,768 a     ");
        System.out.println("32,767. Se utiliza cuando se necesi}ta un rango más amplio que el       ");
        System.out.println("proporcionado por los bytes, pero aún se desea ahorrar memoria en      ");
        System.out.println("omparación con los tipos de dato más grandes.                          ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Ingrese la opción 0 para regresar al menu: ");
        }

        public static void explicacionInt() {

            System.out.println("-----------------------------------------------------------------------");
            System.out.println("                              int                                      ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Es un tipo de dato de 32 bits con signo utilizado para almacenar       ");
            System.out.println("valores numéricos. Su rango va desde -2,147,483,648 (-2^31)            ");
            System.out.println("hasta 2,147,483,647 (2^31 - 1). Es el tipo de dato más comunmente      ");
            System.out.println("utilizado para representar numeros enteros.                            ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese la opción 0 para regresar al menu: ");
        }

        public static void explicacionLong(){

            System.out.println("-----------------------------------------------------------------------");
            System.out.println("                              Long                                     ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Este tipo de dato utiliza 64 bits con signo y puede almacenar valores  ");
            System.out.println("numéricos en el rango de -9,223,372,036,854,775,808 (-2^63) a          ");
            System.out.println("9,223,372,036,854,775,807 (2^63 - 1). Se utiliza cuando se necesitan   ");
            System.out.println("números enteros muy grandes.                                           ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Ingrese la opción 0 para regresar al menu: ");

        }
        public static void explicacionFloat(){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                              Float                                    ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Es un tipo de dato diseñado para almacenar números en coma flotante    ");
        System.out.println("con precisión simple de 32 bits. Se utiliza cuando se requieren números");
        System.out.println("decimales con un grado de precisión adecuado para muchas aplicaciones. ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Ingrese la opción 0 para regresar al menu: ");
    }

    public static void explicacionDouble(){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                             Double                                    ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Este tipo de dato almacena números en coma flotante con doble          ");
        System.out.println("precisión de 64 bits, lo que proporciona una mayor precisión que float.");
        System.out.println("Se usa en aplicaciones que requieren una alta precisión en cálculos    ");
        System.out.println("numéricos.                                                             ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Ingrese la opción 0 para regresar al menu: ");
    }
    public static void explicacionChar(){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("                             Char                                          ");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Es un tipo de datos que representa un carácter Unicode sencillo de 16 bits.");
        System.out.println("Se utiliza para almacenar caracteres individuales,como letras o símbolos en");
        System.out.println("diferentes lenguajes y conjuntos de caracteres.                            ");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Ingrese la opción 0 para regresar al menu: ");

    }
    public static void explicacionBoolean(){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("                             Boolean                                       ");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Sirve para definir tipos de datos booleanos que pueden tener solo dos      ");
        System.out.println("valores: true o false. Aunque ocupa solo 1 bit de información, generalmente");
        System.out.println("se almacena en un byte completo por razones de eficiencia.                            ");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Ingrese la opción 0 para regresar al menu: ");

    }
    /////////////// Menu Datos String

    public static void explicacionString(){
        System.out.println("--------------------------------------------------------------------------- ");
        System.out.println("                             String                                         ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("El objeto String se utiliza para representar y manipular una secuencia      ");
        System.out.println("de caracteres. Se conoce como Cadenas de texto                              ");
        System.out.println("String  ciudad = X                                                          ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Ingrese la opción 0 para regresar al menu: ");
    }
  ////////////////Menu Constantes
    public static void explicacionConstante(){
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
    }

    ////////////////Aritmeticos
    public static void explicaionAritmeticos(){
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                          Aritmeticos                                  ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Los operadores aritméticos en Java son símbolos especiales que se      ");
        System.out.println("utilizan para realizar operaciones matemáticas en variables numéricas. ");
        System.out.println("Estos operadores permiten realizar cálculos como la suma, resta,       ");
        System.out.println("multiplicación, división, etc.                                         ");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Ingrese la opción 0 para regresar al menu: ");
    }

    //Relacionales();
    public static void explicacionRelacionales() {
        String  titulo = "Relacionales";
        String  descripcion = "Los operadores relacionales evalúan dos operandos, de tipo primitivo (byte, int, char, float, etc.)," +
                " relacionándolos entre si (de ahí su nombre). Devuelven un valor de tipo boolean. Dicho valor dependerá de si la relación (especificada por el operador) entre ambos" +
                " operandos es cierta (true) o falsa (false).";
        Validaciones.crearTabla(titulo, descripcion);
    }
    //Logicos();
    public static void explicacionLogicos(){
        String titulo = "Logicos";
        String descripcion = "Los operadores lógicos son herramientas poderosas para combinar o invertir condiciones lógicas en un programa Java. Los operadores lógicos más comunes son && (AND lógico), || (OR lógico) y ! (NOT lógico)." +
                "El operador && devuelve true si ambas condiciones son verdaderas, || devuelve true si al menos una condición es verdadera, y ! invierte el valor de una condición, es decir, cambia true a false y viceversa." +
                "Estos operadores son esenciales para construir expresiones condicionales complejas y tomar decisiones basadas en múltiples condiciones lógicas. Se utilizan en conjunto con operadores de comparación para crear lógica condicional robusta en programas Java.";
        Validaciones.crearTabla(titulo, descripcion);
    }

    //Asignacion();
    public static void explicacionAsignacion(){
        String titulo = "Asignacion";
        String descripcion = "Los operadores de asignación son fundamentales en Java ya que permiten asignar valores a variables. A través de estos operadores, se puede almacenar información en variables para su posterior uso en el programa." +
                "El operador más comúnmente utilizado es el signo igual (=), que asigna el valor de la derecha a la variable de la izquierda. Por ejemplo, int x = 10; asigna el valor 10 a la variable x. Además del operador de asignación simple, Java proporciona operadores de asignación compuesta, como +=, -=, *=, /=, entre otros." +
                "Estos operadores permiten actualizar el valor de una variable mediante una operación aritmética y asignación en un solo paso. Por ejemplo, x += 5; aumenta el valor de x en 5 unidades.";
        Validaciones.crearTabla(titulo, descripcion);

    }

    //Incremento_Decremento();

    public static void explicacionIncrementoDecremento(){
        String titulo = "Incremento_Decremento";
        String descripcion = "Los operadores de incremento (++) y decremento (—) son útiles para modificar el valor de una variable en una unidad." +
                "El operador de incremento aumenta el valor de la variable en 1, mientras que el operador de decremento lo disminuye en 1." +
                "Estos operadores son especialmente útiles en bucles y otras situaciones en las que se necesita actualizar una variable de forma repetida. También se pueden utilizar en combinación con operadores de asignación para realizar incrementos o decrementos personalizados, como x += 2; que incrementa x en 2 unidades.";
        Validaciones.crearTabla(titulo, descripcion);

    }

    public static void explicacionIf(){
        String titulo = "Explicacion de IF";
        String descripcion = "En el condicional IF se tiene una condición central que arroja como resultado verdadero o falso. Para cada resultado se puede realizar una acción diferente.";
        Validaciones.crearTabla(titulo, descripcion);
    }
    public static void explicacionElseIf(){
        String titulo = "Explicacion de ELSE IF";
        String descripcion = "La estructura if-else se utiliza en Java para tomar decisiones sobre un valor preexistente. Es decir, si una condición basada en ese valor preexistente se cumple (si esa condición es verdadera), el programa tomará un camino.";
        Validaciones.crearTabla(titulo, descripcion);
    }

    public static void explicacionElse(){
        String titulo = "Explicacion de ELSE";
        String descripcion = "La declaración else especifica un bloque de código Java que se ejecutará si una condición es falsa en una declaración if .";
        Validaciones.crearTabla(titulo, descripcion);
    }
    public static void programaIfElse(){
        String titulo = "Programa de IF ELSEIF ELSE";
        String descripcion = "aqui va le ejecucion de automatizacion de IF, ELSE IF y ELSE";
        Validaciones.crearTabla(titulo, descripcion);
    }

    //////////////////Explicacion Switch
    public static void explicacionSwitch(){
        String titulo = "Explicacion de SWITCH";
        String descripcion = "El switch en Java es una estructura de control que permite ejecutar diferentes bloques de código en función del valor de una variable. Imagina que tienes un semáforo con múltiples luces; el switch actúa como un operador que selecciona qué luz encender basado en el estado actual del tráfico.";
        Validaciones.crearTabla(titulo, descripcion);
    }
    public static void programaSwitch(){
        String titulo = "Programa_de_SWITCH";
        String descripcion = "Aqui va el Programa_de_SWITCH de la validacion de calificación";
        Validaciones.crearTabla(titulo, descripcion);
    }

    //////////////////Explicacion Ternaria
    public static void explicacionTernaria(){
        String titulo = "Explicacion de Ternaria";
        String descripcion = "El operador condicional ternario en Java es una forma abreviada de escribir una estructura condicional if-else en una sola línea de código. Es muy útil para simplificar el código cuando necesitas asignar un valor a una variable basado en una condición.";
        Validaciones.crearTabla(titulo, descripcion);
    }
    public static void programaTernaria(){
        String titulo = "Programa_de_Ternaria";
        String descripcion = "Aqui va el Programa_de_Ternaria de la validacion de calificación";
        Validaciones.crearTabla(titulo, descripcion);
    }

    //////////////////Explicacion DoWhile
    public static void explicacionDoWhile(){
        String titulo = "Explicacion de DO WHILE";
        String descripcion = "El operador do-while en Java es una estructura de control de flujo que permite ejecutar un bloque de código al menos una vez y luego repetir la ejecución del bloque mientras se cumpla una condición específica. explicación paso a paso:" +
                "Bloque de código: Las instrucciones dentro del bloque do se ejecutan primero, sin importar si la condición es verdadera o falsa." +
                "Condición: Después de ejecutar el bloque de código, se evalúa la condición. Si la condición es verdadera, el bloque de código se ejecuta nuevamente. Este proceso se repite hasta que la condición sea falsa.";
        Validaciones.crearTabla(titulo, descripcion);
    }
    public static void programaDoWhile(){
        String titulo = "Programa_de_DOWHILE";
        String descripcion = "Aqui va el Programa_de_DOWHILE Adivina el numero";

        Validaciones.crearTabla(titulo, descripcion);
    }
    //////////////////Explicacion While
    public static void explicacionWhile(){
        String titulo = "Explicacion de WHILE";
        String descripcion = "El operador while en Java es una estructura de control que permite repetir un bloque de código mientras una condición sea verdadera. La condición se evalúa antes de ejecutar el bloque de código, lo que significa que si la condición es falsa desde el principio, el bloque de código no se ejecutará ni una sola vez.";
 Validaciones.crearTabla(titulo, descripcion);
    }
    public static void programaWhile(){
        String titulo = "Programa_de_WHILE";
        String descripcion = "Aqui va el Programa_de_WHILE, sumatoria de numeros";

        Validaciones.crearTabla(titulo, descripcion);
    }

    //////////////////Explicacion For
    public static void explicacionFor(){
        String titulo = "Explicacion de FOR";
        String descripcion = "El operador for en Java es una estructura de control que permite repetir un bloque de código un número específico de veces. Es muy útil cuando sabes exactamente cuántas veces quieres que se ejecute un bloque de código.";
        Validaciones.crearTabla(titulo, descripcion);
    }
    public static void programaFor(){
        String titulo = "Programa_de_FOR";
        String descripcion = "Aqui va el Programa_de_FOR, sumatoria de numeros";

        Validaciones.crearTabla(titulo, descripcion);
    }
}
