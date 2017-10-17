package polimorfizmi;

public class Zebra extends Dikiikon {

    public Zebra(int age, String name) {
        super(age, name);
    }

    @Override
    public void beghat() {
        System.out.println("polosataya zebra " + name + " ubegauy");
    }
}
