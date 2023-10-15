package org.example;

import java.util.Random;

public class Persona {
    private int pisoActual;
    private int pisoDestino;

    public Persona() {
        Random random = new Random();
        this.pisoActual = random.nextInt(3) + 1;
        do {
            this.pisoDestino = random.nextInt(3) + 1;
        } while (this.pisoDestino == this.pisoActual);
    }

    public int getPisoActual() {
        return this.pisoActual;
    }

    public int getPisoDestino() {
        return this.pisoDestino;
    }
}