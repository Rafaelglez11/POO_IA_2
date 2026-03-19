package main.java.unidad1.carrito;

public class AplicacionMetodo extends FuncionesVehiculo {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String frenar() {
        return "Se esta frenando";
    }

    @Override
    public String acelerar() {
        return "Se esta acelerando";
    }

    public static void main (String[] args) {

        AplicacionMetodo operacion = new AplicacionMetodo();

        System.out.println(operacion.frenar());

        System.out.println(operacion.acelerar());

    }

}
