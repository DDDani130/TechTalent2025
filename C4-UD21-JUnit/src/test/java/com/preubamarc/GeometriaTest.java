package com.preubamarc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GeometriaTest {
	
	Geometria geo = new Geometria();

    @Test
    public void areaCuadrado() {
        assertEquals(9, geo.areaCuadrado(3), "El area del cuadrado no es correcta, cuando le pasamos 3 me debe dar 9");
    }
    @Test
    public void areaTriangulo() {
        assertEquals(10, geo.areaTriangulo(4, 5), "El area del triangulo no es correcta, cuando le pasamos 4 y 5 me debe dar 10");
    }
    
    @Test
    public void areaRectangulo() {
        assertEquals(20, geo.areaRectangulo(4, 5), "El area del rectangulo no es correcta, cuando le pasamos 4 y 5 me debe dar 20");
    }
    
    @Test
    public void areaPentagono() {
        assertEquals(30, geo.areaPentagono(6, 10), "El area del pentagono no es correcta, cuando le pasamos 6 y 10 me debe dar 30");
    }
    
    @Test
    public void areaTrapecio() {
        assertEquals(21, geo.areaTrapecio(10, 4, 3), "El area del trapecio no es correcta, cuando le pasamos 10, 4 y 3 me debe dar 21");
    }

}
