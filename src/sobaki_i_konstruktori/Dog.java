package sobaki_i_konstruktori;

/**
 * Created by vladimir on 27.06.17.
 */
public class Dog {

    private String name;

    private int age;


    public Dog() {

        name = "Vitya";

        age = 2;
    }

    public Dog(String name) {

        this();

        this.name = name;


    }

    public Dog(int age) {

        this();
        this.age = age;
    }


    public Dog(String name, int age) {

        this.name = name;

        this.age = age;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;

    }

}
