package polimorfizmi;

public class Musteng extends Dikiikon implements Opastnost {


    public Musteng(int age, String name) {
        super(age, name);
    }

    public Koni power(Koni a) {

        return age > a.age ? a : this;

    }
}
