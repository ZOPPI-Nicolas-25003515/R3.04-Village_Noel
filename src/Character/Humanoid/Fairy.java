package Character.Humanoid;
import Character.Humanoid.Humanoid;

public class Fairy extends Humanoid {
    public Fairy(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Fairy(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator);
    }

    @Override
    public String toString() {
        return "Fairy{" + super.toString() + "}";
    }
}
