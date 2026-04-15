package org.example.unidad2.Paradigma_OO;

public class Interfaces {
}

interface Encendible {
    void encender();
    void apagar();
}

class TV implements Encendible {
    public void encender() {
        System.out.println("TV encendida 📺");
    }

    public void apagar() {
        System.out.println("TV apagada");
    }
}

class Bombilla implements Encendible {
    public void encender() {
        System.out.println("Bombilla encendida 💡");
    }

    public void apagar() {
        System.out.println("Bombilla apagada");
    }
}