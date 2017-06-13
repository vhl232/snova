package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by voca on 25.04.17.
 */
public class task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a;
        int b;
        int f;
        String g;
        String c;
        String d;
        System.out.println("vvedite prvuy peremennuy");

        g = reader.readLine();

        System.out.println("vvedite vtoruy peremennuy");

        c = reader.readLine();

        System.out.println("vvedite tretyu peremennuy");

        d = reader.readLine();



        a = Integer.parseInt(g);

        b = Integer.parseInt(c);

        f = Integer.parseInt(d);

        if (a==b || b==f || a==f){
            System.out.println("nema chisla");

        }
        else {
            int min =min3(a,b,f);
            //System.out.println(min);



            int mix = max3(a,b,f);
           // System.out.println(mix);

            if(a!=min && a!=mix) System.out.println(a);
            if(b!=min && b!=mix) System.out.println(b);
            if(f!=min && f!=mix) System.out.println(f);
        }





    }
    private static int min2(int chislo1, int chislo2){
        if (chislo1<chislo2) return chislo1;
        else return chislo2;

    }
    private static int min3(int a, int b, int c){
       int n = min2(a,b);
       int m = min2(n,c);
       return m;
    }
    private static int max (int chislo1, int chislo2 ){
        if (chislo1>chislo2 )return chislo1;
        else return chislo2;

    }
    private static int max3(int a, int b, int s ){
        return max(max(a,b),s);

    }
}
