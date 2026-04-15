package org.example.unidad2.Paradigma_OO;

public class Encapsulamiento {
}

class Empleado {
    private int id;
    private double salario;

    public Empleado(int id, double salario) {
        this.id = id;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentaje) {
        salario += salario * porcentaje / 100;
    }

    public double getSalario() {
        return salario;
    }
}
