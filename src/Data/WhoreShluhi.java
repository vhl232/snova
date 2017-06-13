package Data;

import novii.Whore;

import java.util.List;

/**
 * Created by voca on 16.05.17.
 */
public class WhoreShluhi {
    public static void main(String[] args) {
        MyList spisokShlyh = new SuperList();

        for (int i = 0; i <3; i++) {
            spisokShlyh.add(new Whore(15,"ari",5));

        }
        List<Polite> fff;
        print(spisokShlyh);


        Polite a = (Polite) spisokShlyh;
        a.NoSayGudbay();
        a.SayHallo();
        PoliteList d = (PoliteList)a;


    }
    private static void print(MyList a){
        for (int i = 0; i < a.getSize(); i++) {
            System.out.println(a.get(i));

        }

    }
}
