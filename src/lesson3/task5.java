package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by voca on 25.04.17.
 */
public class task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("vvedite razmer massiva");

        String g = reader.readLine();

        int size  = Integer.parseInt(g);

        int [] a = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("chislo_suka?");
            g = reader.readLine();
            a [i] = Integer.parseInt(g);
        }
        System.out.println(a);
        for (int i = 0; i <size ; i++) {
            System.out.println(a[i]);


        }

    }

}
