/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wypozyczalniasprzetuturystyczengo;

import java.util.ArrayList;
import java.util.List;
import mockit.FullVerificationsInOrder;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian
 */
public class SprzetyTest {
    
    public SprzetyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

   
   
    
    /**
     * Test of szukajSprzet method, of class Sprzety.
     */
    @Test
    public void testSzukajSprzet() {
        System.out.println("Szukaj sprzet");
        Sprzet sprzet1 = Fabryka.stworzSprzet(100, "narty");
        
        System.out.println("Szukaj sprzet");
        Sprzety sprzety = new Sprzety();
        List<Sprzet> sprzetyLista = new ArrayList<>();
        sprzetyLista.add(sprzet1);
        
        sprzety.setSprzety(sprzetyLista);
        
        System.out.println(sprzety.szukajSprzet("narty").getNazwa());
        
        assertEquals(sprzety.szukajSprzet("narty").getNazwa(), sprzet1.getNazwa());
        assertEquals(sprzety.szukajSprzet("narty").getStan(), sprzet1.getStan());
        assertEquals(sprzety.szukajSprzet("narty").getCenaZaDzien(), sprzet1.getCenaZaDzien());
        assertEquals(sprzety.szukajSprzet("narty").isWypozyczony(), sprzet1.isWypozyczony());
        
        
        new FullVerificationsInOrder() {
        {
            sprzet1.equals(any); times = 2;
            sprzet2.equals(any); times = 3;
            sprzet3.equals(any); times = 4;
        }
 };
    }
    
}
