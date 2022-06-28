public class MetodeZadatak2 {
    public static void main(String[] args) {
        //napravi metodu koja prima kao parametar String a vraca kao rezultat broj reci u datom string-u.

        System.out.println(brojReci("Ova recenica ima pet reci."));

    }

    public static int brojReci (String recenica) {

        String[] nizOdRecenice = recenica.split(" ");
        return nizOdRecenice.length;
    }
}

/* OVAKO TREBA DA SE RADI SKRACENO

public static void main(String[] args) {
        String recenica = "ItBootcamp je super stvarno bla bla bla!";
        int duzinaRecenice = racunajBrojReci(recenica);
        System.out.println("Duzina recenice je: " + duzinaRecenice);
    }

    public static int racunajBrojReci(String recenica) {
        return recenica.split(" ").length;      SVE U JEDNOJ LINIJI !!
    }
}

*/
