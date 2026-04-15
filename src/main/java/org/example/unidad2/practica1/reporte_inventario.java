package org.example.unidad2.practica1;

public class reporte_inventario {
}
public class ReporteInventario {
    public static void main(String[] args) {

        int[] stock = {60, 45, 8, 0, 23, 70, 5, 12, 0, 55};

        for (int i = 0; i < stock.length; i++) {
            int cantidad = stock[i];
            String estado;

            switch (cantidad) {
                case 0:
                    estado = "Descontinuado";
                    break;
                default:
                    if (cantidad > 50) {
                        estado = "En stock";
                    } else if (cantidad >= 10) {
                        estado = "Bajo stock";
                    } else {
                        estado = "Urgente";
                    }
            }

            System.out.println("Producto " + (i+1) + ": " + cantidad + " - " + estado);
        }
    }
}