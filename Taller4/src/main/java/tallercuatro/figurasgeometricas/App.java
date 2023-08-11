package main.java.tallercuatro.figurasgeometricas;

import java.util.Scanner;

import main.java.tallercuatro.figurasgeometricas.model.Adimensional;
import main.java.tallercuatro.figurasgeometricas.model.Lineales;
import main.java.tallercuatro.figurasgeometricas.submodel.Circulo;
import main.java.tallercuatro.figurasgeometricas.submodel.Cuadrado;
import main.java.tallercuatro.figurasgeometricas.submodel.Triangulo;

public class App {
    public static void main(String[] args) {
        int o;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Qué figura geométrica desea conocer:");
            System.out.println("| Opciones de Dimensiones |");
            System.out.println("| 0 - Una    Dimensión     |");
            System.out.println("| 1 - Una    Dimensión     |");
            System.out.println("| 2 - Dos    Dimensiones   |");

            System.out.print("Ingrese el número de la opción: ");

            o = scan.nextInt();

            switch (o) {
                case 0:
                    System.out.println("Ha seleccionado una Dimensión");
                    Adimensional punto = new Adimensional();
                    String definicion = punto.Definicion();
                    System.out.println(definicion);
                    break;
                case 1:
                    System.out.println("Ha seleccionado una Dimensión");
                    System.out.println("Estas Son las Lineas supongamos estas propiedades");
                    System.out.println("Ingrese las coordenadas del primer punto:");
                    System.out.print("x1: ");
                    double x1 = scan.nextDouble();
                    System.out.print("y1: ");
                    double y1 = scan.nextDouble();
                    System.out.println("Ingrese las coordenadas del segundo punto:");
                    System.out.print("x2: ");
                    double x2 = scan.nextDouble();
                    System.out.print("y2: ");
                    double y2 = scan.nextDouble();
                    Lineales linea = new Lineales(x1, x2, y1, y2);
                    double distancia = linea.calcularDistancia();
                    System.out.println("La distancia entre los dos puntos es: " + distancia);

                    break;
                case 2:
                    System.out.println("Ha seleccionado dos Dimensiones");
                    System.out.println("Escoja la figura a calcular:");
                    System.out.println("1 - Círculo");
                    System.out.println("2 - Cuadrado");
                    System.out.println("3 - Triángulo");
                    int figuraSeleccionada = scan.nextInt();

                    switch (figuraSeleccionada) {
                        case 1:
                            System.out.println("Ha seleccionado círculo");
                            System.out.print("Ingrese el radio del círculo: ");
                            double radioCirculo = scan.nextDouble();
                            Circulo circulo = new Circulo(radioCirculo);
                            System.out.println("El área del círculo es: " + circulo.calcularArea());
                            System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro());
                            break;
                        case 2:
                            System.out.println("Ha seleccionado cuadrado");
                            System.out.print("Ingrese el lado del cuadrado: ");
                            double ladoCuadrado = scan.nextDouble();
                            Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                            System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
                            System.out.println("El perímetro del cuadrado es: " + cuadrado.calcularPerimetro());
                            break;
                        case 3:
                            System.out.println("Ha seleccionado triángulo");
                            System.out.print("Ingrese la base del triángulo: ");
                            double baseTriangulo = scan.nextDouble();
                            System.out.print("Ingrese la altura del triángulo: ");
                            double alturaTriangulo = scan.nextDouble();
                            System.out.print("Ingrese el primer lado del triángulo: ");
                            double lado1Triangulo = scan.nextDouble();
                            System.out.print("Ingrese el segundo lado del triángulo: ");
                            double lado2Triangulo = scan.nextDouble();
                            System.out.print("Ingrese el tercer lado del triángulo: ");
                            double lado3Triangulo = scan.nextDouble();
                            Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo, lado1Triangulo,
                                    lado2Triangulo, lado3Triangulo);
                            System.out.println("El área del triángulo es: " + triangulo.calcularArea());
                            System.out.println("El perímetro del triángulo es: " + triangulo.calcularPerimetro());
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
            if (o != 2) {
                System.out.print("Presione Enter para continuar...");
                scan.nextLine();
                scan.nextLine();
            }
        } while (o != 2);

        scan.close();
    }
}
