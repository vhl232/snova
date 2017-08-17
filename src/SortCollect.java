import java.util.ArrayList;

public class SortCollect {

    private static ArrayList<Double> a = new ArrayList<>();


    static {
        a.add(.7);
        a.add(5.7);
        a.add(2.9);
        a.add(99.4);
        a.add(2.1);
        a.add(0.5);
        a.add(0.0);
        a.add(-4.0);
    }

    public static void main(String[] args) {


        sort();

        for (double d : a) {

            System.out.println(d);

        }

    }

    private static void sort() {


        for (int j = 1; j < a.size(); j++) {

            for (int i = 0; i < a.size() - j; i++) {


                if (a.get(i) > a.get(i + 1)) {

                    double q = a.get(i);

                    a.set(i, a.get(i + 1));


                    a.set(i + 1, q);

                }

            }


        }

    }


}
