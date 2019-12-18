package wypozyczalniasprzetuturystyczengo;

public class Sprzet {
    private int stan;
    private String nazwa;
    private int cenaZaDzien; 

    public int getCenaZaDzien() {
        return cenaZaDzien;
    }

    public void setCenaZaDzien(int cenaZaDzien) {
        this.cenaZaDzien = cenaZaDzien;
    }

    Sprzet(int stan, String nazwa, int ID) {
        this.stan = stan;
        this.nazwa = nazwa;
    }
    
    public int getStan() {
        return stan;
    }

    public void setStan(int stan) {
        this.stan = stan;
    }

    public String getNazwa() {
        return nazwa;
    }
    
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
