package wypozyczalniasprzetuturystyczengo;

public class PanelUzytkownika {
    private Sprzety sprzety;
    
    public Sprzety getSprzety() {
        return sprzety;
    }
    
    public void setSprzety(Sprzety sprzety) {
        this.sprzety = sprzety;
    }
    
    public Sprzet szukajSprzet(String nazwa) {
        Sprzet szukanySprzet;
        szukanySprzet = sprzety.szukajSprzet(nazwa);       
        return szukanySprzet;
    }
    
    public void wypozyczSprzet(Sprzet sprzet) {
        
    }
    
    public void zwrocSprzet(Sprzet sprzet) {
        
    }
    
    public void dodanieSprzetu() {
        
    }
    
    public void usuniecieSprzetu() {
        
    }
    
    public void naprawaSprzetu() {
        
    }
}
