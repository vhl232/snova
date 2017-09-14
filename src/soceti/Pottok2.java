package soceti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Pottok2 extends Thread {


    private Socket otpravka;

    public Pottok2(Socket a) {

        System.out.println("potok so<dan zapuskayu");
        otpravka = a;
        start();
    }

    @Override
    public void run() {


        try {
            BufferedReader slovo = new BufferedReader
                    (new InputStreamReader(otpravka.getInputStream()));
            String a = slovo.readLine();
            System.out.println("schital " + a + " stroku iz  potoka");

            String b = a.split(" ")[0];
            System.out.println("gotovlus k otpavke");

            PrintWriter q = new PrintWriter(otpravka.getOutputStream());

            q.print(b + b + "\n");
            q.flush();
            System.out.println("otpravil " + b + b);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
