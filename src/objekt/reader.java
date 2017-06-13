package objekt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by voca on 23.04.17.
 */
public class reader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("veashe imya?");
        String a = reader.readLine();
        System.out.println(" age?");
        String b = reader.readLine();
        User user = new User();
        user.name = a;
        user.age = Integer.parseInt(b);
        System.out.println(user.name + " " + user.age);

    }
}
