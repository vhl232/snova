package niti.popitka2;

/**
 * Created by vladimir on 13.07.17.
 */
public class MoiPotok extends Thread {

    private int cikli;

    public MoiPotok(int cikli) {
        this.cikli = cikli;
    }


    @Override
    public void run() {

        for (int i = 0; i < cikli; i++) {


            System.out.println("potok1");

        }
    }
}
