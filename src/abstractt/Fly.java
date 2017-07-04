package abstractt;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vladimir on 04.07.17.
 */
public class Fly extends Insect {
    @Override
    public void crawl(int xDirection, int yDirection, int zDirection) {

        System.out.println("hren znaet kuda i zachem");
    }

    @Override
    public Set<Insect> multiplay(double larvas) {


        Set<Insect> muha = new HashSet<>();
        for (int i = 0; i < larvas; i++) {


            muha.add(new Fly());

        }

        return muha;
    }

    @Override
    public void makeNoise() {

        System.out.println("shumit gadina");

    }
}
