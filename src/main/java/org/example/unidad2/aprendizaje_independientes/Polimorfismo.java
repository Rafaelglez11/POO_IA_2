package org.example.unidad2.aprendizaje_independientes;

public class Polimorfismo {
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
    Animal* animales[2];

    Perro p;
    Gato g;

    animales[0] = &p;
    animales[1] = &g;

    for (int i = 0; i < 2; i++) {
        animales[i]->hacerSonido();
    }

    return 0;
}