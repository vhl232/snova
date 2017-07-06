package vlozgennieKlassi;

/**
 * Created by vladimir on 06.07.17.
 */
public class Chilovek {

    protected Pochka pochka;
    private String name;

    public Chilovek() {

        pochka = new Pochka();
    }

    public static void main(String[] args) {

        Chilovek chilovek = new Chilovek();

        chilovek.udarPoPochke();
    }

    public void gavari() {
        System.out.println("govoru");
    }

    public void udarPoPochke() {
        pochka.bolezn();
    }

    public Pochka getPochka() {
        return pochka;
    }

    public class Pochka {

        private int razmer;

        protected void bolezn() {
            System.out.println("skoro pizdec");
        }

    }
}
