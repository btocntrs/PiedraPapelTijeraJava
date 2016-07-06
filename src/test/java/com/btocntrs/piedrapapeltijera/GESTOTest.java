/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btocntrs.piedrapapeltijera;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Rider
 */
public class GESTOTest {

    public GESTOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of ganaContra method, of class GESTO.
     */
    @org.junit.Test
    public void testGanaContra() {
        System.out.println("ganaContra");
        GESTO gesto = GESTO.PAPEL;
        GESTO gestoOponente = GESTO.PIEDRA;
        boolean expResult = true;
        boolean result = gesto.ganaContra(gestoOponente);
        assertEquals(expResult, result);
    }

}
