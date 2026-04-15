package org.example.unidad2.Excepciones;

public class CalculadoraPromedio2 {
}
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraPromedio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota1, nota2;

        try {
            // Pedir primera nota
            System.out.print("Ingresa la primera nota: ");
            nota1 = scanner.nextDouble();

            // Pedir segunda nota
            System.out.print("Ingresa la segunda nota: ");
            nota2 = scanner.nextDouble();

            // Calcular promedio
            double promedio = (nota1 + nota2) / 2;

            // Mostrar resultado
            System.out.println("El promedio es: " + promedio);

        } catch (InputMismatchException e) {
            // Error si no es número
            System.out.println("Error: Debes ingresar solo números válidos.");

        } finally {
            // Cerrar recursos
            scanner.close();
            System.out.println("Programa finalizado.");
        }
    }
}