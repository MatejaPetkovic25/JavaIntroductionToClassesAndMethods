package Klase;

public class MainKlasa {
    public static void main(String[] args) {

        Podaci p1 = new Podaci("Mateja", "Petkovic", "Fakultet bezbednosti", 7.8);

        Podaci p2 = new Podaci("Pera", "Peric", "Pravni fakultet", 9.6);

        Podaci p3 = new Podaci("Marija", "Maric", "Medicinski fakultet", 9.2);
        p3.stampanje();
        p1.stampanje();
        p2.stampanje();
    }
}
