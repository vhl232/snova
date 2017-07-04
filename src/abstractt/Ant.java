package abstractt;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vladimir on 04.07.17.
 */
public class Ant extends Insect {
    @Override
    public void crawl(int xDirection, int yDirection, int zDirection) {

        System.out.println(" polzu bistro");

    }

    @Override
    public Set<Insect> multiplay(double larvas) {

        Set<Insect> murachi = new HashSet<>();

        for (int i = 0; i < larvas; i++) {

            murachi.add(new Ant());
        }

        return murachi;

    }

    @Override
    public void makeNoise() {

        System.out.println("shur-shur-shur");

    }


    public boolean hunt(Insect a) {

        if (a instanceof Bee || a instanceof Bug) {

            System.out.println("guyz help ");

            return false;
        }
        System.out.println("nyam - nyam - nyam vkusnyashka");
        return true;


    }
}
