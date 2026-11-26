package Character.Humanoid;
import Character.Humanoid.Humanoid;
import Character.Chiller;

public class Child extends Humanoid implements Chiller {
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

    public void haveFun() {
        this.setChristmasIndicator(this.getChristmasIndicator() + 20);
    }
}
