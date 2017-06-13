package shto_to_novoe;

/**
 * Created by voca on 11.05.17.
 */
public class B extends A{
    String slon;
    String cherepaha;
    public B(){
        name = "Sidor";
        surname = "Sidorov";
        System.out.println("constr B");
    };
    public String lo(){
        return "b-lo";
    }
    public String so () {
        return "b - so ";
    }

    @Override
    public String kr() {
        return "b-kr";
    }

    @Override
    public String bv() {
        return "b-bv";
    }
}
