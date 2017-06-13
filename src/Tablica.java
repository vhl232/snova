/**
 * Created by vladimir on 13.06.17.
 */
public class Tablica {
    public static void main(String[] args) {

        System.out.println("       1   2   3   4   5   6   7   8   9  10");
        System.out.println("     _______________________________________");
        //System.out.print("");
        int a;
        String spaces="";

        for (int stroka = 1; stroka < 11; stroka++) {
            if (stroka<10){
                System.out.print(" ");
            }
            System.out.print(stroka + " | ");


            for (int ryadok = 1; ryadok <11 ; ryadok++) {
                 a = stroka*ryadok;
                if (a < 100) {
                    spaces = " ";
                    if (a < 10) {
                        spaces = "  ";
                    }
                }
                System.out.print(spaces + a +" ");
                spaces = "";
            }


            System.out.println();
        }


    }
}
