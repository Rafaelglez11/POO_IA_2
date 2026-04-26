package org.example.unidad2.practica02;

import java.util.Scanner;

public class AccesoSistema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Contraseña: ");
            String pass = sc.nextLine();

            if (usuario.equals("medico1") && pass.equals("doc123")) {
                System.out.println("Acceso de Médico exitoso");
                break;
            } else if (usuario.equals("enfermera2") && pass.equals("enf456")) {
                System.out.println("Acceso de Enfermera exitoso");
                break;
            } else {
                System.out.println("Credenciales incorrectas");
                continue;
            }

            // Si es el último intento
            if (i == 3) {
                System.out.println("Demasiados intentos. Acceso denegado.");
            }
        }
    }
}
