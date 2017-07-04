package abstractt;

import java.util.Random;

/**
 * Created by vladimir on 04.07.17.
 */
public abstract class Insect implements Insectable {

    protected String name;


    public void crawl() {

        Random q = new Random();

        crawl(q.nextInt(), q.nextInt(), q.nextInt());


    }


}
