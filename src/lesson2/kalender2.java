package lesson2;

/**
 * Created by voca on 20.04.17.
 */
public class kalender2 {
    public static void main(String[] args) {
        System.out.println("pn vt sr ch pt sb vs");
        int a=1;
        System.out.print("               ");

        while (a<=30){
            if (a==3 || a==10 ||a ==17 ||a==24)
            {
                System.out.println();
            }
            if (a<10){
                System.out.print(" ");
            }

            System.out.print(a++ +" ");
        }
    }
}
