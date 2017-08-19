package elseComparator;

import java.util.*;

public class Main {

    public static ArrayList<Integer> chisla = new ArrayList<Integer>();

    public static LinkedList<Integer> chisla2 = new LinkedList<Integer>();

    static {
        chisla.add(17);
        chisla.add(-54);
        chisla.add(9);
        chisla.add(-4);
        chisla.add(54);
        chisla.add(200);
        chisla.add(-0);
        chisla2.add(-5);
        chisla2.add(0);
        chisla2.add(54);
        chisla2.add(7);
        chisla2.add(-144);
        chisla2.add(98);
        chisla2.add(66);
        chisla2.add(0);
        chisla2.add(87);

    }


    public static void main(String[] args) {


        Comparator<Integer> a = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return 1;

                else if (o1 < o2)
                    return -1;

                else
                    return 0;

            }
        };

        Comparator<Integer> b = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2)
                    return 1;

                else if (o1 > o2)
                    return -1;

                else
                    return 0;

            }
        };


        Collections.sort(chisla, a);

        prinnt(chisla);

        Collections.sort(chisla, b);

        prinnt(chisla);

        Collections.sort(chisla, a);

        prinnt(chisla);

        Collections.sort(chisla2, a);

        prinnt(chisla2);

        Collections.sort(chisla2, b);

        prinnt(chisla2);

    }

    private static void prinnt(List<Integer> chisla) {

        for (int q : chisla) {
            System.out.println(q);
        }

        System.out.println(" ");
    }


}
