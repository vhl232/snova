package niti;

/**
 * Created by vladimir on 11.07.17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        River a = new River();

        Thread thread = new Thread(a);

        Thread q = new NaslodovanieOtPotoka();

        q.start();

        thread.start();


        for (int i = 'a'; i <= 'z'; i++) {

            System.out.print((char) i);

            Thread.sleep(200);

        }

    }
}
