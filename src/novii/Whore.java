package novii;

/**
 * Created by voca on 06.05.17.
 */
public class Whore {
   private int age;
   private String name;
   protected int men;
   public double money;

    public Whore(int age, String name, int men) {
        this.age = age;
        this.name = name;
        this.men = men;
        this.money = 0;
    }

    public void  fuck (double money){
       System.out.println("love is...");
       this.money+=money;
       men++;


   };

   public int howOld(){
       return 18;
   }
   public String whatYuorName(){
       return "Angel";
   }
   public int men(){
       return men;

   }
}
