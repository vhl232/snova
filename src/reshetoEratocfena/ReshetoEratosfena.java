package reshetoEratocfena;

import java.util.LinkedList;
import java.util.List;

public class ReshetoEratosfena {


    public static List<Integer> eratosfen(Integer maxchislo) {

        List<Integer> a = new LinkedList<>();

        for (int i = 1; i <= maxchislo; i++) {

            a.add(i);

        }


        int p = 2;

        while ((p * p) < maxchislo) {

            pereborVikidon(a, p);
            p = poiskCHicla(a, p);
        }

        return a;


    }


    public static void pereborVikidon(List<Integer> a, int b) {

        int vremenay;
        for (int i = 0; i < a.size(); i++) {

            vremenay = a.get(i);
            if (vremenay % b == 0 && vremenay != b) {
                a.remove(i);
                i--;
            }
        }
    }


    public static int poiskCHicla(List<Integer> a, int p) {

        int vrem;

        for (int i = 0; i < a.size(); i++) {

            vrem = a.get(i);

            if (vrem > p) {
                return vrem;
            }

        }
        return 2;
    }


    public static void main(String[] args) {
        //eratosfen(100);

        long vremya = System.currentTimeMillis();

        System.out.println(eratosfen(50000));

        long vremyaPosle = System.currentTimeMillis();

        System.out.println((vremyaPosle - vremya) / 1000.0);
    }


}
