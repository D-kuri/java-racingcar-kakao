package racingcar.domain;

import racingcar.exception.InvalidLocationException;

import java.util.Objects;

public class Location {
    private static final int MIN_LOCATION = 0;
    private int location;


    public Location(int location) {
        if (location < MIN_LOCATION) {
            throw new InvalidLocationException();
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
