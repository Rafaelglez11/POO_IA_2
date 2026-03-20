package org.example.unidad2.Practica04;

public class SensorUltrasonido {
}

public class SensorUltrasonido extends SensorIA {

    public SensorUltrasonido(String modelo, double consumoEnergia) {
        super(modelo, consumoEnergia);
    }

    @Override
    public void leerDatos() {
        System.out.println("Enviando pulso sónico... Midiendo tiempo de rebote para proximidad.");
    }
}