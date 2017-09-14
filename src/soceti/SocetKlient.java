package soceti;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocetKlient {
    public static void main(String[] args) throws IOException {

        Socket klient = new Socket("localhost", 49153);


        System.out.println("vrode podkluchilis");


        BufferedReader reader = new BufferedReader(new InputStreamReader(klient.getInputStream()));

        System.out.println(reader.readLine());
    }
}
