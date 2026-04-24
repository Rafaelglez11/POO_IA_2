package org.example.unidad2.Practica3;

public class Implementacion {// Clase abstracta base
    abstract class Empleado {

        // Método concreto
        public void trabajar() {
            System.out.println("El empleado está trabajando...");
        }

        // Método que será sobrescrito
        public void saludar() {
            System.out.println("Hola, soy un empleado.");
        }
    }

    // Subclase Cocinero
    class Cocinero extends Empleado {

        @Override
        public void saludar() {
            System.out.println("Hola, soy el cocinero. Estoy preparando la comida.");
        }
    }

    // Subclase Mesero
    class Mesero extends Empleado {

        @Override
        public void saludar() {
            System.out.println("Hola, soy el mesero. Estoy listo para atenderte.");
        }
    }

    // Clase principal
    public class Main {
        public static void main(String[] args) {

            // Arreglo de tipo Empleado (polimorfismo)
            Empleado[] empleados = new Empleado[2];

            empleados[0] = new Cocinero();
            empleados[1] = new Mesero();

            // Iterar sobre el arreglo
            for (Empleado e : empleados) {
                e.saludar();   // método sobrescrito
                e.trabajar();  // método heredado
                System.out.println("-------------------");
            }
        }
    }
}
