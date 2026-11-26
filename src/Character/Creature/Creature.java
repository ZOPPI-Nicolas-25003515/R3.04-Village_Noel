package Character.Creature;
import Character.Character;

public abstract class Creature extends Character {

    public Creature(String name, String gender, int age) {
        super(name,gender,age);
    }

    public Creature(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator,Location location) {
        super(name,gender,age,fatigueIndicator,hungerIndicator,christmasIndicator,location);
    }

    @Override
    public String toString() {
        return "Creature{" + super.toString() + "}";
    }
}
