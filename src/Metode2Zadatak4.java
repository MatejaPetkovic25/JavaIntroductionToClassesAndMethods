public class Metode2Zadatak4 {
    public static void main(String[] args) {
//Zadatak3:
//napraviti metodu `String obrniString(String s)`
//input: String s
//output: String sObrnuto
//primer: obrniString("cao") -> "oac", obrniString("naravno") -> "onvaran", obrniString("ana") -> "ana"

        System.out.println(Obrnuto("naopako"));
    }
    public static String Obrnuto (String s) {
        String[] niz = s.split("");
        String obrnutaRec = "";
        for (int i = 1; i <= niz.length; i++) {
            obrnutaRec = obrnutaRec + niz[(niz.length-i)] ;
        }
        return obrnutaRec;
    }






    /*public static String[] Obrnuto (String s) {
        String[] niz = s.split("");
        String[] ObrnutiNiz = new String[niz.length];

        int j = niz.length - 1;
        for (int i = 0; i <niz.length; i++) {
            ObrnutiNiz[j] = niz[i];

            j--;
        }


        return ObrnutiNiz;
    }*/
}
