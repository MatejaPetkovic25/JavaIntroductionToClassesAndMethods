public class Metode2Zadatak6 {
    public static void main(String[] args) {
     //Zadatak5:
        //napraviti metodu `int[] presekNiza(int[] a, int[] b)`
        //input: int[] a, int[] b
        //output: int[] presek
        //primer: presekNiza(new int[]{1,2,3,4,5}, new int[]{1,4,3,8,5,10}) -> new int[] {1,3,5}
        //			presekNiza(new int[]{1, 3, 5}, new int[]{2,4,6}) -> {}

        System.out.println(presekNiza(new int[]{1, 2, 3, 4, 5, 3}, new int[]{1, 4, 3}));

    }

    public static int[] presekNiza (int[] a, int[] b) {
        int[] presek = new int[a.length];
        int z = 0;
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; i < b.length; j++) {
                if (a[i] == b[j]) {
                    presek[z] = a[i];
                    z++;
                }

            }
        }


        return presek;
    }
}
