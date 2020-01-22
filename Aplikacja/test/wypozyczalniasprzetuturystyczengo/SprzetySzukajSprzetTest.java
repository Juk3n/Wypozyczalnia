/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalniasprzetuturystyczengo;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Adrian
 */
public class SprzetySzukajSprzetTest {
    
    public SprzetySzukajSprzetTest() {
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    
    @Test
    public void testSzukajSprzetStandard() {
        String nazwaDoTestu = "Narty";
        Sprzety sprzety = new Sprzety();
        sprzety.dodajSprzet("Narty");
        
        Sprzet rezultat = sprzety.szukajSprzet(nazwaDoTestu);
        assertEquals(nazwaDoTestu, rezultat.getNazwa()); 
    }    
}
