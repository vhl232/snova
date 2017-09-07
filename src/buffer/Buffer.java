package buffer;

import java.util.Scanner;

public class Buffer {

    /*public static void main(String[] args) throws IOException {

        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

        String s = a.readLine();

        //int i = Integer.parseInt(s);

        String [] m = s.split(", ");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);

        }

        System.out.println(s.split(" "));
    }*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = " ";
        while (scanner.hasNext() && !"".equals(s)) {
            s = scanner.next();
        }
    }
}
