package soceti;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(49154);

        System.out.println("gotov i zapushen");

        while (true) {

            Socket prilet = server.accept();
            //System.out.println("gotov i zapushen");


            new Pottok2(prilet);
        }


    }
}
