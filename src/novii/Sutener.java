package novii;

/**
 * Created by voca on 06.05.17.
 */
public class Sutener {
    public static void main(String[] args) {
        Whore _1 = new ElitWhore(37,"igor",90);
        Whore _2 = new Whore(45,"irina",23);
        Whore _3 = new SpidWhore(20, "wizard", 150);

        for (int i = 0; i < 100; i++) {
            if(i%3==0){_1.fuck(1);
            }
            if (i%3==1){_2.fuck(4);}
            if (i%3==2){_3.fuck(6);}

        }
        System.out.println(_1.money);
        System.out.println(_2.money);
        System.out.println(_3.money);

        _2.money=0;
        System.out.println(_2.money);

        System.out.println(_1.men());
        System.out.println(_2.men());
        System.out.println(_3.men());

    }
}
