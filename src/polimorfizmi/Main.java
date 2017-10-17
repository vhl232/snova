package polimorfizmi;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Koni> koni = new LinkedList();

        koni.add(new Zebra(4, "polosa"));
        koni.add(new Musteng(6, "pchel"));
        koni.add(new TyglovoiKon(4, "Kashtan",
                new DomashniiKon.Person("Ed", "Den")));
        koni.add(new SkakoviKon(6, "Pegas",
                new DomashniiKon.Person("Dik", "Ron")));


        for (Begushii k : koni) {
            k.beghat();
            ((Koni) k).sleep();
        }


    }

    public static void pokatatsa(Koni a) {
        if (!(a instanceof Opastnost)) {
            a.beghat();
        }

    }
}
