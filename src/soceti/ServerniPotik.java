package soceti;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerniPotik extends Thread {

    private static final String foto = "http://i.girlstop.info/cat/posts/59adce84ba21a3.63288427/thumbs/450px_p.jpg";
    private Socket potik;

    public ServerniPotik(Socket svuazKlient) {

        potik = svuazKlient;

        start();
    }

    @Override
    public void run() {
        System.out.println("zapustilsa");

        try (OutputStream potokFoto = potik.getOutputStream();
             PrintWriter writer = new PrintWriter(potokFoto)) {
            writer.print(foto);

        } catch (IOException e) {
        }

    }
}
