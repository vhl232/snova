package enimi;

public class Karta {

    private Masti mast;
    private Karti karta;

    public Karta(Masti mast, Karti karta) {
        this.mast = mast;
        this.karta = karta;
    }

    public Masti getMast() {
        return mast;
    }

    public Karti getKarta() {
        return karta;
    }

    @Override
    public String toString() {
        return "Karta{" +
                "mast=" + mast +
                ", karta=" + karta +
                '}';
    }
}
