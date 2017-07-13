package niti.interrupion.proverca;

/**
 * Created by vladimir on 13.07.17.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                Thread ya = Thread.currentThread();


                while (!ya.isInterrupted()) {

                    System.out.print('.');

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        ya.interrupt();
                    }

                }
            }
        });

        System.out.println(thread);
        thread.start();
        Thread.sleep(5000);

        thread.interrupt();
    }
}
