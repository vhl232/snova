package Statici;

/**
 * Created by voca on 23.05.17.
 */
public class Main {

    private String bbb;

    public static void main(String[] args) {
        Stat o1 = new Stat("fgf",454);
        System.out.println(Stat.SchetchikObjectov);
        Stat o2 = new Stat();
        System.out.println(Stat.SchetchikObjectov);
        o2.a = "fgfd";
        o2.b = 344;
        //Stat.SchetchikObjectov = 5;

       // o1.printC();
       // o1.incrementc();
       // o2.printC();
        new  Stat();
        System.out.println(Stat.SchetchikObjectov);
        //bbb = "gfggff";





    }
}
