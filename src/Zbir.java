public class Zbir {

    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        int zbir1 = zbir(x + y, x + x + y); // parametri se odvajaju zarezom
        int zbir2 = zbir(x, y);
        System.out.println(zbir1); // 18
        System.out.println(zbir2); // 9
    }

    public static int zbir(int a, int b) {
        // Definicija (POTPIS) metode:
        // 1. Tip izlazne vrednosti (int, boolean, char, String, Object...)
        // 2. Ime metode (case sentitive) zbir Zbir ZBIR
        // 3. Broj i tip ulaznih parametara
        int rezultat = a + b;
        return rezultat;
    }

    public static int zbir(int x) {
        int rezultat = x + x;
        return rezultat;
    }
}