package main.java.unidad1.dataset;

public abstract class Dataset {

    public void cargarDatos(String cargandoDatosAlDataset) {
        System.out.println("Cargando datos al dataset...");
    }

    public abstract void cargarDatos();

}
