package snovaNiti;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SnovaNitiMain {


    public static void main(String[] args) throws InterruptedException, IOException {


        for (int i = 0; i < 200; i++) {

            new SnovaThread();

        }


        Thread.sleep(5000);

        System.out.println(SnovaThread.counter);


    }

    public static class SnovaThread extends Thread {


        static long counter;
        private static BufferedWriter a;

        static {
            try {
                a = new BufferedWriter(new FileWriter("/home/" +
                        "vladimir/niti.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public SnovaThread() {

            start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 2000; i++) {

                go();

            }
            synchronized (this) {
                try {
                    a.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        private void go() {

            synchronized (this) {
                counter++;

                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                try {
                    a.write("" + counter + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }


    }


}
