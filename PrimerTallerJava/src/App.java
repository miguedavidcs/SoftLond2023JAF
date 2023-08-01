import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author miguel david castaño salgado
 */
public class App {
    /**
     * @category NIVEL BASICO
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner escribir = new Scanner(System.in);
        // Ejercicio1
        System.out.print("Ejercicio 1: Ingresa el primer número: ");
        int num1 = escribir.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = escribir.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        // Ejercicio 2
        System.out.print("\nEjercicio 2: Ingresa un número entero: ");
        int numEntero = escribir.nextInt();
        if (numEntero % 2 == 0) {
            System.out.println(numEntero + " es un número PAR.");
        } else {
            System.out.println(numEntero + " es un número IMPAR.");
        }

        // Ejercicio 3
        System.out.print("\nEjercicio 3: Ingresa el (r) Radio del círculo: ");
        double radio = escribir.nextDouble();
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);

        // Ejercicio 4
        System.out.print("\nEjercicio 4: Ingresa su edad: ");
        int edad = escribir.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // Ejercicio 5
        System.out.print("\nEjercicio 5: Ingresa el primer número: ");
        int numero1 = escribir.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int numero2 = escribir.nextInt();
        int mayor = Math.max(numero1, numero2);
        System.out.println("El mayor de los dos números es: " + mayor);

        // Ejercicio 6
        System.out.print("\nEjercicio 6: Ingresa un número: ");
        int numero = escribir.nextInt();
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Ejercicio 7
        System.out.print("\nEjercicio 7: Ingresa un número entero positivo: ");
        int tablaNum = escribir.nextInt();
        if (tablaNum <= 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(tablaNum + " x " + i + " = " + (tablaNum * i));
            }
        }

        // Ejercicio 8 esto esta comentado para poder hacer consola bien se demora mucho
        // en adivinar8
        /*
         * System.out.
         * println("\nEjercicio 8: Juego de adivinar un número entre 1 y 100.");
         * int nInconnita = (int) (Math.random() * 100) + 1;
         * int i = 0;//intentos
         * int nIngresado;
         * do {
         * System.out.print("Ingresa un número entre 1 y 100: ");
         * nIngresado = escribir.nextInt();
         * i++;
         * if (nIngresado > nInconnita) {
         * System.out.println("El número ingresado es mayor que el número a adivinar.");
         * } else if (nIngresado < nInconnita) {
         * System.out.println("El número ingresado es menor que el número a adivinar.");
         * }
         * } while (nIngresado != nInconnita);
         * System.out.println("¡Hasta que por fin lo lograste! Adivinaste el número " +
         * nInconnita + " en intentos:" + i);
         */
        // Ejercicio 9
        System.out.print("\nEjercicio 9: Ingresa un número entero positivo: ");
        int numFactorial = escribir.nextInt();
        if (numFactorial < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            int[] resultados = new int[numFactorial + 1];
            resultados[0] = 1;
            for (int k = 1; k <= numFactorial; k++) {
                resultados[k] = resultados[k - 1] * k; // Corrección aquí: usar 'k' en lugar de 'i'
            }
            System.out.println("El factorial de " + numFactorial + " es: " + resultados[numFactorial]);
        }

        // Ejercicio 10
        System.out.println("\nEjercicio 10: Los primeros 20 números de la serie Fibonacci.");
        int n = 20;
        int v1 = 0;
        int v2 = 1;
        for (int k = 1; k <= n; k++) {
            System.out.print(v1 + " ");
            int acomulados = v1 + v2;
            v1 = v2;
            v2 = acomulados;
        }

        // Ejercicio 11
        System.out.println("Ejercicio 11: Cálculo de Área de un Triángulo con la Fórmula de Herón");
        double a, b, c;
        do {
            System.out.print("Ingresa la longitud del primer lado: ");
            a = escribir.nextDouble();
            System.out.print("Ingresa la longitud del segundo lado: ");
            b = escribir.nextDouble();
            System.out.print("Ingresa la longitud del tercer lado: ");
            c = escribir.nextDouble();
        } while (a <= 0 || b <= 0 || c <= 0);
        double s = (a + b + c) / 2; // Semiperímetro
        double areaTriangulo = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("El área del triángulo es: " + areaTriangulo);

