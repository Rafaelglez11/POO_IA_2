package org.example.unidad2.Paradigma_OO;

public class Estudiantes {
}

import java.util.ArrayList;

class Estudiante {
    String nombre;
    int id;

    Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
}

class Clase {
    String nombreDeClase;
    ArrayList<Estudiante> estudiantes = new ArrayList<>();

    void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    void mostrarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e.nombre);
        }
    }
}