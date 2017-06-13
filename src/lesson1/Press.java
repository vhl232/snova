package lesson1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by voca on 28.05.17.
 */
public class Press {

    private String title;
    public String artist;

    public static void main(String[] args) throws IOException, InterruptedException {
        double temp;
        double startTemp = 24.3;
        double workTime;
        BufferedReader data= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("vedi temp");
        temp = Double.parseDouble(data.readLine());

        System.out.println("vedi vremay");

        workTime = Double.parseDouble(data.readLine());

        tempNagreev(startTemp,temp);

        startTime(workTime);

        System.out.println("zaberiti izdelie");
        java.awt.Toolkit.getDefaultToolkit().beep();
        System.out.println("\007");




    }
    public static void tempNagreev(double realnayTemp,double endTemp) throws InterruptedException {
        while (realnayTemp<=endTemp){
            System.out.println("nagevauy "+realnayTemp);
            Thread.sleep(1000);
            realnayTemp += 1;
        }

    }
    public static void startTime(double time) throws InterruptedException {
        while (time >0){
            System.out.println("ranota " +time);
            Thread.sleep(1000);
            time-=1;
        }


        Press ghgh = new Press();
        Press frfrf = new Press();




    }


}
