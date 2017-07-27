package selfRuningObjekt;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        new SelfRuningObject("thred1");
        new SelfRuningObject("thred2");
        new SelfRuningObject("thred3");
        new SelfRuningObject("thred4");
        new SelfRuningObject("thred5");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader s = new BufferedReader(in);


        //a.start();

        for (int i = 0; i < 20000; i++) {

            System.out.println(i);

            Thread.sleep(500);

        }


    }
}
