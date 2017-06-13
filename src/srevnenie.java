import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by voca on 06.05.17.
 */
public class srevnenie {
    public static void main(String[] args) throws Exception {
        double a,b ,c;

        BufferedReader klava = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("vvedite a");
        a = Double.parseDouble(klava.readLine());
        System.out.println("vvedite b");
        b = Double.parseDouble(klava.readLine());
        System.out.println("vvedite SchetchikObjectov ");
        c = Double.parseDouble(klava.readLine());

        double r;
        System.out.println("vvedite r");
        r = Double.parseDouble(klava.readLine());


        double[] korni= Qwadratic.vh(a,b,c);
        double x_max = Math.max(korni[0],korni[1]);
        double krug2 = Krug.krug(r);
        System.out.println(Math.max(x_max,krug2));
    }
}