        // Ejercicio 12
        System.out.print("\nEjercicio 12: Determinar si un Número Entero es Primo o No");
        int n3;
        do {
            System.out.print("\nIngresa un número entero mayor que 1: ");
            n3 = escribir.nextInt();
        } while (n3 <= 1);
        boolean esPrimo = true;
        int i = 2;
        do {
            if (n3 % i == 0) {
                esPrimo = false;
                break;
            }
            i++;
        } while (i <= Math.sqrt(n3));
        if (esPrimo) {
            System.out.println(n3 + " es un número primo.");
        } else {
            System.out.println(n3 + " no es un número primo.");
        }
        // Ejercicio 13
        System.out.print("Ejercicio 13: Redondeo de un Número Decimal a una Cantidad Específica de Decimales");
        System.out.print("\nIngresa un número decimal: ");
        double x = escribir.nextDouble();
        System.out.print("Ingresa la cantidad de decimales para redondear: ");
        int d = escribir.nextInt();

        double factor = 1.0;
        for (int l = 1; l <= d; i++) {
            factor *= 10;
        }

        double resultadoRedondeo = Math.round(x * factor) / factor;
        System.out.println("El número redondeado es: " + resultadoRedondeo);
        // Ejercicio 14
        System.out.print("\nEjercicio 14: Verificar si un Número Entero Positivo es un Número Perfecto");
        int num;
        do {
            System.out.print("\nIngresa un número entero positivo: ");
            num = escribir.nextInt();
        } while (num <= 0);
        int sumaDivisores = 0;
        i = 1;
        do {
            if (num % i == 0) {
                sumaDivisores += i;
            }
            i++;
        } while (i <= num / 2);
        if (sumaDivisores == num) {
            System.out.println(num + " es un número perfecto.");
        } else {
            System.out.println(num + " no es un número perfecto.");
        }

        // Ejercicio 15
        System.out.print("\nEjercicio 15: Determinar si un Número Entero es Capicúa");
        int m;
        do {
            System.out.print("\nIngresa un número entero: ");
            m = escribir.nextInt();
        } while (m < 0);
        int numeroOriginal = m;
        int numeroInverso = 0;
        do {
            int digito = m % 10;
            numeroInverso = numeroInverso * 10 + digito;
            m /= 10;
        } while (m > 0);
        if (numeroOriginal == numeroInverso) {
            System.out.println(numeroOriginal + " es un número capicúa.");
        } else {
            System.out.println(numeroOriginal + " no es un número capicúa.");
        }
        // Ejercicio 16
        System.out.print("Ejercicio 6: Serie de Fibonacci hasta un número dado");
        System.out.print("\nIngresa el número límite: ");
        int limite = escribir.nextInt();
        int number1 = 0, number2 = 1;
        System.out.print(number1 + " ");
        while (number2 <= limite) {
            System.out.print(number2 + " ");
            int temp = number1 + number2;
            number1 = number2;
            number2 = temp;
        }

        // Ejercicio 17
        System.out.print("\nEjercicio 17: Números primos en un rango dado");
        System.out.print("\nIngresa el número inicial del rango: ");
        int inicio = escribir.nextInt();
        System.out.print("Ingresa el número final del rango: ");
        int fin = escribir.nextInt();
        System.out.print("Números primos en el rango: ");
        for (int w = inicio; w <= fin; w++) {
            if (esPrimo(w)) {
                System.out.print(w + " ");
            }

        }

        // Ejercicio 18
        System.out.println("\nEjercicio 18: Generar contraseña aleatoria de 8 caracteres");
        String password = generarContrasenia();
        System.out.println("Contraseña generada: " + password);

        // Ejercicio 19
        System.out.println("\nEjercicio 19: Imprimir nombre en mayúsculas y minúsculas");
        System.out.print("Ingresa tu nombre: ");
        String nombre = escribir.next();
        System.out.println("Nombre en mayúsculas: " + nombre.toUpperCase());
        System.out.println("Nombre en minúsculas: " + nombre.toLowerCase());

