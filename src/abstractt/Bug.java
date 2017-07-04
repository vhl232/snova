package abstractt;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vladimir on 04.07.17.
 */
public class Bug extends Insect {
    @Override
    public void crawl(int xDirection, int yDirection, int zDirection) {

        System.out.println("prymo");
    }

    @Override
    public Set<Insect> multiplay(double larvas) {

        Set<Insect> bug = new HashSet<>();
        for (int i = 0; i < larvas; i++) {

            bug.add(new Bug());

        }

        return bug;
    }

    @Override
    public void makeNoise() {

        System.out.println("zguk skrepit krilyami");

    }
}
