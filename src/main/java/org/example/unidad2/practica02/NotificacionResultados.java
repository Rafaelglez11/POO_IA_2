package org.example.unidad2.practica02;

import java.util.Scanner;

public class NotificacionResultados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estado = "";

        while (!estado.equalsIgnoreCase("Listo para revisión")) {
            System.out.print("Ingresa el estado: ");
            estado = sc.nextLine();

            if (estado.equalsIgnoreCase("En proceso")) {
                continue; // sigue al siguiente ciclo
            } else if (estado.equalsIgnoreCase("Error en muestra")) {
                System.out.println("Proceso detenido por error");
                break; // detiene todo
            } else if (estado.equalsIgnoreCase("Listo para revisión")) {
                System.out.println("Proceso finalizado correctamente");
            } else {
                System.out.println("Estado desconocido");
            }
        }
    }
}
