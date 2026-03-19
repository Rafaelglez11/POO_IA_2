package main.java.unidad1.contextualizacion.ingenieria;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String [] args) {

        List<ClasificadorIA> pipeline = new ArrayList<>();

        pipeline.add(new ArbolDeDesicion());
        pipeline.add(new SupportVectorMachine());
        pipeline.add(new RedNeuronal());

        for (ClasificadorIA f : pipeline){

            f.predecir();

        }

    }

}
