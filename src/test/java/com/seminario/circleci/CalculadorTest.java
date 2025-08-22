package com.seminario.circleci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTest {
    @Test
    public void testSum() {
        Calculador calculador = new Calculador();
        assertEquals(4, calculador.sum(2, 2));
    }
}