package Character.Humanoid;
import Character.Character;

public class Humanoid extends Character {

    public Humanoid(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Humanoid(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator,Location location) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator,location);
    }

    @Override
    public String toString() {
        return "Humanoid{" + super.toString() + "}";
    }

    @Override
    public void changeActivity () {
        if (this.getLocation() instanceof House) this.isActive = !isActive;
    }
}
