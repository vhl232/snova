package shto_to_novoe;

/**
 * Created by voca on 11.05.17.
 */
public class A {
    public static void main(String[] args) {
        int [][] a = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println(a[0][2]);
    }
    public String name;
    protected String surname;
    public A(){
        name = "Ivan";
        surname = "Ivanov";
        System.out.println("constr A");

        /*int [][] a = {{1,1,1},{1,1,1}};
        System.out.println(a[2][1]);*/


    };
    public A(String imya, String hvamilya){
         name = imya;
         surname = hvamilya;

    }

    public String kr(){
        return "a-kr";

    }
    public String bv(){
        return "a-bv";
    }
}

