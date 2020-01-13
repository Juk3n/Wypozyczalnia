package wypozyczalniasprzetuturystyczengo;

public class Fabryka {
    public static Sprzet stworzSprzet(int stan, String nazwa) {
        Sprzet sprzet = new Sprzet();
        sprzet.setNazwa(nazwa);
        sprzet.setStan(stan);
        sprzet.setCenaZaDzien(10);
        sprzet.setWypozyczony(false);
        return sprzet;
    }
}
