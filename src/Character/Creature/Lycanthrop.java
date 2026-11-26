package Character.Creature;
import Character.Creature.Creature;

public class Lycanthrop extends Creature {
    public Lycanthrop(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Lycanthrop(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator,Location location) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator,location);
    }

    @Override
    public String toString() {
        return "Lycanthrop{" + super.toString() + "}";
    }
}
