package Automobil;

public class GlavnaKlasa2 {
    public static void main(String[] args) {
        Automobil a1 = new Automobil("Jugo", "45", "benzin", 3, 1985);
        Automobil a2 = new Automobil("Volkswagen", "Golf 5", "dizel", 5, 2012);
        Automobil a3 = new Automobil("Fiat", "Punto", "benzin", 5, 2005);
        a1.stampanje();
        a2.stampanje();
        a3.stampanje();


    }
}
