package org.example.unidad2;

// Clase principal
public class Biblioteca {
    public static void main(String[] args) {

        // Polimorfismo
        Material m1 = new Libro("Java Basico", "Juan Perez", 250);
        Material m2 = new Revista("Tech Today", "Maria Lopez", 10);

        System.out.println("=== INFORMACION ===");

        m1.mostrarInfo();
        System.out.println();
        m2.mostrarInfo();
    }
}
