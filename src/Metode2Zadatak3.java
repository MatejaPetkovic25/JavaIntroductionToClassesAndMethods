public class Metode2Zadatak3 {
    public static void main(String[] args) {
   //Zadatak2:
        //napraviti metodu `int stepen(int broj, int n)`
        //input: int broj, int n
        //output: broj "na" n, odnosno, broj^n
        //primer: stepen(2, 3) -> 8, stepen(4, 3) -> 64, stepen(0, 2) -> 0, stepen(3, 0) -> 1, stepen(-1, 3) -> -1

        System.out.println(stepen(5, 3 ));
//PROBAJ DA NAPRAVIS DA FUNKCIONISE ISPRAVNO SA NEGATIVNIM BROJEVIMA U n .
    }

    public static int stepen (int broj, int n) {
        int brojNaN = 1;
        for (int i = 0; i < n; i++) {
            brojNaN = brojNaN * broj;
        }
        return brojNaN;
    }
}
