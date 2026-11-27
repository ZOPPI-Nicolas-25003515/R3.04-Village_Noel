package Building;

import java.util.ArrayList;

public class Cottage extends Building {

    private Gendre genre;

    protected static enum Gendre {
        Men,
        Women,
    }

    public Cottage(int area, int capacity, Cleanliness state){
        super(area, capacity, state, "Chalet");
    }

    public Gendre getGenre() {
        return genre;
    }

}
