import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by vladimir on 15.06.17.
 */
public class ChislaVMatrize {
    public static void main(String[] args) throws IOException {
        BufferedReader chislo = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Vvedite stroki:");

        int stroka = Integer.parseInt(chislo.readLine());

        System.out.println("Vvedite stolbzi:");

        int stolbzi = Integer.parseInt(chislo.readLine());

        int[][] massiv = new int[stroka][stolbzi];


        napolninelMassivaSluchCHislami(massiv);

        sort(massiv);


        vivod(massiv);


    }

    private static void napolninelMassivaSluchCHislami(int[][] s) {

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                s[i][j] = (int) (Math.random() * 100);

            }


        }

    }

    private static void vivod(int[][] s) {

        for (int i = 0; i < s.length; i++) {
            // Arrays.sort(s[i]);
            for (int j = 0; j < s[i].length; j++) {
                if (s[i][j] < 10) {
                    System.out.print(" ");

                }

                System.out.print(" " + s[i][j]);
            }
            System.out.println();// perenos stroki
        }
    }

    private static void sort(int[][] s) {

        int[] d = new int[s.length * s[0].length];

        int schetchik = 0;

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {

                d[schetchik] = s[i][j];
                schetchik++;

            }
        }
        Arrays.sort(d);
        int dlina = s[0].length;
        int i, j;

        for (int k = 0; k < d.length; k++) {
            i = k / dlina;
            j = k % dlina;
            s[i][j] = d[k];


        }


    }
}
