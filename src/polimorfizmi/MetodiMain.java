package polimorfizmi;

public class MetodiMain implements Metodi {

    public static void main(String[] args) {

        MetodiMain main = new MetodiMain();


        rid(main);
        rid("dffdfd");


    }

    private static String rid(Object o) {
        MetodiMain tip;
        if (o.getClass().equals(MetodiMain.class)) {

            tip = (MetodiMain) o;
        }

        return "";
    }

    public int mnogina() {
        return 0;
    }

    public double min(double a, double b) {
        return 0;
    }

    @Override
    public int plus() {
        return 0;
    }

    @Override
    public int min() {
        return 0;
    }

    @Override
    public int divid() {
        return 0;
    }
}
