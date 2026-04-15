package org.example.unidad2.Excepciones;

public class CalculadoraPromedio {
}
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraPromedio {
    public static void main(String[] args) {

        double nota1, nota2;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa la primera nota: ");
            nota1 = scanner.nextDouble();

            System.out.print("Ingresa la segunda nota: ");
            nota2 = scanner.nextDouble();

            double promedio = (nota1 + nota2) / 2;
            System.out.println("El promedio es: " + promedio);

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar solo números válidos.");

        } finally {
            scanner.close();
            System.out.println("Programa finalizado.");
        }
    }
}