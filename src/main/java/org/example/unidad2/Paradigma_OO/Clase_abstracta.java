package org.example.unidad2.Paradigma_OO;

public class Clase_abstracta {
}

abstract class Personaje {
    abstract void atacar();
}

class Guerrero extends Personaje {
    void atacar() {
        System.out.println("Guerrero ataca con espada ⚔️");
    }
}

class Mago extends Personaje {
    void atacar() {
        System.out.println("Mago lanza hechizo 🔮");
    }
}