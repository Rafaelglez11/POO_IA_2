package org.example.unidad2.Practica05;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String texto = "El modelo es excelente, es un modelo muy bueno y genial, también, es. Impresionante.";

        List<ProcesadorNLP> procesadores = new ArrayList<>();

        procesadores.add(new ProcesadorSimple());
        procesadores.add(new ProcesadorAnalisisSentimiento());

        for (ProcesadorNLP p: procesadores){
            System.out.println("\n=== Procesador" + p.getClass().getSimpleName() + " ===");
            p.cargarTexto(texto);
            p.procesarTexto();
            Object resultado = p.transformarModelo();
            System.out.println("Resultados: " + resultado);


        }
    }
}
