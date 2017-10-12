package lyabda;

import java.util.Arrays;
import java.util.List;

public class NewMain {
    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1, 7, 12, 4, 35, 7, 44, 0, -19);


        /*Collections.sort(ints);

        for (int i : ints){

            if(i<0){
                System.out.println (i/2);
            }
            else System.out.println(i*2);

            }*/

        ints.forEach((a) -> System.out.println(a < 0 ? a / 2 : a * 2));


    }
}
