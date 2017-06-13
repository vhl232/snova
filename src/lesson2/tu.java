package lesson2;

/**
 * Created by voca on 23.04.17.
 */
public class tu {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 1000) {
            if (a % 2 == 0 && a % 3 == 0) {
                // do nothing
            } else {
                if (a % 2 == 0) {
                    System.out.println(a + " (2)");
                } else {
                    if (a % 3 == 0) {
                        System.out.println("(3) " + a);

                    } else {
                        System.out.println(a);

                    }

                    // System.out.println(a);}
                }
            }
            a++;
        }


    }
}
