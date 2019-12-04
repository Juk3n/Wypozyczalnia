package wypozyczalniasprzetuturystyczengo;

public class Sprzet {
    private int stan;
    private String nazwa;
    private int ID;

    Sprzet(int stan, String nazwa, int ID) {
        this.stan = stan;
        this.nazwa = nazwa;
        this.ID = ID;
    }
    
    public int getStan() {
        return stan;
    }

    public void setStan(int stan) {
        this.stan = stan;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getNazwa() {
        return nazwa;
    }
    
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
