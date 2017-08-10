package recursiya;

public class Fabonachchi {

    public static void main(String[] args) {


        //System.out.println(recFabohachi(200));

        System.out.println(cicleFobanachi(200));
    }

    public static double cicleFobanachi(double a) {


        if (a == 1 || a == 2)

            return 1;


        double previts = 1;

        double current = 1;

        double temp = 1;


        for (int i = 3; i <= a; i++) {


            temp = current;

            current = current + previts;

            previts = temp;

        }

        return current;

    }

    private static double recFabohachi(double n) {

        if (n == 1 || n == 2)

            return 1;

        double a = recFabohachi(n - 2);
        double c = recFabohachi(n - 1);


        return a + c;


    }
}
