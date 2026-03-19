package main.java.unidad1.dron;

public class Drone {

    private String id;
    private int nivelbateria;

    public Drone(String id, int bateriainicio) {

        this.id = id;
        this.nivelbateria = bateriainicio;

    }

    public void setNivelbateria(int nivelbateria) {
        this.nivelbateria = nivelbateria;
    }

    public void mostrarestado() {
        System.out.println("Batería del " + id + ": " + nivelbateria + "%");
    }
}

