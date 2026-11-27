package Character.Humanoid;
import Character.Humanoid.Humanoid;
import Character.Chiller;

public class Child extends Humanoid implements Fun {
    public Child(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Child(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator);
    }

    @Override
    public String toString() {
        return "Child{" + super.toString() + "}";
    }

    public void haveFun() {
        this.setChristmasIndicator(this.getChristmasIndicator() + 20);
    }
}
