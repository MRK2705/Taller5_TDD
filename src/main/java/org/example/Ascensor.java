package org.example;

public class Ascensor {
    private int pisoActual;
    private boolean puertaAbierta;

    public Ascensor() {
        this.pisoActual = 1;
        this.puertaAbierta = false; // La puerta comienza cerrada
    }

    public void mover(int pisoDestino) {
        this.pisoActual = pisoDestino;
    }

    public int getPisoActual() {
        return this.pisoActual;
    }

    public void abrirPuerta() {
        this.puertaAbierta = true;
        System.out.println("La puerta del ascensor se ha abierto");
    }

    public void cerrarPuerta() {
        this.puertaAbierta = false;
        System.out.println("La puerta del ascensor se ha cerrado");
    }

    public void simularAscensor() {
        Persona persona = new Persona();

        System.out.println("Una persona ha aparecido en el piso " + persona.getPisoActual() + " y quiere ir al piso " + persona.getPisoDestino());

        if(persona.getPisoActual()==persona.getPisoDestino()) {
            System.out.println("La persona ya está en el piso de destino");
        }
        this.mover(persona.getPisoActual());

        if(persona.getPisoActual()!=1) {
            System.out.println("La persona ha presionado el botón de llamada del ascensor");
            this.cerrarPuerta();
            System.out.println("El ascensor se ha movido al piso " + this.pisoActual);
            this.abrirPuerta();
            System.out.println("El ascensor ha recogido a la persona");
            this.cerrarPuerta();
        }
        else {
            System.out.println("La persona ha presionado el botón de llamada del ascensor");
            this.abrirPuerta();
            System.out.println("El ascensor ha recogido a la persona");
            this.cerrarPuerta();
        }

        this.mover(persona.getPisoDestino());
        System.out.println("El ascensor se ha movido al piso " + this.pisoActual);
        System.out.println("El ascensor ha llegado al piso de destino de la persona");
    }
}