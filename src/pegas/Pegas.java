package pegas;

/**
 * Created by vladimir on 27.06.17.
 */
public class Pegas {

    private Horse horse;

    private Bird bird;


    public Pegas(Horse horse, Bird bird) {

        this.horse = horse;
        this.bird = bird;

    }

    public void rzgat() {

        horse.rzgat();
    }

    public void skachet() {

        horse.skachet();
    }

    public void letet() {

        bird.letet();
    }

}
