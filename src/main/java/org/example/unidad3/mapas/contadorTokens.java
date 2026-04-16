package org.example.unidad3.mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContadorTokens {
    public static void main(String[] args) {
        // Arreglo de cadenas
        String [] tokens = {"ia", "python", "redes", "neuronas", "ia", "neuronas"};

        // Instanciar Map (interface) la implementación Hashmap
        Map<String, Integer> frecuencias = new HashMap<>();

        // Iterar el arreglo y llenar el mapa de frecuencias
        for (String d: tokens){
            frecuencias.put(d, frecuencias.getOrDefault(d, 0)+1);
        }

        // Obtener las palabras únicas
        System.out.println("Vocabulario "+ " "+ frecuencias.keySet());

        // Iteramos el mapa
        for (Map.Entry<String, Integer> entrada: frecuencias.entrySet()){
            System.out.println("Tokens: " + " " + entrada.getKey() +
                    " " + " Frecuencia: " + entrada.getValue());
        }
    }
}