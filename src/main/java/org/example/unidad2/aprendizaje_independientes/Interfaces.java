package org.example.unidad2.aprendizaje_independientes;

public class Interfaces {
}
#include <iostream>
using namespace std;

class PuedeVolar {
    public:
    virtual void volar() = 0; // método abstracto
};

class Avion : public PuedeVolar {
    public:
    void volar() {
        cout << "El avion enciende sus motores y despega" << endl;
    }
};

class Pajaro : public PuedeVolar {
    public:
    void volar() {
        cout << "El pajaro bate sus alas y vuela" << endl;
    }
};

int main() {
    PuedeVolar* objetos[2];

    Avion a;
    Pajaro p;

    objetos[0] = &a;
    objetos[1] = &p;

    for (int i = 0; i < 2; i++) {
        objetos[i]->volar();
    }

    return 0;
}