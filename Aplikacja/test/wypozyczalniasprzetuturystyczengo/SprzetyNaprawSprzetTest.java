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

/**
 *
 * @author Adrian
 */
public class SprzetyNaprawSprzetTest {
    
    public SprzetyNaprawSprzetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of naprawSprzet method, of class Sprzety.
     */
    @Test
    public void testNaprawSprzetPopsuty() {
        int stanPoNaprawie = 90;
        
        Sprzety sprzety = new Sprzety();
        sprzety.dodajSprzet("Narty");
        
        //Symulacja popsucia
        sprzety.szukajSprzet("Narty").setStan(10);
        
        sprzety.naprawSprzet("Narty");
        
        assertEquals(sprzety.szukajSprzet("Narty").getStan(), stanPoNaprawie);
    }

    @Test
    public void testNaprawSprzetPoNaprawie() {
        int stanPoNaprawie = 90;
        
        Sprzety sprzety = new Sprzety();
        sprzety.dodajSprzet("Narty");
        
        //Symulacja popsucia
        sprzety.szukajSprzet("Narty").setStan(90);
        
        sprzety.naprawSprzet("Narty");
        
        assertEquals(sprzety.szukajSprzet("Narty").getStan(), stanPoNaprawie);
    }
  
    @Test
    public void testNaprawSprzetNowy() {
        int stanJakoNowy = 100;
        
        Sprzety sprzety = new Sprzety();
        sprzety.dodajSprzet("Narty");
        
        //naprawa nie powinno sie odbyc
        sprzety.naprawSprzet("Narty");
        
        assertEquals(sprzety.szukajSprzet("Narty").getStan(), stanJakoNowy);
    }
  
    
}
