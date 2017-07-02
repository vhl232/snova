package hashkod;

import java.util.List;

/**
 * Created by vladimir on 02.07.17.
 */
public class Hous {

    private List<Apartment> kvartiri;

    public Hous(List<Apartment> kvartiri) {
        this.kvartiri = kvartiri;
    }

    @Override
    public String toString() {
        return String.format("%d kvartir so shluhami i bez", kvartiri.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hous hous = (Hous) o;

        return kvartiri != null ? kvartiri.equals(hous.kvartiri) : hous.kvartiri == null;
    }

    @Override
    public int hashCode() {
        return kvartiri != null ? kvartiri.hashCode() : 0;
    }

    public List<Apartment> getKvartiri() {
        return kvartiri;
    }

    public void setKvartiri(List<Apartment> kvartiri) {
        this.kvartiri = kvartiri;
    }
}
