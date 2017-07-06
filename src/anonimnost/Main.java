package anonimnost;

/**
 * Created by vladimir on 06.07.17.
 */
public class Main {

    public static void main(String[] args) {

        new Alive() {
            @Override
            public void live() {
                System.out.println("I'm alive!");
            }
        }.live();

        Runner forestGamp = new Runner() {
            @Override
            public void run() {
                stop();
                System.out.println("ya bizgu");
            }

            public void stop() {
                System.out.println("stoyu");
            }
        };
        forestGamp.run();

    }
}
