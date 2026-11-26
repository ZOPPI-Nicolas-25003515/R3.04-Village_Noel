package Character.Humanoid;

public class Fairy extends Humanoid implements Worker {
    public Fairy(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Fairy(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator,Location location) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator,location);
    }

    @Override
    public String toString() {
        return "Fairy{" + super.toString() + "}";
    }
}
