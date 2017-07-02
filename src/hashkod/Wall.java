package hashkod;

/**
 * Created by vladimir on 02.07.17.
 */
public class Wall {

    private int tall;
    private int width;
    private Consistens consinstens;
    private String color;

    public Wall(int tall, int width, Consistens consinstens, String color) {
        this.tall = tall;
        this.width = width;
        this.consinstens = consinstens;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "tall=" + tall +
                ", width=" + width +
                ", consinstens=" + consinstens +
                ", color='" + color + '\'' +
                '}';
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Consistens getConsinstens() {
        return consinstens;
    }

    public void setConsinstens(Consistens consinstens) {
        this.consinstens = consinstens;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
