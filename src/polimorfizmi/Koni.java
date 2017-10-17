package polimorfizmi;

public abstract class Koni implements Begushii {

    protected int age;
    protected String name;

    public Koni(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void beghat() {
        System.out.println("zok-zok " + name);
    }

    public void sleep() {
        System.out.println(name + "spit na boku ");
    }
}
