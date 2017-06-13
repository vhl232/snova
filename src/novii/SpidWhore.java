package novii;

/**
 * Created by voca on 06.05.17.
 */
public class SpidWhore extends Whore
{
    public SpidWhore(int age, String name, int men) {

        super(age, name, men);
    }

    @Override
    public void fuck(double money) {
        System.out.println("tebe pizda, ti zaragon!!");
        this.money+=money;
        this.men++;

    }
}
