package org.example.unidad3.mapas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class GeneradorVocabulario {
    public static void main(String[] args) {
        String texto = "El modelo de ia es un modelo bueno porque el modelo aprende";
        String [] tokens = texto.split(" ");

        // Instanciamos un Set con la implementación HashSet
        Set<String> vocabulario = new HashSet<>();

        // Iteramos el arreglo de tokens y agrgamos al set
        for (String t: tokens){
            vocabulario.add(t);
        }
        System.out.println("Vocabulario: " + vocabulario);
        System.out.println("Palabras procesadas: " + tokens.length);
        System.out.println("Número de palabras: " + vocabulario.size());
        System.out.println("Vocabulario final: " + vocabulario);

        if (vocabulario.contains("ia")){
            System.out.println("El vocabulario contiene la palabra ia");
        }
    }
}
