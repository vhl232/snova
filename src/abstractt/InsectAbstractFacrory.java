package abstractt;

/**
 * Created by vladimir on 04.07.17.
 */
public class InsectAbstractFacrory {

    public static Insect nasecomie() {

        long secunda = System.currentTimeMillis();

        int lastNumber = (int) secunda % 10;

        switch (lastNumber) {

            case 0:

                return new Ant();

            case 1:

                return new Bug();

            case 2:

                return new Fly();

            case 3:

                return new Mole();

            default:

                return new Bee();

        }

    }
}
