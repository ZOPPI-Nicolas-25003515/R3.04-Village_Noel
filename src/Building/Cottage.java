package Building;

import java.util.ArrayList;

public class Cottage extends Building {

    private Gendre genre;

    protected static enum Gendre {
        Men,
        Women,
    }

    public Cottage(int area, int capacity, Cleanliness state, ArrayList<Character> present){
        super(area, capacity, state, present, "Cottage");
    }

    public Gendre getGenre() {
        return genre;
    }

}
