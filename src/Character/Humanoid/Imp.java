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

    public void haveFun() {
        this.setChristmasIndicator(this.getChristmasIndicator() + 10);
    }

    public void makePrank(Prank prank) {
        System.out.println(this.getName() + " a fait une farce de " + prank.getClass() + " !\n");
        for (int i = 0; i < this.getLocation().present.size(); ++i) {
            if (this.getLocation().present.get(i) instanceof Humanoid) this.getLocation().present.get(i).setChristmasIndicator(this.getChristmasIndicator() + 5);
            else this.getLocation().present.get(i).setChristmasIndicator(this.getChristmasIndicator() - 5);
        }
    }
}
