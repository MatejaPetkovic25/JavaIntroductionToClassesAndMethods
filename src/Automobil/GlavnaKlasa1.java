package Automobil;

public class GlavnaKlasa1 {
    public static void main(String[] args) {


    //Zadatak 1 - Napraviti paket "Automobil" i kreirati tri klase - "GlavnaKlasa1", "GlavnaKlasa2" i "Automobil".
    // U klasu Automobil deklarisati marku, model, gorivo, broj vrata i godiste. Kreirati prazan i pun konstruktor.
    // U GlavnaKlasa1 kreirati objekat preko praznog konstruktora,
    // u GlavnaKlasa2 kreirati objekat preko punog konstruktora.
    // Kreirati tri objekta u obe glavne klase i svaki odstampati.
    // Stampanje se radi u posebnoj metodi u klasi Automobil.
    Automobil a1 = new Automobil();

         a1.marka = "Jugo";
         a1.model = "45";
         a1.gorivo = "benzin";
         a1.brojVrata = 3;
         a1.godiste = 1983;


    Automobil a2 = new Automobil() {
        String marka = "Volkswagen";
        String model = "Golf 5";
        String gorivo = "dizel";
        int brojVrata = 5;
        int godiste = 2012;
    };
    Automobil a3 = new Automobil() {
        String marka = "Fiat";
        String model = "Punto";
        String gorivo = "benzin";
        int brojVrata = 5;
        int godiste = 2003;
    };
    a1.stampanje();
    a2.stampanje();
    a3.stampanje();
    }
}
