package main.java.unidad1.pipiline.procesamiento;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {

            List<FiltroImagen> pipeline = new ArrayList<>();

            pipeline.add(new ReductorRuido());
            pipeline.add(new DetectorBordes());
            pipeline.add(new EscalaGrises());

            for (FiltroImagen f : pipeline) {
                f.procesar();
            }

        }

    }
