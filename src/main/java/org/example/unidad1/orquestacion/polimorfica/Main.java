package main.java.unidad1.orquestacion.polimorfica;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String [] args) {

        List<OptimizadorIA> lista = new ArrayList<>();

        lista.add (new DescensoGradiente());
        lista.add (new AlgoritmoGenetico());

        for (OptimizadorIA f : lista) {
            f.ajustarParametros();

        }

    }

}
