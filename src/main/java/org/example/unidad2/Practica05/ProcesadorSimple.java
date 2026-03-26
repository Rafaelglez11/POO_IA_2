package org.example.unidad2.Practica05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ProcesadorSimple extends ProcesadorNLP{

    @Override
    public List<String> tokenizar() {
       tokens = new ArrayList<>(Arrays.asList(getTextoCrudo().split("\\s+")));
       return tokens;
    }

    @Override
    public void limpiarTexto() {
        String textoLimpio = getTextoCrudo().replace(".", " ").replace(",", " ");
        setTextoCrudo(textoLimpio);
    }

    @Override
    public Object transformarModelo() {
        return tokens.size();
    }

}


