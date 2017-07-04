package abstractt;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by vladimir on 04.07.17.
 */
public class Mir {

    public static void main(String[] args) throws InterruptedException {

        List<Insect> nasecomie = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            nasecomie.add(InsectAbstractFacrory.nasecomie());

            Thread.sleep(1);

        }


        Insect a = nasecomie.get(3);

        Set<Insect> bezumniiTrah = a.multiplay(9);

        nasecomie.addAll(bezumniiTrah);

        System.out.println(nasecomie.size());

        Insect predator;

        for (int i = 0; i < nasecomie.size(); i++) {

            //System.out.println(nasecomie.get(i).getClass());

        }


        do {
            predator = nasecomie.get((int) (Math.random() * nasecomie.size()));

            //System.out.println(predator.getClass());

            if (predator instanceof Ant) {

                ((Ant) predator).hunt(nasecomie.get((int) (Math.random() * nasecomie.size())));
            }

        }
        while (!(predator instanceof Ant));
    }
}
