package map;

import java.util.HashMap;
import java.util.Map;

public class MapHaus {


    public static void main(String[] args) {

        Map<Haus, Chelovechek> gilyo = new HashMap<>();

        Haus a = new Haus("Pushkina", 15);


        gilyo.put(new Haus("Posk", 15),
                new Chelovechek("Rome"));

        gilyo.put(a, new Chelovechek("dik"));

        gilyo.put(new Haus("Oz", 15),
                new Chelovechek("Lom"));


        for (Map.Entry<Haus, Chelovechek> para : gilyo.entrySet()) {
            System.out.println(para);

        }

        System.out.println(gilyo.get(a));

        a.nomerDoma = 200;

        System.out.println(gilyo.get(a));


    }

    static class Chelovechek {
        String name;

        public Chelovechek(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Chelovechek{" + name + '\'' + '}';
        }
    }

}
