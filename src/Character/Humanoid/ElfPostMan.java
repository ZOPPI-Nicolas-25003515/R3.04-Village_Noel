package Character.Humanoid;
import Character.Humanoid.Humanoid;

public class ElfPostMan extends Humanoid {
    public ElfPostMan(String name, String gender, int age) {
        super(name, gender, age);
    }

    public ElfPostMan(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator);
    }

    @Override
    public String toString() {
        return "ElfPostMan{" + super.toString() + "}";
    }
}
