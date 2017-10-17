package polimorfizmi;

public class DomashniiKon extends Koni {

    protected Person owner;

    public DomashniiKon(int age, String name, Person owner) {
        super(age, name);
        this.owner = owner;
    }

    public void tyanutPlug() {
        System.out.println("ustal suka");
    }

    public static class Person {
        String name;
        String second_name;

        public Person(String name, String second_name) {
            this.name = name;
            this.second_name = second_name;
        }
    }

}

