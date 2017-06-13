package lesson2;

/**
 * Created by voca on 20.04.17.
 */
public class dfgdfg {
    public static void main(String[] args) {
        int a = 12, b = 12;
        System.out.println(checkSymbol(a, b));
        System.out.println(checkSymbol(3, 7));

        printSymbol(12, 15);

    }

    private static char checkSymbol(int a, int b) {
        if(a>b) return '>';
        else  {
            if (a<b) return '<';
            else return '=';
            }
    }

    private static void printSymbol(int a, int b) {
        if(a>b) System.out.println('>');
        else  {
            if (a<b) System.out.println('<');
            else System.out.println('=');
        }
    }
}
