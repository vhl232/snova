package niti.interrupion;

/**
 * Created by vladimir on 13.07.17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        PotokNovi thread = new PotokNovi();

        thread.start();


        for (int i = 1; i < 5000; i++) {


            Thread.sleep(1);

        }


        thread.isInterrupt();

        thread.interrupt();

        thread.isInterrupt();

    }
}
