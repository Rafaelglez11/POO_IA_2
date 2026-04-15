package org.example.unidad2.Paradigma_OO;

public class Constructor {
}

class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);

        System.out.println("Área: " + c.calcularArea());
        System.out.println("Circunferencia: " + c.calcularCircunferencia());
    }
}