package potoki;

import java.io.*;

/**
 * Created by vladimir on 20.06.17.
 */
public class OutInput {
    public static void main(String[] args) throws IOException {


        Writer f = new FileWriter("/home/vladimir/file", true);

        f.write("sobaka ");


        f.flush();


        Reader a = new FileReader("/home/vladimir/file");

        char[] w = new char[10];

        String e = "";


        while (a.ready()) {

            a.read(w);

            e += new String(w);
        }


        System.out.println(e);


    }
}
