/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalniasprzetuturystyczengo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian
 */
public class FabrykaTest {
    
    public FabrykaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of stworzSprzet method, of class Fabryka.
     */
    @Test
    public void testStworzSprzet() {
        System.out.println("stworzSprzet");
        int stan = 100;
        String nazwa = "Narty";
        Sprzet expResult = new Sprzet(stan, nazwa);
        Sprzet result = Fabryka.stworzSprzet(stan, nazwa);
        
        
        assertEquals(expResult.getCenaZaDzien(), result.getCenaZaDzien());
        assertEquals(expResult.getNazwa(), result.getNazwa());
        assertEquals(expResult.getStan(), result.getStan());
        assertEquals(expResult.isWypozyczony(), result.isWypozyczony());     
    }
    
}
