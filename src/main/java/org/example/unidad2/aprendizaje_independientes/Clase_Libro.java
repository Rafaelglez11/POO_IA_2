package org.example.unidad2.Interface;

public class Clase_Libro {
}
#include <iostream>
using namespace std;

class Libro {
    public:
    string titulo;
    string autor;
    int paginas;

    void mostrarInfo() {
        cout << "Titulo: " << titulo << endl;
        cout << "Autor: " << autor << endl;
        cout << "Paginas: " << paginas << endl;
        cout << "------------------------" << endl;
    }
};

int main() {
    Libro libro1, libro2;

    libro1.titulo = "Cien años de soledad";
    libro1.autor = "Gabriel Garcia Marquez";
    libro1.paginas = 417;

    libro2.titulo = "1984";
    libro2.autor = "George Orwell";
    libro2.paginas = 328;

    libro1.mostrarInfo();
    libro2.mostrarInfo();

    return 0;
}