package main.java.unidad1.elementos.robot;

public class Brazo {

    private String tipoMovimiento;
    private float velocidad;

    // Metodos
    public static void main(String[] args) {

        Brazo brazo = new Brazo();
        brazo.setTipoMovimiento("Elevarse en Y");


    }

    public void asignarMovimiento(){}

    public void abrirGarra(){}

    public void cerrarGarra(){}


    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

}
