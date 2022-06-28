package Automobil;

public class Automobil {
    public String marka;
    public String model;
    public String gorivo;
    public int brojVrata;
    public int godiste;

    public Automobil (String marka, String model, String gorivo, int brojVrata, int godiste) {
        this.marka = marka;
        this.model = model;
        this.gorivo = gorivo;
        this.brojVrata = brojVrata;
        this.godiste = godiste;
    }
    public Automobil () {

    }

    public void stampanje () {
        System.out.println("Automobil " + marka + " " + model + " ide na " + gorivo + " ima " + brojVrata + " vrata je "
                + godiste + " godiste.");
    }
}
