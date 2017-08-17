import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortirovkaObjektov {

    static private ArrayList<Dog> dogs = new ArrayList<>();

    static {
        dogs.add(new Dog("Dik", 12));
        dogs.add(new Dog("Dik", 5));
        dogs.add(new Dog("Skay", 7));
        dogs.add(new Dog("Sneghok", 12));
        dogs.add(new Dog("Volk", 3));
        dogs.add(new Dog("Skay", 14));
        dogs.add(new Dog("Dik", 12));
    }

    /*public static class OtherComparator implements Comparator<Dog>{




        @Override
        public int compare(Dog o1, Dog o2) {
            if(o1.age>o2.age) return -1;

            else if(o1.age < o2.age)
                return 1;

            else return o1.name.compareTo(o2.name) * -1;
        }
    }*/

    public static void main(String[] args) {

        MyComparator w = new MyComparator();

        //OtherComparator q = new OtherComparator();


        Collections.sort(dogs);

        for (Dog a : dogs) {
            System.out.println(a);
        }

        System.out.println(" ");

        Collections.sort(dogs, w);


        for (Dog a : dogs) {
            System.out.println(a);
        }


    }

    public static class Dog implements Comparable<Dog> {

        String name;

        int age;


        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Ya sobaka " + name + " , mne " + age + " let.";
        }

        @Override
        public int compareTo(Dog o) {
            if (this.age > o.age) return -1;

            else if (this.age < o.age)
                return 1;

            else return this.name.compareTo(o.name) * -1;
        }
    }

    public static class MyComparator implements Comparator<Dog> {


        @Override
        public int compare(Dog o1, Dog o2) {


            if (o1.age < o2.age) return -1;

            else if (o1.age > o2.age)
                return 1;

            else return o1.name.compareTo(o2.name);

        }
    }


}
