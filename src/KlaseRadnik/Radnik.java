package KlaseRadnik;

public class Radnik {
   public long jmbg;
   public String imePrezime;
   public int brojDece;
   public int stepenSpreme;
   public int radniStaz;

    public Radnik (long jmbg, String imePrezime, int brojDece, int stepenSpreme, int radniStaz) {
    this.jmbg = jmbg;
    this.imePrezime = imePrezime;
    this.brojDece = brojDece;
    this.stepenSpreme = stepenSpreme;
    this.radniStaz = radniStaz;
    }

    public double koeficijent () {
        double koeficijent = 0;
        switch (stepenSpreme) {
            case 1:  koeficijent = 1.03;
            break;
            case 2: koeficijent = 2.00;
            break;
            case 3: koeficijent = 2.88;
            break;
            case 4: koeficijent = 3.40;
            default:
                break;
        }
         return koeficijent;
    }
    public double minuliRad () {
        double minuliRad = 0;
        if (radniStaz < 10) {
            minuliRad = 0.05;
        } else if (radniStaz >= 10 && radniStaz <= 20) {
            minuliRad = 0.75;
        } else if (radniStaz > 20) {
            minuliRad = 1;
        }
        return minuliRad;
    }
    public double plata () {
        double plata = (koeficijent() + minuliRad()) * 10000 + 2500;
        return plata;
    }
    public boolean kredit () {
        boolean kredit = true;
        if (plata() < 35000) return kredit = false;
        return kredit;
    }
    public int daniOdmora () {
        int daniOdmora = brojDece * 2 + 22;
        return daniOdmora;
    }
    public void stampanje () {
        System.out.println("Radnik " + imePrezime + " , jmbg: " + jmbg + " ima " + brojDece + " dece." );
        System.out.println("Ima platu " + plata() + " sto znaci da je stanje za kredit " + kredit() + ".");
        System.out.println("Ima " + daniOdmora() + " dana odmora.");
        System.out.println("---------------------------------------------");
    }
}
