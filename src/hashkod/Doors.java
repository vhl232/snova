package hashkod;

/**
 * Created by vladimir on 02.07.17.
 */
public class Doors {

    private int tall;
    private int wide;
    private Window windowVdveri;


    public Doors(int tall, int wide, Window windowVdveri) {
        this.tall = tall;
        this.wide = wide;
        this.windowVdveri = windowVdveri;
    }

    public Doors(int tall, int wide) {
        this.tall = tall;
        this.wide = wide;
    }

    @Override
    public String toString() {
        return String.format("ya dver " + ((windowVdveri != null) ? "s oknom" : "bez okna") +
                " moya visota %d," +
                " shirina %d, okno : %s", tall, wide, windowVdveri);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Doors doors = (Doors) o;

        if (tall != doors.tall) return false;
        if (wide != doors.wide) return false;
        return windowVdveri != null ? windowVdveri.equals(doors.windowVdveri) : doors.windowVdveri == null;
    }

    @Override
    public int hashCode() {
        int result = tall;
        result = 31 * result + wide;
        result = 31 * result + (windowVdveri != null ? windowVdveri.hashCode() : 0);
        return result;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public int getWide() {
        return wide;
    }

    public void setWide(int wide) {
        this.wide = wide;
    }

    public Window getWindowVdveri() {
        return windowVdveri;
    }

    public void setWindowVdveri(Window windowVdveri) {
        this.windowVdveri = windowVdveri;
    }
}
