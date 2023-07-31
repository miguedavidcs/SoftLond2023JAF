import java.util.Arrays;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Ejemplo de variables primitivas
        int edad = 30;
        double salario = 2500.50;
        char genero = 'M';
        boolean esEmpleado = true;

        // Ejemplo de variables de referencia (objetos)
        String nombre = "Juan";
        int[] numeros = { 1, 2, 3, 4, 5 };

        // Ejemplo de constantes (variables finales)
        final double PI = 3.14159;
        final String NOMBRE_EMPRESA = "MiEmpresa";

        // Variables numéricas
        int numero1 = 10;
        int numero2 = 5;

        // Operaciones matemáticas
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;

        // Variables booleanas
        boolean esMayor = numero1 > numero2;
        boolean esMenor = numero1 < numero2;
        boolean sonIguales = numero1 == numero2;

        // Imprimir variables primitivas
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Género: " + genero);
        System.out.println("Es empleado: " + esEmpleado);

        // Imprimir variables de referencia (objetos)
        System.out.println("Nombre: " + nombre);
        System.out.print("Números: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Imprimir constantes
        System.out.println("Valor de PI: " + PI);
        System.out.println("Nombre de la empresa: " + NOMBRE_EMPRESA);

        // Condicional "if-else"
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        // Condicional "if-else if-else"
        int nota = 80;
        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        // Bucle "while"
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Bucle "do-while"
        int contadors = 1;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 5);

        // Bucle "for"
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }

        // Carga y acceso a elementos de un arreglo
        int[] numeross = { 1, 2, 3, 4, 5 };
        System.out.println("Elementos del arreglo:");
        for (int i = 0; i < numeross.length; i++) {
            System.out.println(numeross[i]);
        }

        // Carga y acceso a elementos de una matriz
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Elementos de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Switch y Case
        int diaSemana = 3;
        String nombreDia;
        switch (diaSemana) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
            case 7:
                nombreDia = "Fin de semana";
                break;
            default:
                nombreDia = "Día inválido";
                break;
        }

        // Bucle "for-each"
        int[] numero = { 1, 2, 3, 4, 5 };
        System.out.println("Elementos del arreglo con el bucle for-each:");
        for (int numer : numero) {
            System.out.println(numer);
        }

        // Imprimir el nombre del día de la semana
        System.out.println("Día de la semana: " + nombreDia);
        // Ejemplo de variables primitivas funcionales
        int edad_funcional = 30;
        double salario_funcional = 2500.50;
        char genero_funcional = 'M';
        boolean esEmpleado_funcional = true;

        // Ejemplo de variables de referencia (objetos) funcionales
        String nombre_funcional = "Juan";
        int[] numeros_funcional = { 1, 2, 3, 4, 5 };

        // Ejemplo de constantes (variables finales) funcionales
        final double PI_funcional = 3.14159;
        final String NOMBRE_EMPRESA_funcional = "MiEmpresa";

        // Variables numéricas funcionales
        int numero1_funcional = 10;
        int numero2_funcional = 5;

        // Operaciones matemáticas funcionales
        int suma_funcional = numero1_funcional + numero2_funcional;
        int resta_funcional = numero1_funcional - numero2_funcional;
        int multiplicacion_funcional = numero1_funcional * numero2_funcional;
        int division_funcional = numero1_funcional / numero2_funcional;

        // Variables booleanas funcionales
        boolean esMayor_funcional = numero1_funcional > numero2_funcional;
        boolean esMenor_funcional = numero1_funcional < numero2_funcional;
        boolean sonIguales_funcional = numero1_funcional == numero2_funcional;

        // Imprimir variables primitivas funcionales
        System.out.println("Edad: " + edad_funcional);
        System.out.println("Salario: " + salario_funcional);
        System.out.println("Género: " + genero_funcional);
        System.out.println("Es empleado: " + esEmpleado_funcional);

        // Imprimir variables de referencia (objetos) funcionales
        System.out.println("Nombre: " + nombre_funcional);
        System.out.print("Números: ");
        for (int num : numeros_funcional) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Imprimir constantes funcionales
        System.out.println("Valor de PI: " + PI_funcional);
        System.out.println("Nombre de la empresa: " + NOMBRE_EMPRESA_funcional);

        // Condicional "if-else" funcional
        if (edad_funcional >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        // Condicional "if-else if-else" funcional
        int nota_funcional = 80;
        if (nota_funcional >= 90) {
            System.out.println("Excelente");
        } else if (nota_funcional >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        // Bucle "while" funcional
        int contador_funcional = 1;
        while (contador_funcional <= 5) {
            System.out.println("Contador: " + contador_funcional);
            contador_funcional++;
        }

        // Bucle "do-while" funcional
        int contadors_funcional = 1;
        do {
            System.out.println("Contador: " + contador_funcional);
            contador_funcional++;
        } while (contador_funcional <= 5);

        // Bucle "for" funcional
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }

        // Carga y acceso a elementos de un arreglo funcional
        int[] numeross_funcional = { 1, 2, 3, 4, 5 };
        System.out.println("Elementos del arreglo: " + Arrays.toString(numeross_funcional));

        // Carga y acceso a elementos de una matriz funcional
        int[][] matriz_funcional = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Elementos de la matriz:");
        for (int[] fila : matriz_funcional) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

        // Bucle "for-each" funcional
        int[] numero_funcional = { 1, 2, 3, 4, 5 };
        System.out.println("Elementos del arreglo con el bucle for-each:");
        for (int numer : numero_funcional) {
            System.out.println(numer);
        }

    }

}
