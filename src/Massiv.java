/**
 * Created by vladimir on 10.06.17.
 */
public class Massiv {
    public static final int[] array = new  int[]{100, 228, -112 , -14, 12, 0, 100,
    445, -112, 3};

    public static void main(String[] args) {

        punktA();
        punktB();
        punktC();
        punktD();


    }

    public static void punktA(){
        int min = Integer.MAX_VALUE;
        int indexMin = -1;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (min >= element) {
                min = element;
                indexMin = i;
            }


        }
        System.out.println(min +" " + indexMin);

    }

    public static void punktB() {
        int max = Integer.MIN_VALUE;
        int indexMax = -1;
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            if (max < element) {
                max = element;
                indexMax = i;
            }


        }
        System.out.println(max + " " + indexMax);
    }

    public  static void punktC(){
        int  sred = 0;
        for(int element : array){
            sred += element;}
        System.out.println(sred/(double)array.length);

        }



    public static void punktD(){
        int min = Integer.MAX_VALUE;
        int notSoMin = 0;

        for (int element : array) {
            if (element < notSoMin){
                notSoMin = element;
            } else if (min >= element) {
                //if (min!= element) notSoMin = min;

                min = element;


            }



        }
        System.out.println(notSoMin + " " + min);

    }



    }



