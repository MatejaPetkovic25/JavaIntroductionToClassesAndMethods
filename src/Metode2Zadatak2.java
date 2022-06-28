public class Metode2Zadatak2 {
    public static void main(String[] args) {
//napraviti metodu int apsolut(int broj)
//input: int broj
//output: int apsolutBroj
//primer: apsolut(5) -> 5, apsolut(-5) -> 5, apsolut(0) -> 0


        System.out.println("Apsolutna vrednost broja je " + apsolut(6));
    }

    public static int apsolut (int broj) {

        int apsolutBroj;
        if (broj < 0) {
            apsolutBroj = broj * -1;
        } else {
            apsolutBroj = broj;
        }
        return apsolutBroj;

    }


}
