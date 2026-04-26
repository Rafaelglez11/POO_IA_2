package org.example.unidad2.practica02;

import java.util.Scanner;

public class HistorialPaciente {

    public static boolean validarIDPaciente(int id) {
        // Debe ser un número de 5 dígitos
        if (id >= 10000 && id <= 99999) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;

        do {
            System.out.print("Ingresa ID del paciente (5 dígitos): ");
            id = sc.nextInt();

        } while (!validarIDPaciente(id));

        System.out.println("ID válido. Acceso permitido.");
    }
}
