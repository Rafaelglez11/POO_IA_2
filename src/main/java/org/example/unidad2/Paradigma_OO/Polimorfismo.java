package org.example.unidad2.Paradigma_OO;

public class Polimorfismo {
}

class Forma {
    double calcularArea() {
        return 0;
    }
}

class Circulo extends Forma {
    double radio;

    Circulo(double r) {
        radio = r;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Forma {
    double base, altura;

    Rectangulo(double b, double h) {
        base = b;
        altura = h;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }
}
