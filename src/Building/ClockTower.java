package Building;

import java.time.LocalTime;

public class ClockTower extends Building {
    
    private LocalTime date;
    private int christmasIndicator = 100;

    public ClockTower(int area, int capacity, Cleanliness state){
        super(area, capacity, state);
        this.date = LocalTime.now();
    }

}
