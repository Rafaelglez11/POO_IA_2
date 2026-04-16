package org.example.unidad3.mapas;

import java.util.HashMap;
import java.util.Map;

public class ContadorTokensOptimizado {
    // Arreglo de cadena
    public static void main(String[] args) {
        String [] tokens = {"ia", "python", "redes", "neuronas", "ia", "neuronas"};
        Map<String, Integer> frecuencias = new HashMap<>();

        for(String t: tokens){
            frecuencias.merge(t, 1,( valorAnterior, valorNuevo) -> valorAnterior + valorNuevo);
        }

        System.out.println("Frecuencias con el método Merge de Map");
        frecuencias.forEach((k, v) -> System.out.println(k +": "+ v ));

    }
}