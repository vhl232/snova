package peregruzkaMetodov;

/**
 * Created by vladimir on 27.06.17.
 */
public class Printer {

    public static void print() {

        System.out.println("pechatauy nichego!");
    }

    public static void print(String s) {

        System.out.println("pechatauy strocu");

        System.out.println(s);

    }


    public static void print(double a) {

        System.out.println("pechatauy chislo");

        System.out.println(a);
    }

    public static void print(String s, double d) {

        System.out.println("pechatauy stroku i chislo");

        System.out.println(s + " " + d);

    }


}
