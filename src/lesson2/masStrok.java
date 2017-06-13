package lesson2;

/**
 * Created by voca on 23.04.17.
 */
public class masStrok {
    public static void main(String[] args) {
        String[] stroki;
        stroki = new String[4];
        stroki[2] = "sobaki";
        stroki[1] = "koti gadi";
        stroki[3] = "dikie korovi";
        stroki[0] = "pole";
        for (int i = 3; i >= 0; i--) {
            System.out.println(stroki[i]);

        }

    }
}
