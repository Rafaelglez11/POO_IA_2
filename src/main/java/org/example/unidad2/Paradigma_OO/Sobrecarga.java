package org.example.unidad2.Paradigma_OO;

public class Sobrecarga {
}

class Calculadora {

    int sumar(int a, int b) {
        return a + b;
    }

    int sumar(int a, int b, int c) {
        return a + b + c;
    }

    double sumar(double a, double b) {
        return a + b;
    }
}