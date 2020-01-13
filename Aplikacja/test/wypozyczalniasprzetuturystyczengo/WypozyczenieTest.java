/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalniasprzetuturystyczengo;

import java.time.LocalDate;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian
 */
public class WypozyczenieTest {
    
    public WypozyczenieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

   
    @Test
    public void testNaliczKareStandard() {
        int opoznienie = 2;
        int rezultat = 200;
        
        Wypozyczenie instance = new Wypozyczenie();
        
        int result = instance.naliczKare(opoznienie);
        assertEquals(rezultat, result);
    }
    
    @Test
    public void testNaliczKareGranicznyDodatni() {
        int opoznienie = 1;
        int rezultat = 100;
        
        Wypozyczenie instance = new Wypozyczenie();
        
        int result = instance.naliczKare(opoznienie);
        assertEquals(rezultat, result);
    }
    
    @Test
    public void testNaliczKareUjemna() {
        int opoznienie = -1;
        int rezultat = 0;
        
        Wypozyczenie instance = new Wypozyczenie();
        
        int result = instance.naliczKare(opoznienie);
        assertEquals(rezultat, result);
    }
    
    @Test
    public void testNaliczKareZero() {
        int opoznienie = 0;
        int rezultat = 0;
        
        Wypozyczenie instance = new Wypozyczenie();
        
        int result = instance.naliczKare(opoznienie);
        assertEquals(rezultat, result);
    }
}
