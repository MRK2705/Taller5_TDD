package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AscensorTest {
    private Ascensor ascensor;
    private Persona persona;

    @Before
    public void setUp() {
        ascensor = new Ascensor();
        persona = new Persona();
    }

    @Test
    public void testMoverAscensor() {
        int pisoDestino = persona.getPisoDestino();
        ascensor.mover(pisoDestino);
        assertEquals(pisoDestino, ascensor.getPisoActual());
        System.out.println("El ascensor se ha movido al piso " + pisoDestino);
    }

    @Test
    public void testCrearPersona() throws Exception{
        Persona persona = new Persona();
        assertNotNull(persona);
        int pisoActual = persona.getPisoActual();
        int pisoDestino = persona.getPisoDestino();
        System.out.println("La persona ha aparecido en el piso " + pisoActual + " y quiere ir al piso " + pisoDestino);
    }

    @Test
    public void testPisosDiferentesPersona() {
        assertNotEquals(persona.getPisoActual(), persona.getPisoDestino());
        System.out.println("La persona ha aparecido en el piso " + persona.getPisoActual() + " y quiere ir al piso " + persona.getPisoDestino());
    }

    @Test
    public void testSimularAscensor() throws Exception{
        ascensor.simularAscensor();
    }
}
