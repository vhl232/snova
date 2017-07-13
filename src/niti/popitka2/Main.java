package niti.popitka2;

/**
 * Created by vladimir on 13.07.17.
 */
public class Main {

    public static void main(String[] args) {

        final int KolichestvoZiklov = 10;


        Thread potok2 = new Thread(new FtoroiPotok(KolichestvoZiklov), "potok2");

        MoiPotok potok = new MoiPotok(KolichestvoZiklov);

        Thread potok3 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < KolichestvoZiklov; i++) {

                    System.out.println("potok3");

                }
            }
        });

        potok3.start();

        potok.start();

        potok2.start();


        for (int i = 0; i < KolichestvoZiklov; i++) {

            System.out.println("main");

        }
    }
}
