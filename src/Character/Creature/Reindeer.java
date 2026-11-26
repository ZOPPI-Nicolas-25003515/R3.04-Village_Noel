package Character.Creature;
import Character.Creature.Creature;

public class Reindeer extends Creature {
    public Reindeer(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Reindeer(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator,Location location) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator, location);
    }

    @Override
    public String toString() {
        return "Reindeer{" + super.toString() + "}";
    }
}
