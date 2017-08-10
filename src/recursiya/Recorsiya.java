package recursiya;

public class Recorsiya {

    public static void main(String[] args) {

        //System.out.println(umnogenieNa2(8) );

        long before = System.nanoTime();


        //System.out.println(probaSumm(6000));

        System.out.println(summaCiclov(6000));

        //System.out.println(matformula(6000));

        long after = System.nanoTime();

        System.out.println("Proshlo " + (after - before) + " mls");
    }

    private static int matformula(int n) {
        return n * (1 + n) / 2;
    }

    private static int summaCiclov(int a) {

        int q = 0;

        for (int i = 1; i <= a; i++) {

            q = q + i;

        }

        return q;

    }

    private static int umnogenieNa2(int i) {
        if (i > 1000000)
            return i;

        return umnogenieNa2(i * 2);
    }

    private static int probaSumm(int a) {

        if (a == 0)

            return a;

        return a + probaSumm(a - 1);


    }
}
