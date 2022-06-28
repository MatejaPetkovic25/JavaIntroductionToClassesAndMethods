public class ZadatakArgs {
    public static void main(String[] args) {
//napisati program koji cita parametar args iz main metode i stampa svaki od clanova niza args na novoj liniji.
//Run > Edit configuration > program arguments

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }



    }
}
