package main.java.unidad1.filtro.imagen;

public class DetectorDeBordes extends FiltroImagen{

    public DetectorDeBordes(int[][] imagen) {
        super(imagen);
    }

    @Override
    void aplicar(){
        System.out.println("Aplicando Kernel de detección de bordes... ");
    }
}