package soceti;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SokettiServer {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocet = new ServerSocket(49153);

        // serverSocet.accept();


        //ArrayList<Socket> podklKlient = new ArrayList<>();


        //System.out.println("podkluchilis "+svuazKlient);
        while (true) {

            Socket svuazKlient = serverSocet.accept();

            System.out.println("podkluchilsy v " + new Date() + svuazKlient);

            new ServerniPotik(svuazKlient);


        }


    }

}
