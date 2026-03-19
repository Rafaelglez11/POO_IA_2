package main.java.unidad1.dron;

public class MainDrone {
    public static void main(String[] args) {

        Drone d1 = new Drone("Dron1", 100);
        Drone d2 = new Drone("Dron2", 100);
        Drone d3 = new Drone("Dron3", 100);

        d1.setNivelbateria(20);

        d1.mostrarestado();
        d2.mostrarestado();
        d3.mostrarestado();
    }

}
