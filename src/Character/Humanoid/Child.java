package Character.Humanoid;
import Character.Humanoid.Humanoid;

public class Child extends Humanoid {
    public Child(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Child(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator,Location location) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator,location);
    }

    @Override
    public String toString() {
        return "Child{" + super.toString() + "}";
    }
}
