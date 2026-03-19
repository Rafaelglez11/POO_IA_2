package main.java.unidad1.filtro.imagen;

public class ReductorDeRuido extends FiltroImagen{
    public ReductorDeRuido(int[][] imagen) {
        super(imagen);
    }

    @Override
    void aplicar() {
        System.out.println("Aplicandon filtro de suavizado");
    }
}
