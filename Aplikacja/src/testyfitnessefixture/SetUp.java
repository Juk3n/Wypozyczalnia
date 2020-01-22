/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testyfitnessefixture;

import fit.Fixture;

import wypozyczalniasprzetuturystyczengo.WypozyczalniaSprzetuTurystyczengo;

public class SetUp extends Fixture{
    static public WypozyczalniaSprzetuTurystyczengo aplikacja;

    public void SetUp()  {
        aplikacja = new WypozyczalniaSprzetuTurystyczengo();
    }
}