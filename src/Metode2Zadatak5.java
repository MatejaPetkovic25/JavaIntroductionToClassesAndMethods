public class Metode2Zadatak5 {
    public static void main(String[] args) {
//Zadatak4:
//napraviti metodu `boolean palindrom(String s)`
//input: String s
//output: boolean isPalindrom
//primer: palindrom("cao") -> false, palindrom("anavolimilovana") -> true


        System.out.println(isPalindrom("anavolimilovana"));

    }

    public static boolean isPalindrom (String s) {
        boolean daLiJePalindrom;
        String obrnuto = "";
        for (int i = s.length()-1; i >= 0; i--) {
            obrnuto = obrnuto + s.charAt(i);
        }

        if (s.equals(obrnuto)) {
            daLiJePalindrom = true;
        } else {
            daLiJePalindrom = false;
        }
        return daLiJePalindrom;
    }
/* RESENJE
public static boolean palindrom(String s) {
    boolean isPalindrom = true;

    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            isPalindrom = false;
            break;
        }
    }

    return isPalindrom;
}*/



}
