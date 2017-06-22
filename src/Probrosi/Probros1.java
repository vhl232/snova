package Probrosi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vladimir on 22.06.17.
 */
public class Probros1 {
    public static void main(String[] args) {

        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));


        double s = 0;
        boolean flag = true;//pokazivaet pravilnost vvoda polzovatelem chisla

        do {
            System.out.println("vvedite pervoe chislo");
            try {

                s = Double.parseDouble(a.readLine());
                break;

            } catch (NumberFormatException e) {
                flag = false;
                System.out.println("mudak");
            } catch (IOException e) {
            }
        }
        while (flag != true);


        double d = 0;

        do {
            System.out.println("vvedite vtoroe chislo");

            try {
                d = Double.parseDouble(a.readLine());
                if (d == 0) {
                    throw new PidorasException();
                }
                break;
            } catch (NumberFormatException e) {

                flag = false;
                System.out.println("ti snova mudak");
            } catch (IOException e) {
            }

        }
        while (!flag);


        double f = s / d;

        System.out.println("vash rezultat : " + f);
    }
}
