package main.java.unidad1.filtro.imagen;

abstract class FiltroImagen {
    protected int [][] imagen;


    public FiltroImagen(int [][] imagen){
        this.imagen = imagen;
    }

    abstract void aplicar();

}