package Character.Humanoid;

public class Imp extends Humanoid implements Worker {
    public Imp(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Imp(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator,Location location) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator,location);
    }

    @Override
    public String toString() {
        return "Elf{" + super.toString() + "}";
    }
}
