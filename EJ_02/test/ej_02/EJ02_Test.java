/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import entidades.Lavadora;
import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rembe
 */
public class EJ02_Test {

    Lavadora lav1, lav2, lav3;

    public EJ02_Test() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        lav1 = new Lavadora(20, 1000.0, "naranja", 'F', 20);
        lav2 = new Lavadora(20, 1000.0, "violeta", 'F', 20);
        lav3 = new Lavadora(20, 1000.0, "naranja", 'r', 20);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testPrecioFinal() {
        Double precioEsperado1 = 1600.0;
        lav1.precioFinal();
        assertEquals(precioEsperado1, lav1.getPrecio());
    }

    @Test
    public void testComprobarColor() {
        String colorEsperado = "blanco";
        lav2.comprobarColor("violeta");
        String colorActual = lav2.getColor();
        assertEquals(colorEsperado, colorActual);
    }

    @Test
    public void testComprobarConsumoEnergetico() {
        Character consumoEsperado = 'F';
        Character consumoActual = lav3.comprobarConsumoEnergetico('z');
        assertEquals(consumoEsperado, consumoActual);
    }
}
