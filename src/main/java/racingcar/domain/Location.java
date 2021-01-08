package racingcar.domain;

import java.util.Objects;

public class Location {
    private int location;

    public Location(int location) {
        if (location < 0) {
            location = 0;
        }
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.move()) location++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location1 = (Location) o;
        return location == location1.location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(location);
    }

}
