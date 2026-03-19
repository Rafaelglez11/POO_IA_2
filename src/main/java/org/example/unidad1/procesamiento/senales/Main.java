package main.java.unidad1.procesamiento.senales;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args){

        List<ProcesadorDeAudio> pipeline = new ArrayList<>();

        pipeline.add(new ReductorEco());
        pipeline.add(new Ecualizador());
        pipeline.add(new Normalizador());

        for (ProcesadorDeAudio f : pipeline){
            f.filtrar();

        }


    }

}
