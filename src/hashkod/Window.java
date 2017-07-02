package hashkod;

/**
 * Created by vladimir on 02.07.17.
 */
public class Window {

    private int wide;
    private int tall;
    private double transparens;


    public Window(int wide, int tall, double transparens) {
        this.wide = wide;
        this.tall = tall;
        this.transparens = transparens;
    }

    @Override
    public String toString() {
        return "Window{" +
                "wide=" + wide +
                ", tall=" + tall +
                ", transparens=" + transparens +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Window window = (Window) o;

        if (wide != window.wide) return false;
        if (tall != window.tall) return false;
        return Double.compare(window.transparens, transparens) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = wide;
        result = 31 * result + tall;
        temp = Double.doubleToLongBits(transparens);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public double getTransparens() {
        return transparens;
    }

    public void setTransparens(double transparens) {
        this.transparens = transparens;
    }
}
