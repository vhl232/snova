package novii;

/**
 * Created by voca on 06.05.17.
 */
public class ElitWhore extends Whore {

    public ElitWhore(int age, String name, int men) {
        super(age, name, men);
    }

    @Override
    public void fuck(double money) {
        if (money>100){
            super.fuck(money);
        }
    }
}
