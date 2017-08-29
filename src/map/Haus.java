package map;

public class Haus {

    private String street;
    private int nomerDoma;

    public Haus(String street, int nomerDoma) {
        this.street = street;
        this.nomerDoma = nomerDoma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Haus haus = (Haus) o;

        if (nomerDoma != haus.nomerDoma) return false;
        return street.equals(haus.street);
    }

    @Override
    public int hashCode() {
        int result = street.hashCode();
        result = 31 * result + nomerDoma;
        return result;
    }

    @Override
    public String toString() {
        return "Haus{" + street + '\'' + nomerDoma + '}';
    }

    public String getStreet() {
        return street;
    }

    public Haus setStreet(String street) {
        return new Haus(street, this.nomerDoma);
    }

    public int getNomerDoma() {
        return nomerDoma;
    }

    public Haus setNomerDoma(int nomerDoma) {
        return new Haus(street, nomerDoma);
    }
}

