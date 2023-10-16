package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AscensorTest {
    private Ascensor ascensor;
    private Persona persona;

    @Test
    public void testCrearPersona(){
        //1. Preparacion de la prueba
        Persona persona = new Persona();

        //2. Logica de la prueba

        //3. Verificacion o assert
        assertNotNull(persona);
        int pisoActual = persona.getPisoActual();
        int pisoDestino = persona.getPisoDestino();
        System.out.println("La persona ha aparecido en el piso " + pisoActual + " y quiere ir al piso " + pisoDestino);
    }

    @Test
    public void testMoverAscensor(){
        //1. Preparacion de la prueba
        Persona persona = new Persona();
        Ascensor ascensor = new Ascensor();

        //2. Logica de la prueba
        int pisoDestino = persona.getPisoDestino();
        ascensor.mover(pisoDestino);
        if (pisoDestino == 1) {
            System.out.println("El ascensor ya está en el piso de la persona (piso:" + pisoDestino + ")");
        } else {
            System.out.println("El ascensor se ha movido al piso " + pisoDestino);
        }

        //3. Verificacion o assert
        assertEquals(pisoDestino, ascensor.getPisoActual());
    }

    @Test
    public void testPisosDiferentesPersona() {
        //1. Preparacion de la prueba
        Persona persona = new Persona();

        //2. Logica de la prueba

        //3. Verificacion o assert
        assertNotEquals(persona.getPisoActual(), persona.getPisoDestino());
        System.out.println("La persona ha aparecido en el piso " + persona.getPisoActual() + " y quiere ir al piso " + persona.getPisoDestino());
    }

    @Test
    public void testSimularAscensor(){
        //1. Preparacion de la prueba
        Ascensor ascensor = new Ascensor();

        //2. Logica de la prueba
        ascensor.simularAscensor();

        //3. Verificacion o assert
        assertNotNull(ascensor);
    }

}
