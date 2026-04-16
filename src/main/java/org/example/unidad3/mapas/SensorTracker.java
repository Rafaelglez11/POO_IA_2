package org.example.unidad3.mapas;

import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class SensorTracker {
    public static void main(String[] args) {
        Set<String> camarasActivas = new HashSet<>();
        camarasActivas.add("CAM-01");
        camarasActivas.add("CAM-02");
        camarasActivas.add("CAM-03");
        camarasActivas.add("CAM-04");
        camarasActivas.add("CAM-05");
        camarasActivas.add("CAM-02");


        // Método remove para desactivar una camara
        camarasActivas.remove("CAM-03");


        // Operaciones de conjuntos (Teoría de conjuntos aplicada a la IA)
        Set<String> camarasEnMantenimento = new HashSet<>();
        camarasEnMantenimento.add("CAM-01");
        camarasEnMantenimento.add("CAM-05");

        // Método RemoveAll(); Diferencias de conjuntos
        // (Camaras activas que no están en mantenimiento)
        camarasActivas.removeAll(camarasEnMantenimento);
        System.out.println("Cámaras activas después de remover" +
                "las cámaras en mantenimiento: " + camarasActivas);

        // Métpdp clear para reiniciar la colección
        camarasActivas.clear();
    }
}
