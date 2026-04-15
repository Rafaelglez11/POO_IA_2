package org.example.unidad2;

public class Conceptos_POO {
}

// Clase base
class Material {
    private String titulo;
    private String autor;

    // Constructor
    public Material(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // Método que será sobrescrito (polimorfismo)
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
}

// Clase derivada Libro
class Libro extends Material {
    private int numPaginas;

    public Libro(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("LIBRO");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Paginas: " + numPaginas);
    }
}

// Clase derivada Revista
class Revista extends Material {
    private int edicion;

    public Revista(String titulo, String autor, int edicion) {
        super(titulo, autor);
        this.edicion = edicion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("REVISTA");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Edicion: " + edicion);
    }
}

