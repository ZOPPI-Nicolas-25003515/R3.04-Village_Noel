package Character.Creature;
import Character.Creature.Creature;

public class SnowMan extends Creature {
    public SnowMan(String name, String gender, int age) {
        super(name, gender, age);
    }

    public SnowMan(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator);
    }

    @Override
    public String toString() {
        return "SnowMan{" + super.toString() + "}";
    }
}
