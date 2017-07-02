package hashkod;

import novii.Whore;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vladimir on 02.07.17.
 */
public class Main {


    public static void main(String[] args) {


        System.out.println(new Whore(67, "gosha", 90));

        List<Apartment> kvartiri = new ArrayList<>();

        int a = (int) (Math.random() * 640) + 1;

        for (int i = 0; i < a; i++) {

            kvartiri.add(FactoryKvartir.getKvartir());


        }


        Hous haus1 = new Hous(kvartiri);


        List<Apartment> kvartiriNovie = new ArrayList<>();

        int b = (int) (Math.random() * 640) + 1;

        for (int i = 0; i < b; i++) {

            kvartiriNovie.add(FactoryKvartir.getKvartir());


        }


        Hous hausNovii = new Hous(kvartiriNovie);


        //System.out.println(haus1.equals(hausNovii));

        System.out.println(haus1.getKvartiri().get(7));

        System.out.println(haus1 + " " + hausNovii);
    }


}
