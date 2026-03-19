package main.java.unidad1.capa.neuronal;

public class CapaConvolucional extends CapaNeuronal{

    public void propagacionHaciaAdelante() {
        super.propagacionHaciaAdelante();
    }

    @Override
    protected void transformarTensores() {
        System.out.println("Extrayendo caracteristicas mediante kernels");
    }

}
