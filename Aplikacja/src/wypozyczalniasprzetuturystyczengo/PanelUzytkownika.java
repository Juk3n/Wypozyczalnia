package wypozyczalniasprzetuturystyczengo;

public class PanelUzytkownika {
    private Sprzety sprzety;
    private Klienci klienci;
    private Wypozyczenia wypozyczenia;

    public Klienci getKlienci() {
        return klienci;
    }

    public void setKlienci(Klienci klienci) {
        this.klienci = klienci;
    }

    public Wypozyczenia getWypozyczenia() {
        return wypozyczenia;
    }

    public void setWypozyczenia(Wypozyczenia wypozyczenia) {
        this.wypozyczenia = wypozyczenia;
    }
    
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
    
    public void dodanieSprzetu(String nazwa) {
        sprzety.dodajSprzet(nazwa);
    }
    
    public void usuniecieSprzetu() {
        
    }
    
    public void naprawaSprzetu() {
        
    }
}
