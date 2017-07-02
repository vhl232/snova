package novii;

/**
 * Created by voca on 06.05.17.
 */
public class Whore {
    public double money;
    protected int men;
   private int age;
   private String name;


    public Whore(int age, String name, int men) {
        this.age = age;
        this.name = name;
        this.men = men;
        this.money = 0;
    }

    @Override
    public String toString() {
        return String.format("menya zavut %s , mne %d let, " +
                "u menya est %.2f gr, u menya bilo %d mugikov" +
                " i dve sobaki ", name, age, money, men);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = age;
        result = 31 * result + name.hashCode();
        result = 31 * result + men;
        temp = Double.doubleToLongBits(money);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {

            return true;

        }

        Whore that;
        if (!(obj instanceof Whore)) {

            return false;
        } else {

            that = (Whore) obj;
        }

        if (this.age != that.age) {
            return false;
        }
        if (this.money != that.money) {
            return false;
        }
        if (this.men != that.men) {
            return false;
        }
        return this.name.equals(that.name);
    }

    public void  fuck (double money){
       System.out.println("love is...");
       this.money+=money;
       men++;


    }

    public int howOld() {
       return 18;
   }
   public String whatYuorName(){
       return "Angel";
   }
   public int men(){
       return men;

   }
}
