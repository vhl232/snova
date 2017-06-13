package Chisla;

import java.util.List;

/**
 * Created by voca on 23.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Chisla per = new Chisla(1000000);
        List<Integer> list = per.raschet();
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(i + ": " + list.get(i));

        }

    }
}
