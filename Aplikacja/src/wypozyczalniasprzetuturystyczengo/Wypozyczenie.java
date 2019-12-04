package wypozyczalniasprzetuturystyczengo;
import java.util.Date;

public class Wypozyczenie {
    private Klient klient;
    private Sprzet sprzet;
    private int ilosc;
    private Date data;
    
    public int naliczOplate() {
        return 0;
    }
    
    private int naliczKare() {
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
}
