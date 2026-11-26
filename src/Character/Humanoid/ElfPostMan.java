package Character.Humanoid;
import Character.Worker;
import Character.Chiller;

public class ElfPostMan extends Humanoid implements Worker {
    public ElfPostMan(String name, String gender, int age) {
        super(name, gender, age);
    }

    public ElfPostMan(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator,Location location) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator,location);
    }

    @Override
    public String toString() {
        return "ElfPostMan{" + super.toString() + "}";
    }

    public void work() {
        if (this.getLocation() instanceof Post) {
            this.setActive(true);

        }
    }
}
