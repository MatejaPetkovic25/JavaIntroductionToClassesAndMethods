public class StringNiz {
    public static void main(String[] args) {
        String recenica = "ItBootcamp-je-super!";
        String[] nizOdRecenice = recenica.split("-");
        //System.out.println(Arrays.toString(nizOdRecenice));
        for (int i = 0; i < nizOdRecenice.length; i++) {
            System.out.println(nizOdRecenice[i]);
        }
    }
}