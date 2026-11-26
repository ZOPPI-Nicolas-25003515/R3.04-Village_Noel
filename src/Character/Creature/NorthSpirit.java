package Character.Creature;
import Character.Creature.Creature;

public class NorthSpirit extends Creature {
    public NorthSpirit(String name, String gender, int age) {
        super(name, gender, age);
    }

    public NorthSpirit(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator,Location location) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator, location);
    }

    @Override
    public String toString() {
        return "NorthSpirit{" + super.toString() + "}";
    }
}
