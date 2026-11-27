package Building;

import java.util.ArrayList;

public class Enclosure extends Building {
    
    public Enclosure(int area, int capacity, Cleanliness state, ArrayList<Character> present){
        super(area, capacity, state, present, "Enclosure");
    }

}
