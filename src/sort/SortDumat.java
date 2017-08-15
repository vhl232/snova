package sort;

public class SortDumat {

    private static int[] num = new int[]{1, 50, 50, 10, 1, 25, 10, 50};


    public static void main(String[] args) {

        sort();


        for (int i = 0; i < num.length; i++) {

            System.out.println(num[i]);
        }

        /*Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                System.out.println(2);
            }
        });*/

    }

    private static void sort() {

    }

}