        // Ejercicio 20
        System.out.println("\nEjercicio 20: Invertir el orden de una cadena");
        System.out.print("Ingresa una cadena: ");
        String cadena = escribir.next();
        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);

        // Ejercicio 21
        System.out.println("\nEjercicio 21: Contar apariciones de una letra en una cadena");
        System.out.print("Ingresa una cadena: ");
        cadena = escribir.next();
        System.out.print("Ingresa la letra a buscar: ");
        char letra = escribir.next().charAt(0);
        int contador = contarApariciones(cadena, letra);
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la cadena.");

        // Ejercicio 22
        System.out.println("\nEjercicio 22: Verificar si una cadena es un palíndromo");
        System.out.print("Ingresa una cadena: ");
        cadena = escribir.next();
        boolean esPalindromo = esPalindromo(cadena);
        if (esPalindromo) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }

        // Ejercicio 23
        System.out.println("\nEjercicio 23: Contar palabras en una oración");
        System.out.print("Ingresa una oración: ");
        String oracion = escribir.nextLine();
        int palabras = contarPalabras(oracion);
        System.out.println("La oración tiene " + palabras + " palabras.");

        // Ejercicio 24
        System.out.println("\nEjercicio 24: Reemplazar letras en una cadena");
        System.out.print("Ingresa una cadena: ");
        cadena = escribir.next();
        System.out.print("Ingresa la letra a reemplazar: ");
        char letraReemplazar = escribir.next().charAt(0);
        System.out.print("Ingresa la letra de reemplazo: ");
        char letraReemplazo = escribir.next().charAt(0);
        String cadenaReemplazada = reemplazarLetra(cadena, letraReemplazar, letraReemplazo);
        System.out.println("Cadena con letras reemplazadas: " + cadenaReemplazada);

        // Ejercicio 25
        System.out.println("\nEjercicio 25: Imprimir cada palabra de una frase");
        System.out.print("Ingresa una frase: ");
        String frase = escribir.nextLine();
        imprimirPalabras(frase);

        // Ejercicio 26
        System.out.println("\nEjercicio 26: Contar caracteres sin espacios en blanco");
        System.out.print("Ingresa una cadena: ");
        cadena = escribir.nextLine();
        int caracteresSinEspacios = contarCaracteresSinEspacios(cadena);
        System.out.println("La cadena tiene " + caracteresSinEspacios + " caracteres sin espacios en blanco.");

        // Ejercicio 27
        System.out.println("\nEjercicio 27: Ordenar palabras alfabéticamente");
        System.out.print("Ingresa una frase: ");
        frase = escribir.nextLine();
        String palabrasOrdenadas = ordenarPalabras(frase);
        System.out.println("Palabras ordenadas alfabéticamente: " + palabrasOrdenadas);

        // Ejercicio 28
        System.out.println("\nEjercicio 28: Suma de elementos en un arreglo de enteros");
        System.out.print("Ingresa la cantidad de elementos en el arreglo: ");
        int n5 = escribir.nextInt();
        int[] arreglo = new int[n5];
        for (int r = 0; r < n5; r++) {
            System.out.print("Ingresa el elemento " + (r + 1) + ": ");
            arreglo[r] = escribir.nextInt();
        }
        int sumaElementos = sumarElementos(arreglo);
        System.out.println("La suma de los elementos en el arreglo es: " + sumaElementos);

        // Ejercicio 29
        System.out.println("\nEjercicio 29: Encontrar el número más grande en un arreglo de enteros");
        int maximo = encontrarMaximo(arreglo);
        System.out.println("El número más grande en el arreglo es: " + maximo);

        // Ejercicio 30
        System.out.println("\nEjercicio 30: Eliminar elementos duplicados de un arreglo");
        int[] arregloSinDuplicados = eliminarDuplicados(arreglo);
        System.out.print("Arreglo sin elementos duplicados: ");
        for (int elemento : arregloSinDuplicados) {
            System.out.print(elemento + " ");
        }
        int[] arr = { 5, 2, 9, 1, 5, 6, 12, 45, 6, 8, 34, 65, 23, 3, 5, 2, 5, 3, 8, 3, 7, 8, 1, 2, 3, 4, 5, 6, 7 };

        // Ejercicio 31: Ordenar un arreglo con el algoritmo de burbuja
        ordenarBub(arr);
        System.out.println("Arreglo ordenado con Burbuja: " + Arrays.toString(arr));

        // Ejercicio 32: Buscar un elemento en el arreglo y mostrar su índice
        System.out.print("Ingresa el número que deseas buscar: ");
        int numb = escribir.nextInt();
        int idx = buscarElem(arr, numb);
        if (idx != -1) {
            System.out.println("El número " + numb + " se encuentra en el índice " + idx);
        } else {
            System.out.println("El número " + numb + " no se encuentra en el arreglo.");
        }

        // Ejercicio 33: Contar la frecuencia de cada elemento en el arreglo
        contarFrec(arr);

        // Ejercicio 35: Rotar los elementos del arreglo hacia la izquierda o la derecha
        System.out.print("Ingresa la cantidad de posiciones para rotar (-ve: izquierda, +ve: derecha): ");
        int posRot = escribir.nextInt();
        rotarElementos(arr, posRot);
        System.out.println("Arreglo rotado: " + Arrays.toString(arr));

        // Ejercicio 36: Imprimir las tablas de multiplicar del 1 al 10 utilizando una
        // matriz
        imprimirTablasMultiplicar();

        escribir.close();
    }

    // metodos privados solo son utilizados por las clases publicas del mismo
    // paquete si los necesita
    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static String generarContrasenia() {
        String numeros = "0123456789";
        String lMayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lMinusculas = "abcdefghijklmnopqrstuvwxyz";

        String caracteres = lMayusculas + lMinusculas + numeros;
        StringBuilder contrasenia = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int index = (int) (Math.random() * caracteres.length());
            contrasenia.append(caracteres.charAt(index));
        }
        return contrasenia.toString();
    }

    private static String invertirCadena(String cadena) {
        StringBuilder invertida = new StringBuilder(cadena);
        return invertida.reverse().toString();
    }

    private static int contarApariciones(String cadena, char letra) {
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if (c == letra) {
                contador++;
            }
        }
        return contador;
    }

    private static boolean esPalindromo(String cadena) {
        int izquierda = 0;
        int derecha = cadena.length() - 1;
        while (izquierda < derecha) {
            if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    private static int contarPalabras(String oracion) {
        String[] palabras = oracion.split("\\s+");
        return palabras.length;
    }

    private static String reemplazarLetra(String cadena, char letraReemplazar, char letraReemplazo) {
        return cadena.replace(letraReemplazar, letraReemplazo);
    }

    private static void imprimirPalabras(String frase) {
        String[] palabras = frase.split("\\s+");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    private static int contarCaracteresSinEspacios(String cadena) {
        return cadena.replaceAll("\\s+", "").length();
    }

    private static String ordenarPalabras(String frase) {
        String[] palabras = frase.split("\\s+");
        Arrays.sort(palabras);
        return String.join(" ", palabras);
    }

    private static int sumarElementos(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }

    private static int encontrarMaximo(int[] arreglo) {
        int maximo = Integer.MIN_VALUE;
        for (int num : arreglo) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }

    private static int[] eliminarDuplicados(int[] arreglo) {
        Set<Integer> conjunto = new LinkedHashSet<>();
        for (int nuevonumero : arreglo) {
            conjunto.add(nuevonumero);
        }
        int[] resultado = new int[conjunto.size()];
        int index = 0;
        for (int nuevonumero : conjunto) {
            resultado[index++] = nuevonumero;
        }
        return resultado;
    }

    private static void ordenarBub(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean intercambioRealizado = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    intercambioRealizado = true;
                }
            }
            if (!intercambioRealizado) {
                break;
            }
        }
    }

    private static int buscarElem(int[] arr, int num) {
        return IntStream.range(0, arr.length)
                .filter(i -> arr[i] == num)
                .findFirst()
                .orElse(-1);
    }

    private static void contarFrec(int[] arr) {
        Map<Integer, Long> freq = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        freq.forEach((key, value) -> System.out.println("El número " + key + " aparece " + value + " veces."));
    }

    private static void rotarElementos(int[] arr, int pos) {
        int n = arr.length;
        if (pos < 0) {
            pos = (pos % n + n) % n;
        }
        int[] newArray = IntStream.concat(Arrays.stream(arr, pos, n), Arrays.stream(arr, 0, pos)).toArray();
        System.arraycopy(newArray, 0, arr, 0, n);
    }

    private static void imprimirTablasMultiplicar() {
        IntStream.rangeClosed(1, 10)
                .forEach(i -> {
                    System.out.println("Tabla del " + i + ":");
                    IntStream.rangeClosed(1, 10)
                            .forEach(j -> System.out.println(i + " x " + j + " = " + (i * j)));
                    System.out.println();
                });
    }
}
