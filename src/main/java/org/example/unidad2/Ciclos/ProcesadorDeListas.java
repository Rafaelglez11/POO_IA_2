package org.example.unidad2.Ciclos;

public class ProcesadorDeListas {
}
import java.util.Scanner;

public class ProcesadorDeListas {
    public static void main(String[] args) {

        String[] frutas = {"manzana", "banana", "pera", "uva"};

        // 🔹 Tarea 1: Imprimir arreglo (for)
        System.out.println("Lista de frutas:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }

        // 🔹 Tarea 2: Buscar fruta con 'P' (while)
        int i = 0;
        boolean encontrada = false;

        while (i < frutas.length && !encontrada) {
            if (frutas[i].toLowerCase().startsWith("p")) {
                System.out.println("Fruta encontrada: " + frutas[i] + " en posición " + i);
                encontrada = true;
            }
            i++;
        }

        // 🔹 Tarea 3: Validar entrada (do-while)
        Scanner sc = new Scanner(System.in);
        String frutaUsuario;
        boolean valida;

        do {
            System.out.print("Ingresa una fruta: ");
            frutaUsuario = sc.nextLine().toLowerCase();

            valida = false;

            for (String fruta : frutas) {
                if (fruta.equals(frutaUsuario)) {
                    valida = true;
                    break;
                }
            }

            if (!valida) {
                System.out.println("Fruta no válida, intenta de nuevo.");
            }

        } while (!valida);

        System.out.println("Fruta válida ingresada: " + frutaUsuario);

        sc.close();
    }
}