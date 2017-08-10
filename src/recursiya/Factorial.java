package recursiya;

public class Factorial {

    public static void main(String[] args) {


        //System.out.println(factoril(10));


        System.out.println(facCicle(0));
    }

    public static double facCicle(double a) {

        long q = 1;

        /*for (int i = 1; i <= a ; i++) {

            q = q * i;

        }*/
        return q;

    }

    private static long factoril(long a) {

        if (a == 1)

            return a;

        return a * factoril(a - 1);

    }

}
