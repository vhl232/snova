package enimi;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {


       /* BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("vvedite mast");

        int chisloMasti = Integer.parseInt(a.readLine());

        System.out.println("vvedite kartu");

        int chisloKarti = Integer.parseInt(a.readLine());

        Masti masti;
        Karti karti;

        /*switch (chisloMasti) {
            case 1:
            {masti = Masti.PIKI;
            break;
            }

            case 2:
            {masti = Masti.TREFA;
            break;
            }
            case 3:
            {masti = Masti.BUBNI;
            break;
            }
            default: case 4:
            {masti = Masti.CHIRVI;
            break;}
        }
        masti = Masti.values()[chisloMasti];
        karti = Karti.values()[chisloKarti];

        printt(masti,karti);*/


        List<Karta> koloda = new LinkedList<>();

        Karti[] kartiMassiv = Karti.values();
        Masti[] mastiMassiv = Masti.values();
        for (int i = 0; i < kartiMassiv.length; i++) {
            for (int j = 0; j < mastiMassiv.length; j++) {
                koloda.add(new Karta(mastiMassiv[j], kartiMassiv[i]));
            }
        }
        koloda.forEach(System.out::println);

        Collections.shuffle(koloda);
        System.out.println("");
        koloda.forEach(System.out::println);

    }

    public static void printt(Masti masti, Karti karti) {
        System.out.println(karti);
        System.out.println(masti);
    }


}
