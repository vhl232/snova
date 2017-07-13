package niti;

/**
 * Created by vladimir on 11.07.17.
 */
public class NaslodovanieOtPotoka extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println();

            try {
                Thread.sleep(1300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
