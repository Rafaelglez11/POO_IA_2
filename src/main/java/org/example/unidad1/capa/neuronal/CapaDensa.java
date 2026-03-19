package main.java.unidad1.capa.neuronal;

public class CapaDensa extends CapaNeuronal {

    public void propagacionHaciaAdelante() {
        super.propagacionHaciaAdelante();
    }

    @Override
    protected void transformarTensores() {
        System.out.println("Aplicando transformación lineal");

    }
}
