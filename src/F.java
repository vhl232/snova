import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladimir on 04.06.17.
 */
public class F {
    public static void main(String[] args) {
        List <Integer>hg = new ArrayList<>();
        hg.add(4);
        hg.add(9);
        for (int i = 0; i < hg.size(); i++) {
            Integer d = hg.get(i);
            /////
            System.out.println(d);
        }

        for (int d:hg){
            System.out.println(d);
        }
    }
}
