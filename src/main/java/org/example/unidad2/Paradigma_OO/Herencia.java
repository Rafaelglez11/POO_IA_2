package org.example.unidad2.Paradigma_OO;

public class Herencia {
}

class Vehiculo {
    int velocidad = 0;
    int numLlantas;

    void acelerar() {
        velocidad += 5;
        System.out.println("Velocidad: " + velocidad);
    }
}

class Bicicleta extends Vehiculo {
    Bicicleta() {
        numLlantas = 2;
    }
}

class Automovil extends Vehiculo {
    Automovil() {
        numLlantas = 4;
    }

    @Override
    void acelerar() {
        velocidad += 20;
        System.out.println("Velocidad (Auto): " + velocidad);
    }
}