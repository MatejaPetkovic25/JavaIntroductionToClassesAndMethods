package KlaseRadnik;

public class MainKlasa {
    //Zadatak 2 - Napraviti paket "KlaseRadnik" i dve klase - "Radnik" i "MainKlasa".
    // U klasi Radnik deklarisati public atribute jmbg (tipa long), ime i prezime (jedan string),
    // broj dece, stepen strucne spreme i radni staz.
//Kreirati pun konstruktor za sve atribute
//Potrebno je izracunati da li je korisnik sposoban za kredit. Ako ima platu vecu od 5000 onda je true,
// ako ima ispod onda je false
//Platu racunamo tako sto ce se zbir koeficijenta i minulog rada pomnoziti sa 10 000 i na to dodati jos 2500
//Koeficijent se racuna zavisno od stepena strucne spreme preko switch-a
//Stepen strucne spreme moze biti 1,2,3,4 i koeficijent po tom redosledu je 1.03, 2.00, 2.88, 3.40
//Minuli rad se racuna zavisno od radnog staza. Ako je radni staz kraci od 10 godina onda je minuli rad 0.05.
// Ako je izmedju 10 i 20 onda je 0.75 i ako je duzi od 20 onda je 1.0
//Potrebno je izracunati i dane godisnjeg odmora tako sto ce se broj dece pomnoziti sa 2 i na to dodati 22 dana
//Podatke odstampati van MainKlase
    public static void main(String[] args) {
        Radnik r1 = new Radnik(125992642984l, "Gojko Gojkovic", 4, 2, 15);
        r1.stampanje();
        Radnik r2 = new Radnik(1293320419983l, "Petar Petrovic", 1, 4, 25);
        r2.stampanje();
        Radnik r3 = new Radnik(138392012965l, "Marko Markovic", 3, 3, 7);
        r3.stampanje();


    }
}
