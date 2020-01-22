package wypozyczalniasprzetuturystyczengo;

import java.util.List;
import java.util.ArrayList;

public class Sprzety {
    private List<Sprzet> sprzety = new ArrayList();
        
    public Sprzety() {
         
    }
    
    public List<Sprzet> getSprzety() {
        return sprzety;
    }
    
    public void setSprzety(List<Sprzet> sprzety) {
        this.sprzety = sprzety;
    }
    //wszystko dobrze, wszystko niebylo, null
    public Sprzet szukajSprzet(String nazwa) {
        for(int i = 0; i < sprzety.size(); i++) {        
            if(nazwa == sprzety.get(i).getNazwa())
                return sprzety.get(i);
        } 
        return null;
    }
    
    public void usunSprzet(String nazwa) {
        Sprzet sprzetDoUsuniecia = szukajSprzet(nazwa);
        if(sprzetDoUsuniecia != null) {          
            sprzety.remove(sprzetDoUsuniecia);
        }
    }
    
    public void naprawSprzet(String nazwa) {
        Sprzet sprzetDoNaprawy = szukajSprzet(nazwa);
        if(sprzetDoNaprawy != null) { 
            if(sprzetDoNaprawy.getStan() < 90)
                sprzetDoNaprawy.setStan(90);
        }     
    }
    
    public void dodajSprzet(String nazwa) {
        if(szukajSprzet(nazwa) == null) {
            //stan 100, ponieważ zakladamy, że nowy sprzęt jests w pełni sprawny
            Sprzet sprzet = Fabryka.stworzSprzet(100, nazwa);
            sprzety.add(sprzet);
        }
    }
    
    public void wypozyczSprzet(Sprzet sprzet) {
        if(sprzet.isWypozyczony() == false) 
            sprzet.setWypozyczony(true);
    }
    
    public void zwrocSprzet(Sprzet sprzet) {
        if(sprzet.isWypozyczony() == true) 
            sprzet.setWypozyczony(false);
    }
}
