package niti.interrupion;

/**
 * Created by vladimir on 13.07.17.
 */
public class PotokNovi extends Thread {

    private boolean interrupt = false;

    public void isInterrupt() {


        System.out.println(interrupt ? "ya ostanovilsay" : "eboshu posle obeda");
    }

    public void interrupt() {
        this.interrupt = true;
    }

    @Override
    public void run() {

        while (!interrupt) {

            System.out.print('.');

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
