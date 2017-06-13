package Statici;

/**
 * Created by voca on 23.05.17.
 */
public class Stat {
    public String a;
    public int b;

    public static double SchetchikObjectov;

    static {
        SchetchikObjectov = 19;
        System.out.println("statik");
    }



    public Stat(String a, int b) {
        this();
        this.a = a;
        this.b = b;
        System.out.println("konstr s param");
    }


    public Stat() {
        SchetchikObjectov++;
        System.out.println("konstr bez param");
    }


    public void printC(){
        System.out.println(SchetchikObjectov);
    }

    public void incrementc (){
        SchetchikObjectov++;
    }
}

