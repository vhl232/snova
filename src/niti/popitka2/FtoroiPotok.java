package niti.popitka2;

/**
 * Created by vladimir on 13.07.17.
 */
public class FtoroiPotok implements Runnable {

    private int cikli;


    public FtoroiPotok(int cikli) {
        this.cikli = cikli;
    }

    @Override
    public void run() {
        for (int i = 0; i < cikli; i++) {


            System.out.println("potok  2 ");
        }
    }
}
