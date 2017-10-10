package iterators;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        String[] b = {"pole", "les", "ozero", "gora"};
        LinkedList<String> a = new LinkedList<String>(Arrays.asList(b));

        ListIterator<String> s = a.listIterator();
        while (s.hasNext()) {
            String w = s.next();
            if (w.equals("pole")) {
                //otschitat dva nazad
                System.out.println(odn(s));
                break;
            }
        }


    }

    private static String odn(ListIterator<String> s) {

        s.previous();
        s.previous();
        String w = s.previous();
        return w;
    }
}
