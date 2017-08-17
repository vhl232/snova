package sort;

public class SortDumat {

    private static int[] num = new int[]{1, 50, 50, 10, 1, 25, 10, 50, 0, -4};


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

        for (int j = 1; j < num.length; j++) {


            //          int f = 0;

            for (int i = 0; i < num.length - j; i++) {

                if (num[i] > num[i + 1]) {

                    int tmp = num[i];

                    num[i] = num[i + 1];

                    num[i + 1] = tmp;
                    //                f=1;

                }
            }
            //      if(f==0 ){
            //        break;
            //}

        }



    }

}
