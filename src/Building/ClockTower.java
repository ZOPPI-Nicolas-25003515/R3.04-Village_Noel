package Building;

import java.time.LocalTime;
import java.util.ArrayList;

public class ClockTower extends Building {
    
    private LocalTime date;
    private int christmasIndicator = 100;

    public ClockTower(int area, int capacity, Cleanliness state, ArrayList<Character> present){
        super(area, capacity, state, present, "Clock Tower");
        this.date = LocalTime.now();
    }

    public int getChristmasIndicator() {
        return christmasIndicator;
    }

    public LocalTime getDate() {
        return date;
    }

}
