package org.example.unidad2.practica1;

public class AutenticaciónUsuario {
}
import java.util.Scanner;

public class Autenticacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorrecto = "admin";
        String passCorrecta = "pass123";

        boolean acceso = false;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Contraseña: ");
            String pass = sc.nextLine();

            if (usuario.equals(usuarioCorrecto)) {
                if (pass.equals(passCorrecta)) {
                    System.out.println("Autenticación exitosa.");
                    acceso = true;
                    break;
                } else {
                    System.out.println("Contraseña incorrecta.");
                }
            } else {
                System.out.println("Usuario no encontrado.");
            }
        }

        if (!acceso) {
            System.out.println("Demasiados intentos. Acceso denegado.");
        }
    }
}