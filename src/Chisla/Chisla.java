package Chisla;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by voca on 23.05.17.
 */
public class Chisla {
    private  List<Integer> chisla = new ArrayList<>();

    private int max;


    public Chisla (){
        chisla.add(1);
        chisla.add(2);

    }
    public Chisla(int max ){
        this();
        this.max = max;

    }

    public List<Integer> raschet(){
        for (int i = 3; i < max ; i++) {

            if (isPrime(i)){
                chisla.add(i);
            }
        }
        return chisla;

    }
    private boolean isPrime (int number){
        for (int i = 1; i <chisla.size() ; i++) {
            if (number % chisla.get(i)== 0)
                return false;
        }
        return true;
    }


}
