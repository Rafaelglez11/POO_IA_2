package org.example.unidad2.aprendizaje_independientes;

public class Herencia {
}
#include <iostream>
using namespace std;

class Animal {
    public:
    virtual void hacerSonido() {
        cout << "Sonido generico" << endl;
    }
};

class Perro : public Animal {
    public:
    void hacerSonido() {
        cout << "Guau" << endl;
    }
};

class Gato : public Animal {
    public:
    void hacerSonido() {
        cout << "Miau" << endl;
    }
};

int main() {
    Perro p;
    Gato g;

    p.hacerSonido();
    g.hacerSonido();

    return 0;
}