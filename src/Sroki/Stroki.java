package Sroki;

import java.util.ArrayList;

/**
 * Created by voca on 28.05.17.
 */
public class Stroki {
    private static String s = "https://www.google.com.ua/url?sa=t&rct=j&q=&esrc=s&source=web&cd=10&cad=rja&uact=8&ved=0ahUKEwjM_tOxiZLUAhXpYpoKHfmuDvYQFghkMAk&url=http%3A%2F%2Fstyleinsider.com.ua%2F2016%2F03%2Fpanivalkova%2F&usg=AFQjCNHHPtExzJVIxL9n3tc2hA46Golbsg";
    private static ArrayList< Pari > pari = new ArrayList<>();

    public static void main(String[] args) {
        s = s.substring(s.indexOf('?')+1);
        String [] stroki = s.split("&");
        for (String ss : stroki) {
            //System.out.println(ss);
           String [] dd = ss.split("=");
           Pari para = new Pari();
           if (dd.length>0){
           para.setParametr(dd[0]);
           }
           if (dd.length>1){
               para.setZnachenie(dd[1]);
           }
            //System.out.println(para);
            pari.add(para);
        }
        print();

    }

    private static void print(){
        for (int i = 0; i <pari.size() ; i++) {
            System.out.println(pari.get(i));
        }

    }

}
