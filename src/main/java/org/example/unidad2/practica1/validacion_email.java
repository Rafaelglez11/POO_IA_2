package org.example.unidad2.practica1;

public class validacion_email {
}
import java.util.Scanner;

public class ValidarEmail {

    public static boolean validarEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email;

        do {
            System.out.print("Ingresa tu email: ");
            email = sc.nextLine();

            if (!validarEmail(email)) {
                System.out.println("Email inválido, intenta de nuevo.");
            }

        } while (!validarEmail(email));

        System.out.println("Email válido registrado.");
    }
}