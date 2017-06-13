package shto_to_novoe;

import java.io.BufferedReader;
import java.io.Reader;

/**
 * Created by voca on 11.05.17.
 */
public class Stroca extends BufferedReader{
    public Stroca(Reader in) {
        super(in);
    }

    public Stroca(Reader in, int sz) {
        super(in, sz);
    }
}
