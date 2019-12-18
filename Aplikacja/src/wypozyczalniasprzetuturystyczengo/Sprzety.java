package wypozyczalniasprzetuturystyczengo;

import java.util.List;

public class Sprzety {
    private List<Sprzet> sprzety;
        
    public List<Sprzet> getSprzety() {
        return sprzety;
    }
    
    public void setSprzety(List<Sprzet> sprzety) {
        this.sprzety = sprzety;
    }
    
    public Sprzet szukajSprzet(String nazwa) {
        for(int i = 0; i < sprzety.size(); i++) {
            if(nazwa.compareTo(sprzety.get(i).getNazwa()) == 1)
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
}
