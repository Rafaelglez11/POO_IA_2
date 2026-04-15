package org.example.unidad2.Excepciones;

public class CalculadoraEdad {
}
import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraEdad {
    public static void main(String[] args) {

        int anioActual = 2025; // puedes cambiarlo si quieres
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa tu año de nacimiento: ");
            int anioNacimiento = scanner.nextInt();

            int edad = anioActual - anioNacimiento;
            System.out.println("Tu edad es: " + edad + " años.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número válido (año).");

        } finally {
            scanner.close();
            System.out.println("Programa finalizado.");
        }
    }
}