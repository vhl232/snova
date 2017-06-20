package potoki;

import java.io.File;

/**
 * Created by vladimir on 20.06.17.
 */
public class FileClass {
    public static void main(String[] args) {
        File a = new File("/home/vladimir/1");

        System.out.println(a.exists());
        System.out.println(a.isFile());
        System.out.println(a.isDirectory());

        String[] s = a.list();

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);

        }


    }

}
