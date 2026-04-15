package org.example.unidad2.PrácticasPOO;

public class ManejoDeCiclos {
}
public class ManejoDeCiclos {

    public static void main(String[] args) {

        // 🔹 Tarea 1: while
        System.out.println("Conteo ascendente (while):");
        int contador = 1;

        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        // 🔹 Tarea 2: do-while
        System.out.println("\nConteo descendente (do-while):");
        int numero = 10;

        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 8);

        // 🔹 Tarea 3: for
        System.out.println("\nTabla del 7 (for):");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
    }
}