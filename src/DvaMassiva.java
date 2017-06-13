/**
 * Created by vladimir on 13.06.17.
 */
public class DvaMassiva {
    public static void main(String[] args) {

        int s, q;

        int[] a = {4, 12, 3, 1, 7, 9 };
        for (int i = 0; i < a.length; i++) {
            if(i == a.length/2){
                break;
            }
            if ( a[i] % 2 == 0) {
                s = a.length - i - 1;

                q = a[i];
                a[i] = a[s];
                a[s] = q;
                //System.out.print(i);
                //printA(a);

            }
        }
        System.out.println();
        printA(a);
    }

    public static void printA( int[] a) {


        for (int d:a){
            System.out.print(" " + d);


        }
        System.out.println();

    }
}
