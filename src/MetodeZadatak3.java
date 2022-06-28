public class MetodeZadatak3 {
    public static void main(String[] args) {
//implementirati metodu brojSamoglasnika:
//ulazni parametri : String rec
//izlazni tip: int

        System.out.println("Broj samoglasnika u reci je : " + brojSamoglasnika("Bootcamp"));


    }

    public static int brojSamoglasnika (String rec) {
        int broj = 0;
        String[] nizSlova = rec.split("");
        for(int i = 0; i < nizSlova.length; i++){
            if (nizSlova[i].equals("a") ||  nizSlova[i].equals("e") || nizSlova[i].equals("i") || nizSlova[i].equals("o")
                || nizSlova[i].equals("u")) {
                broj = broj + 1;
            }
        }

        return broj;
    }
}
