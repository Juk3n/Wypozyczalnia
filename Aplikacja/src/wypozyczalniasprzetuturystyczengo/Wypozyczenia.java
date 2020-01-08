package wypozyczalniasprzetuturystyczengo;

import java.util.List;

public class Wypozyczenia {
    private List<Wypozyczenie> wypozyczenia;
    
    public List<Wypozyczenie> getWypozyczenia() {
        return wypozyczenia;
    }
    
    public void setWypozyczenia(List<Wypozyczenie> wypozyczenia) {
        this.wypozyczenia = wypozyczenia;
    }
    
    public Wypozyczenie szukajWypozyczenie(int id) {
        return null;
    }
    
    public void dodajWypozyczenie(Klient klient, Sprzet sprzet, int ilosc) {
        Wypozyczenie wypozyczenie = new Wypozyczenie(klient, sprzet, ilosc, wypozyczenia.size());
        wypozyczenia.add(wypozyczenie);
    }
    
    public void usunWypozyczenie() {
        
    }
}
