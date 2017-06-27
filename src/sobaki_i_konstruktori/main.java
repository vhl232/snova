package sobaki_i_konstruktori;

/**
 * Created by vladimir on 27.06.17.
 */
public class main {

    public static void main(String[] args) {

        Dog tuzik = new Dog();

        System.out.println(tuzik.getName());

        tuzik.setAge(5);

        tuzik.setName("sharik");

        System.out.println(tuzik.getName());


        Dog sharik = new Dog("pes", 4);

        System.out.println(sharik.getName() + " " + sharik.getAge());


    }
}
