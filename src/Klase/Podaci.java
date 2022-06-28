package Klase;

public class Podaci {
    public String ime;
    public String prezime;
    public String fakultet;
    public double prosekOcena;


    public Podaci(String ime, String prezime, String fakultet, double prosekOcena) {
        this.ime = ime;
        this.prezime = prezime;
        this.fakultet = fakultet;
        this.prosekOcena = prosekOcena;
    }


public void stampanje() {
    System.out.println(ime + " " + prezime + " je isao na " + fakultet + " i imao je prosek ocena " + prosekOcena);
    }

}
