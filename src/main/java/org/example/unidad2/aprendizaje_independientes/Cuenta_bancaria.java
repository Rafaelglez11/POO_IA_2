package org.example.unidad2.aprendizaje_independientes;

public class Cuenta_bancaria {
}
#include <iostream>
using namespace std;

class CuentaBancaria {
    private:
    double saldo;

    public:
    CuentaBancaria(double saldoInicial) {
        saldo = saldoInicial;
    }

    void depositar(double cantidad) {
        saldo += cantidad;
    }

    void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            cout << "Fondos insuficientes" << endl;
        }
    }

    double getSaldo() {
        return saldo;
    }
};

int main() {
    CuentaBancaria cuenta(1000);

    cuenta.depositar(500);
    cuenta.retirar(300);
    cuenta.retirar(1500); // prueba de error

    cout << "Saldo actual: " << cuenta.getSaldo() << endl;

    return 0;
}
