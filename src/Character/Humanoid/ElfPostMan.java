package Character.Humanoid;
import Character.Worker;
import Character.Chiller;

public class ElfPostMan extends Humanoid implements Worker {
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

    public void work(Area area) {
        if (area instanceof Post) {
            this.setActive(true);
        }
    }
}
