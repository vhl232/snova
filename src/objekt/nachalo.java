package objekt;

/**
 * Created by voca on 23.04.17.
 */
public class nachalo {
    public static void main(String[] args) {
        Cat pussy = new Cat();
        pussy.name = "murzik";
        System.out.println(pussy.name);
        Cat _2 = new Cat();
        _2.name = "huy";
        System.out.println(_2.name);
        Dog sharic = new Dog();
        sharic.name = "zloba";
        sharic.angryLevel = 10;
        Dog ghuchka = new Dog();
        ghuchka.name = "vonuchka";
        System.out.println(sharic.name + " " + sharic.angryLevel);
        System.out.println(ghuchka.name + " " + ghuchka.angryLevel);
        Dog zmai = new Dog();
        System.out.println(zmai.name + " " + zmai.angryLevel);


    }
}
