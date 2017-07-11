package niti.gonki;

/**
 * Created by vladimir on 11.07.17.
 */
public class Mashins implements Runnable {

    private static final double maxPut = 1000;


    private double speed;
    private double put;

    public Mashins(double speed) {
        this.speed = speed;

        put = 0;

    }

    @Override
    public void run() {

        while (put <= maxPut) {


            put += (speed * Math.random()) * 10;

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public double getPut() {
        return put;
    }

    public boolean esheEdu() {

        return put < maxPut;
    }


}
