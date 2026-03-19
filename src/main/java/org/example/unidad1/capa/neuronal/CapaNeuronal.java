package main.java.unidad1.capa.neuronal;

public abstract class CapaNeuronal {

    public void propagacionHaciaAdelante () {
        System.out.println("Flujo de datos");

    }

    protected abstract void transformarTensores();
}
