package abstractt;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vladimir on 04.07.17.
 */
public class Bee extends Insect {
    @Override
    public void crawl(int xDirection, int yDirection, int zDirection) {

        System.out.println("za medom");

    }

    @Override
    public Set<Insect> multiplay(double larvas) {

        Set<Insect> pchel = new HashSet<>();

        for (int i = 0; i < larvas; i++) {

            pchel.add(new Bee());
        }

        return pchel;
    }

    @Override
    public void makeNoise() {

        System.out.println("Gh-gh-gh pchel");

    }
}
