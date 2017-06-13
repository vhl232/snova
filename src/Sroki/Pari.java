package Sroki;

/**
 * Created by voca on 28.05.17.
 */
public class Pari {
    private String parametr;
    private String znachenie;

    public Pari(){
        parametr = "";
        znachenie = "";

    };

    public Pari(String parametr, String znachenie){
        this.parametr = parametr;
        this.znachenie = znachenie;



    };

    public String getParametr() {
        return parametr;
    }

    public void setParametr(String parametr) {
        this.parametr = parametr;
    }

    public String getZnachenie() {
        return znachenie;
    }

    public void setZnachenie(String znachenie) {
        this.znachenie = znachenie;
    }

    @Override
    public String toString() {
        return parametr+" -> "+znachenie;
    }
}
