package abstractt;

import java.util.Set;

/**
 * Created by vladimir on 04.07.17.
 */
public interface Insectable {

    void crawl(int xDirection, int yDirection, int zDirection);

    Set<Insect> multiplay(double larvas);

    void makeNoise();


}
