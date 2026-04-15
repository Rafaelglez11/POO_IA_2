package org.example.unidad2.Paradigma_OO;

public class Productos {
}

class Producto {
    String nombre;
    double precio;

    void mostrarDetalles() {
        System.out.println(nombre + " - $" + precio);
    }
}

class Electronica extends Producto {
    int garantia;

    @Override
    void mostrarDetalles() {
        System.out.println(nombre + " - $" + precio + " Garantía: " + garantia + " meses");
    }
}

class Alimento extends Producto {
    String fechaCaducidad;

    @Override
    void mostrarDetalles() {
        System.out.println(nombre + " - $" + precio + " Caduca: " + fechaCaducidad);
    }
}