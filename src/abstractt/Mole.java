package abstractt;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vladimir on 04.07.17.
 */
public class Mole extends Insect {
    @Override
    public void crawl(int xDirection, int yDirection, int zDirection) {


        System.out.println("polzu s trudom");
    }

    @Override
    public Set<Insect> multiplay(double larvas) {

        Set<Insect> result = new HashSet<>();

        for (int i = 0; i < larvas; i++) {


            result.add(new Mole());

        }

        return result;
    }

    @Override
    public void makeNoise() {

        //mole ne shumit
    }
}
