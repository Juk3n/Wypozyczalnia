package wypozyczalniasprzetuturystyczengo;
import java.time.LocalDate;
import java.time.Duration; 

public class Wypozyczenie {
    private int ID;
    private Klient klient;
    private Sprzet sprzet;
    private int ilosc;
    private LocalDate data;
    private final int maxOkresWypozyczenia = 14;
    
    public Wypozyczenie(Klient klient, Sprzet sprzet, int ilosc, int id) {
        
    }
    
    public Wypozyczenie() {
        
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public int naliczOplate() {
       LocalDate today = LocalDate.now();
       Duration diff = Duration.between(data.atStartOfDay(), today.atStartOfDay());
       int diffDays = (int)diff.toDays();
       int wysokoscOplaty = (int)diffDays * sprzet.getCenaZaDzien();     
       
       if(diffDays > maxOkresWypozyczenia)
           wysokoscOplaty += naliczKare(diffDays - maxOkresWypozyczenia);
        
       return wysokoscOplaty; 
    }
    
    public int naliczKare(int nadywzkaDni) {
        if(nadywzkaDni > 0)
            return nadywzkaDni * 100;
        else 
            return 0;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Sprzet getSprzet() {
        return sprzet;
    }

    public void setSprzet(Sprzet sprzet) {
        this.sprzet = sprzet;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }   
}
