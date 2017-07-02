package hashkod;

import novii.Whore;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by vladimir on 02.07.17.
 */
public class Apartment {


    private Set<Wall> walls;
    private List<Window> windows;
    private Doors[] doors;

    private Whore[] whores;


    public Apartment(Set<Wall> walls, List<Window> windows, Doors[] doors) {
        this.walls = walls;
        this.windows = windows;
        this.doors = doors;
    }

    public Apartment(Set<Wall> walls, List<Window> windows, Doors[] doors, Whore[] whores) {
        this.walls = walls;
        this.windows = windows;
        this.doors = doors;
        this.whores = whores;
    }

    @Override
    public String toString() {
        return String.format("ya kvartira u menya %d dveri, %d okon, %d sten." +
                        ((whores != null) ? "vo mne zhivet dve shluhi." : "net tut shluh.")
                , doors.length, windows.size(), walls.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apartment apartment = (Apartment) o;

        if (!walls.equals(apartment.walls)) return false;
        if (!windows.equals(apartment.windows)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(doors, apartment.doors)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(whores, apartment.whores);
    }

    @Override
    public int hashCode() {
        int result = walls.hashCode();
        result = 31 * result + windows.hashCode();
        result = 31 * result + Arrays.hashCode(doors);
        result = 31 * result + Arrays.hashCode(whores);
        return result;
    }

    public Set<Wall> getWalls() {
        return walls;
    }

    public void setWalls(Set<Wall> walls) {
        this.walls = walls;
    }

    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }

    public Doors[] getDoors() {
        return doors;
    }

    public void setDoors(Doors[] doors) {
        this.doors = doors;
    }

    public Whore[] getWhores() {
        return whores;
    }

    public void setWhores(Whore[] whores) {
        this.whores = whores;
    }
}
