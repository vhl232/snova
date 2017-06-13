import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by voca on 06.05.17.
 */
public class Qwadratic {
    public static double[] vh(double a, double b,double c){
        double d,x1,x2;
        d = Math.pow(b,2)-4*a*c;
        if (d>=0){
            if (a!=0){
                x1 = (-b+Math.sqrt(d))/(2*a);
                x2 = (-b-Math.sqrt(d))/(2*a);
                System.out.println("x1= "+x1);
                System.out.println("x2="+x2);
                return new double[]{x1,x2};
            }
            else {
                System.out.println("ne kv ur");
            }
        }
        else {
            System.out.println("kornei net");
        }
        return null;
    }
    public static void main(String[] args) throws IOException {
        double a, b , c;
        BufferedReader klava = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("vvedite a");
        a = Double.parseDouble(klava.readLine());
        System.out.println("vvedite b");
        b = Double.parseDouble(klava.readLine());
        System.out.println("vvedite SchetchikObjectov ");
        c = Double.parseDouble(klava.readLine());
        vh(a,b,c);










    }
}
