package potoki;

import java.io.*;

/**
 * Created by vladimir on 20.06.17.
 */
public class ProbaBlayd {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/home/vladimir/1")));
        System.out.println("pishi chto nibud - ");
        d.write(a.readLine());
        d.flush();


    }


}
