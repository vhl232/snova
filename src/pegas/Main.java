package pegas;

/**
 * Created by vladimir on 27.06.17.
 */
public class Main {

    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.copita = 4;
        horse.longTail = 6;
        horse.teeth = 19;

        Bird bird = new Bird();
        bird.razmah = 25;


        Pegas orel = new Pegas(horse, bird);

        orel.letet();
        orel.rzgat();
        orel.skachet();
    }
}
