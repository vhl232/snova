package niti;

/**
 * Created by vladimir on 11.07.17.
 */
public class River implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i < 11; i++) {

            System.out.print(i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
