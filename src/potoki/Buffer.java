package potoki;

import java.io.*;

/**
 * Created by vladimir on 20.06.17.
 */
public class Buffer {
    public static void main(String[] args) throws IOException {
        InputStream a = new FileInputStream("/home/vladimir/file");

        printPotik(a);


        OutputStream d = new FileOutputStream("/home/vladimir/file", true);

        vfile(d);


    }

    public static void printPotik(InputStream s) throws IOException {

        InputStreamReader q = new InputStreamReader(s);

        BufferedReader w = new BufferedReader(q);

        while (w.ready()) {

            System.out.println(w.readLine());
        }
    }


    public static void vfile(OutputStream s) throws IOException {

        BufferedWriter b = new BufferedWriter(new OutputStreamWriter(s));

        b.write("nebo zvezd");
        b.newLine();
        b.write("nad golovoi");
        b.newLine();
        b.flush();


    }
}
