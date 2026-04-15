package org.example.unidad2.Ciclos;

public class AnalizadorDeNumeros {
}
import java.util.Scanner;

public class AnalizadorDeNumeros {
    public static void main(String[] args) {

        // 🔹 Tarea 1: Suma del 1 al 100 (for)
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma += i;
        }

        System.out.println("Suma del 1 al 100: " + suma);

        // 🔹 Tarea 2: Primer número mayor a 50 (while)
        int num = 1;

        while (true) {
            if (num > 50) {
                System.out.println("Primer número mayor a 50: " + num);
                break;
            }
            num++;
        }

        // 🔹 Tarea 3: Validar contraseña (do-while)
        Scanner sc = new Scanner(System.in);
        String contraseñaCorrecta = "1234";
        String contraseña;
        boolean esCorrecta = false;

        do {
            System.out.print("Ingresa la contraseña: ");
            contraseña = sc.nextLine();

            if (contraseña.equals(contraseñaCorrecta)) {
                esCorrecta = true;
                System.out.println("Contraseña correcta.");
            } else {
                System.out.println("Contraseña incorrecta.");
            }

        } while (!esCorrecta);

        sc.close();
    }
}