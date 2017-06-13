package Data;

import shto_to_novoe.Stroca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by voca on 16.05.17.
 */
public class Data {
    public static void main(String[] args) throws IOException {

        BufferedReader data= new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();
        String s = data.readLine() ;

        while (!s.equals("")){
            list.add(s);
            s = data.readLine();


        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }





    }
}
