package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by voca on 25.04.17.
 */
public class task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a;
        int b;
        String c;
        String d;
        System.out.println("vvedite prvuy peremennuy");

        c = reader.readLine();

        System.out.println("vvedite vtoruy peremennuy");

        d = reader.readLine();

        a = Integer.parseInt(c);

        b = Integer.parseInt(d);



        if (a==b){
            System.out.println("chisla ravni");
        }
        else {
            if (a>b){
                System.out.println(a);
            } else {
                System.out.println(b);
            }

        }
    }
}
