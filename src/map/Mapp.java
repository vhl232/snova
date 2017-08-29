package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Mapp {

    public static void main(String[] args) {

        Map<String, String> slovar = new HashMap<String, String>();
        slovar.put("sobaka", "Dog");
        slovar.put("cat", "kot");
        slovar.put("dimik", "haus");

        System.out.println(slovar.get("cat"));
        System.out.println(slovar.size());
        slovar.put("cat", "mish");
        System.out.println(slovar.get("cat"));
        System.out.println(slovar.size());


        for (Map.Entry<String, String> para : slovar.entrySet()) {
            System.out.println(para.getKey() + ":" + para.getValue());
        }
        System.out.println(slovar);

        Iterator<Map.Entry<String, String>> a = slovar.entrySet().iterator();

        for (int i = 0; a.hasNext(); i++) {

            Map.Entry<String, String> para = a.next();


            System.out.println(i + ") " + para.getKey() + ":" + para.getValue());


        }


    }


}
