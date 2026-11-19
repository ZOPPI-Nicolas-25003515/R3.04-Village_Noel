package Character.Humanoid;
import Character.Character;

public class Humanoid extends Character {

    public Humanoid(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Humanoid(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator);
    }

    @Override
    public String toString() {
        return "Humanoid{" + super.toString() + "}";
    }
}
