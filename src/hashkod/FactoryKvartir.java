package hashkod;

import novii.Whore;

import java.util.*;

/**
 * Created by vladimir on 02.07.17.
 */
public class FactoryKvartir {

    private static Random r = new Random();

    public static Apartment getKvartir() {

        Set<Wall> steni = new HashSet<>();

        int ii = (int) (Math.random() * 10) + 4;
        for (int i = 0; i < ii; i++) {

            steni.add(getWall());

        }

        List<Window> okna = new ArrayList<>();

        ii = (int) (Math.random() * 5) + 1;

        for (int i = 1; i < ii; i++) {

            okna.add(getWindow());

        }


        ii = (int) (Math.random() * 10) + 1;

        Doors[] dveri = new Doors[ii];

        for (int i = 0; i < dveri.length; i++) {

            dveri[i] = getDoors();
        }

        boolean s = r.nextBoolean();

        if (s) {

            Whore[] shluhi = {new Whore(17, "ira", 0),
                    new Whore(35, "Nata", 51)};

            return new Apartment(steni, okna, dveri, shluhi);
        }


        return new Apartment(steni, okna, dveri);
    }


    public static Doors getDoors() {

        boolean isWindowed = r.nextBoolean();
        if (isWindowed) {
            return new Doors(r.nextInt(), r.nextInt(), getWindow());
        } else {
            return new Doors(r.nextInt(), r.nextInt());
        }
    }


    public static Window getWindow() {

        return new Window(r.nextInt(), r.nextInt(), r.nextDouble());
    }

    public static Wall getWall() {

        String[] colors = new String[]{"red", "blue", "dark", "white", "yellow", "green"};

        String color = colors[(int) (Math.random() * colors.length)];

        Consistens c;

        switch ((int) (Math.random() * 3)) {

            case 0:
                c = Consistens.LOOSE;

            case 1:
                c = Consistens.SOFT;

            default:
                c = Consistens.TOUGH;

        }
        return new Wall(r.nextInt(), r.nextInt(), c, color);

    }
}
