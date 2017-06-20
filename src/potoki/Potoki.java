package potoki;

import Data.WhoreShluhi;

import java.io.*;


/**
 * Created by vladimir on 20.06.17.
 */
public class Potoki {
    public static void main(String[] args) throws IOException {
        InputStream potokProba = new FileInputStream("/home/vladimir/probiPotoki");


        OutputStream potoVihod = new FileOutputStream("/home/vladimir/probiPotoki", true);

        vozvratPotok(potoVihod);

        System.out.println(vozvrat(potokProba));

        WhoreShluhi d = new WhoreShluhi();


    }

    public static String vozvrat(InputStream vhodPotok) throws IOException {


        int a;
        char b;
        String s = "";
        while (vhodPotok.available() > 0) {

            a = vhodPotok.read();

            b = (char) a;

            s += b;


        }

        return s;


    }


    public static void vozvratPotok(OutputStream outPotok) throws IOException {
        String q = " pishu snova blat ";

        byte[] byti = q.getBytes();


        outPotok.write(byti);

        outPotok.flush();
        outPotok.close();

    }
}
