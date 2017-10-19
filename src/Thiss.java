public class Thiss {

    public static void main(String[] args) {

        Human m = new Human("Marina");
        Human p = new Human("Petya");
        Human v = new Human("Vasya");


        m.walk();
        p.walk();


    }


    public static class Human {

        private String name;
        private int distance;

        public Human(String name) {
            this.name = name;
            distance = 0;
        }

        @Override
        public String toString() {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", distance=" + distance +
                    '}';
        }

        public void walk() {
            System.out.println(this);
        }
    }


}
