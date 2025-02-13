package edu.estatuas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DniTest {

    private Dni Dni;

    @BeforeEach
    void setUp() {
        Dni = new Dni();
    }

    @Test
    void getDni() {
        Dni.setDni("32830547W");
        assertEquals("32830547W", Dni.getDni());
    }

    @Test
    void getNumero() {
        Dni.setDni("32830547W");
        assertEquals(32830547, Dni.getNumero());
    }

    @Test
    void getLetra() {
        Dni.setDni("32830547W");
        assertEquals('W', Dni.getLetra());
    }

    @Test
    void asignarLetra() {
        Dni.setDni("32830547W");
        assertEquals("32830547W", Dni.asignarLetra());
    }

    @Test
    void verificarLetra() {
        Dni.setDni("32830547W");
        assertTrue(Dni.verificarLetra());
    }
}