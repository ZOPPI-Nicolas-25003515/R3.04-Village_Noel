package Character.Creature;
import Character.Creature.Creature;
import Character.Humanoid.Humanoid;

public class Lycanthrop extends Creature {
    public Lycanthrop(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Lycanthrop(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator,Location location) {
        super(name, gender, age, fatigueIndicator, hungerIndicator, christmasIndicator,location);
    }

    @Override
    public String toString() {
        return "Lycanthrop{" + super.toString() + "}";
    }

    public void devoure(Humanoid humanoid) {
        if (this.getHungerIndicator() <= 65) {
            humanoid.setAlive(false);
            this.setHungerIndicator(this.getHungerIndicator() + 50);
            this.setChristmasIndicator(this.getChristmasIndicator() + 10);
            System.out.println(this.getName() + " a dévoré " + humanoid.getName() + " !\n");
            for (int i = 0; i < this.getLocation().present.size(); ++i) {
                if (this.getLocation().present.get(i) instanceof Humanoid) this.getLocation().present.get(i).setChristmasIndicator(this.getChristmasIndicator() - 50);
            }
        }
    }
}
