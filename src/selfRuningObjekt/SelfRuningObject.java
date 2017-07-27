package selfRuningObjekt;

import java.util.ArrayList;

public class SelfRuningObject extends Thread {


    public SelfRuningObject() {

        System.out.println("schas zapushus");
        start();
    }


    public SelfRuningObject(String name) {
        super(name);

        start();
    }

    @Override
    public void run() {
        //int i = 0;
        while (true) {

            new ArrayList<Thread>(10000000);

            System.out.println(this.getName() + " rabotayu");

            //i++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

