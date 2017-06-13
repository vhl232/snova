package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by voca on 25.04.17.
 */
public class task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a;

        int b;

        int f;

        int k;

        int l;


        String g;

        String c;

        String d;

        String v;

        String r;


        System.out.println("vvedite prvuy peremennuy");

        g = reader.readLine();

        System.out.println("vvedite vtoruy peremennuy");

        c = reader.readLine();

        System.out.println("vvedite tretyu peremennuy");

        d = reader.readLine();

        System.out.println("vvedite tretyu peremennuy");

        v = reader.readLine();

        System.out.println("vvedite tretyu peremennuy");

        r = reader.readLine();


        a = Integer.parseInt(g);

        b = Integer.parseInt(c);

        f = Integer.parseInt(d);

        k = Integer.parseInt(v);

        l = Integer.parseInt(r);

        int min1= min2(a,b);
        int min2= min2(f,k);
        int min3= min2(min1,min2);
        int min4=min2(min3,l);
        System.out.println(min4);

    }
    private static int min2(int chislo1, int chislo2){
        if (chislo1<chislo2) return chislo1;
        else return chislo2;

    }
}
