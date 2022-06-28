import java.util.ArrayList;

public class ListeZadatak1 {
    public static void main(String[] args) {
////Zadatak 1 - Kreirati listu namirnica iz prodavnice, dodeliti vrednosti,
// odstampati sve vrednosti, zatim obrisati drugi i cetvrti clan pa ponovo odstampati listu


        ArrayList namirnice = new ArrayList();
        namirnice.add("Hleb");
        namirnice.add("Jogurt");
        namirnice.add("Pavlaka");
        namirnice.add("Pecenica");
        namirnice.add("Toalet papir");

        for (int i = 0; i < namirnice.size(); i++) {
            System.out.println((i + 1) + ". " + namirnice.get(i));
        }
        System.out.println("---------------");

        namirnice.remove(3);
        namirnice.remove("Jogurt");

        for (int i = 0; i < namirnice.size(); i++) {
            System.out.println((i + 1) + ". " + namirnice.get(i));
        }
    }
}
