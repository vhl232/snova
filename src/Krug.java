import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by voca on 06.05.17.
 */
public class Krug {

    private double radius;
    private String name;

    public void ddd() {
        System.out.println(name + radius);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader klava = new BufferedReader(new InputStreamReader(System.in));
        double r;
        System.out.println("vvedite r");
        r = Double.parseDouble(klava.readLine());
        krug(r);

    }
    public static double krug(double r) throws Exception {
        double result;
        if(r<=0){
            System.out.println("ne hrena ne poluchitsa");
            throw new Exception();
        }

        result = Math.PI*Math.pow(r,2);
        System.out.println(result+" - pl kr");


        return result;

    }
}
