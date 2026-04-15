package org.example.unidad2.practica1;

public class sistema_pedidos {
}
import java.util.Scanner;

public class SistemaPedidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estado = "";

        while (!estado.equals("Entregado")) {
            System.out.print("Estado del pedido: ");
            estado = sc.nextLine();

            if (estado.equals("En camino")) {
                continue; // salta al siguiente ciclo
            }

            if (estado.equals("Error en envío")) {
                System.out.println("Proceso detenido por error.");
                break; // termina inmediatamente
            }

            if (estado.equals("Entregado")) {
                System.out.println("Pedido entregado correctamente.");
            }
        }
    }
}