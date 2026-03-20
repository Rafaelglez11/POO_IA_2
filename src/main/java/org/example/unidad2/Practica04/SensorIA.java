package org.example.unidad2.Practica04;

public class SensorIA {
}

public abstract class SensorIA {
    protected String modelo;
    protected double consumoEnergia;

    public SensorIA(String modelo, double consumoEnergia) {
        this.modelo = modelo;
        this.consumoEnergia = consumoEnergia;
    }

    // Método abstracto
    public abstract void leerDatos();
}

