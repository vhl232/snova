package niti.gonki;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladimir on 11.07.17.
 */
public class Stadion {
    public static void main(String[] args) {

        List<Mashins> mashinki = new ArrayList<>();

        Mashins red = new Mashins(0.56);

        mashinki.add(red);

        Mashins green = new Mashins(0.557);

        mashinki.add(green);

        Mashins dark = new Mashins(0.555);

        mashinki.add(dark);

        Mashins blue = new Mashins(0.551);

        mashinki.add(blue);


        Thread polosRed = new Thread(red);

        Thread polosDark = new Thread(dark);

        Thread polosGreen = new Thread(green);

        Thread polosBlue = new Thread(blue);

        polosBlue.start();

        polosDark.start();

        polosGreen.start();

        polosRed.start();

        while (true) {

            if (eshoEdut(mashinki)) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();

                printPut(mashinki);
            } else {
                int numberWinner = chekWinner(mashinki);

                System.out.println("we have a winner!!");

                switch (numberWinner) {

                    case 0: {
                        System.out.println("Winner Red");
                        break;
                    }
                    case 1: {
                        System.out.println("Winner Green");
                        break;
                    }
                    case 2: {
                        System.out.println("Winner Dark");
                        break;
                    }
                    case 3: {
                        System.out.println("Winner Blue");
                        break;
                    }


                }

                System.out.println("red : " + red.getPut());
                System.out.println("green : " + green.getPut());
                System.out.println("dark : " + dark.getPut());
                System.out.println("blue : " + blue.getPut());





                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

    private static int chekWinner(List<Mashins> mashinki) {

        for (int i = 0; i < mashinki.size(); i++) {

            if (!mashinki.get(i).esheEdu()) {
                return i;
            }

        }
        return -1;
    }

    private static void printPut(List<Mashins> mashinki) {

        for (Mashins car : mashinki) {

            int put = (int) car.getPut() / 10;

            for (int i = 0; i < put; i++) {

                System.out.print('.');
            }
            System.out.println();
        }
    }

    private static boolean eshoEdut(List<Mashins> mashinki) {

        for (Mashins car : mashinki) {

            if (!car.esheEdu()) {

                return false;
            }

        }

        return true;
    }
}
