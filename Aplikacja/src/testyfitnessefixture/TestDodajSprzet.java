/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testyfitnessefixture;

/**
 *
 * @author Adrian
 */

import fit.ColumnFixture;

public class TestDodajSprzet extends ColumnFixture {

    String nazwa;
    
    public boolean dodajSprzet() {
        int s1 = liczbaSprzetow();// = liczba sprzetow
        
        SetUp.aplikacja.panelUzytkownika.dodanieSprzetu(nazwa);
        
        int s2 = liczbaSprzetow();// = liczba sprzetow po dodaniu sprzetu
        
        return s1!=s2;
    }
    
    public int liczbaSprzetow() {
        return SetUp.aplikacja.panelUzytkownika.getSprzety().getSprzety().size();
    }
}


