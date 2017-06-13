package Data;

import novii.Whore;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by voca on 16.05.17.
 */
public class SuperList implements PoliteList{
    private List<Whore> list = new ArrayList<Whore>();


    @Override
    public long getSize() {
        return list.size();

    }

    @Override
    public void add(Whore shlyuha) {

        list.add(shlyuha);
    }

    @Override
    public Whore get(long index) {
        return list.get((int) index);
    }

    @Override
    public void SayHallo() {
        System.out.println("say Hallo");

    }

    @Override
    public void NoSayGudbay() {
        System.out.println("gudbay");

    }
}
