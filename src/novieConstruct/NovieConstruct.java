package novieConstruct;

public class NovieConstruct {
    public static void main(String[] args) throws InterruptedException {

        Dog.p();
        Thread.sleep(2000);
        String s = "murzic";
        // Dog dog =new Dog(s);
        Dog dog1 = new Dog(6);

        System.out.println(dog1.name.length());

        //int a = 0;
        //System.out.println(a);

        //Dog dog;

    }

    public static class Dog {

        static {
            System.out.println("static init");
        }

        int a;

        int b;

        String name;


        public Dog(String name) {

            this();
            System.out.println("constrc name");
            this.name = name;
        }

        public Dog() {

            System.out.println("defolt construct");
            name = "";
        }

        public Dog(int q) {
            this();
            a = q;
            b = a;
            System.out.println("s ciframi");
        }

        static void p() {
            System.out.println("metod static");

        }
    }

}
