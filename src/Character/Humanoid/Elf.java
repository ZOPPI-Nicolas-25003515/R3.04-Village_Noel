package Character.Humanoid;
import Character.Humanoid.Humanoid;

public class Elf extends Humanoid {
    public Elf(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Elf(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator);
    }

    @Override
    public String toString() {
        return "Elf{" + super.toString() + "}";
    }
}
