package shto_to_novoe;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by voca on 11.05.17.
 */
public class Maiin {
    public static void main(String[] args ) throws IOException {
        A a = new A("Tolic","petrov");
        System.out.println("");
        B b = new B();
        System.out.println(a.kr());
        System.out.println(a.bv());
        System.out.println(b.lo());
        System.out.println(b.so());
        System.out.println(b.bv());
        System.out.println(b.kr());
        System.out.println(a.name);
        System.out.println(a.surname);
        System.out.println(b.name);
        System.out.println(b.surname);

        Stroca str = new Stroca(new InputStreamReader(System.in));

        System.out.println(str.readLine());

        Classss obj = new Classss();
        System.out.println(obj.a);

    }
}
