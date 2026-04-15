package org.example.unidad2.Bifurcaciones;

public class practica1 {
}
public class SistemaCalificaciones {
    public static void main(String[] args) {

        int notaExamen = 95; // puedes cambiar este valor

        // Validar rango
        if (notaExamen < 0 || notaExamen > 100) {
            System.out.println("La nota es inválida");
        } else {

            // if-else para aprobar o no
            if (notaExamen >= 60) {
                System.out.println("¡Felicidades, has aprobado!");

                // if anidado
                if (notaExamen >= 90) {
                    System.out.println("¡Excelente desempeño!");
                }

            } else {
                System.out.println("Lo sentimos, no has aprobado.");
            }

            // switch para calificación literal
            char calificacion;

            switch (notaExamen / 10) {
                case 10:
                case 9:
                    calificacion = 'A';
                    break;
                case 8:
                    calificacion = 'B';
                    break;
                case 7:
                    calificacion = 'C';
                    break;
                case 6:
                    calificacion = 'D';
                    break;
                default:
                    calificacion = 'F';
            }

            System.out.println("Tu calificación es: " + calificacion);
        }
    }
}