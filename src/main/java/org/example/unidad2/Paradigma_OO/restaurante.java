package org.example.unidad2.Paradigma_OO;

public class restaurante {
}

class Restaurante {
    String nombre;
    String tipoDeComida;
    int calificacion;

    void abrir() {
        System.out.println(nombre + " está abierto 🍽️");
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurante r1 = new Restaurante();
        r1.nombre = "La Parrilla";
        r1.tipoDeComida = "Mexicana";
        r1.calificacion = 5;

        Restaurante r2 = new Restaurante();
        r2.nombre = "Pizza House";
        r2.tipoDeComida = "Italiana";
        r2.calificacion = 4;

        r1.abrir();
        r2.abrir();
    }
}
