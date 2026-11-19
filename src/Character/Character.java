package Character;

public abstract class Character {
    private String name;
    private String gender;
    private int age;
    private int hungerIndicator = 100;
    private int fatigueIndicator = 100;
    private int christmasIndicator = 100;

    public Character(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Character(String name, String gender, int age, int fatigueIndicator, int hungerIndicator, int christmasIndicator) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.fatigueIndicator = fatigueIndicator;
        this.hungerIndicator = hungerIndicator;
        this.christmasIndicator = christmasIndicator;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getHungerIndicator() {
        return hungerIndicator;
    }

    public int getFatigueIndicator() {
        return fatigueIndicator;
    }

    public int getChristmasIndicator() {
        return christmasIndicator;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHungerIndicator(int hungerIndicator) {
        this.hungerIndicator = hungerIndicator;
    }

    public void setFatigueIndicator(int fatigueIndicator) {
        this.fatigueIndicator = fatigueIndicator;
    }

    public void setChristmasIndicator(int christmasIndicator) {
        this.christmasIndicator = christmasIndicator;
    }

    public void makeSound () {
        System.out.println("Bonjour !\n");
    }

    public void move() {

    }

    public void restore (Food food) {
        int hunger = food.getHunger() + this.hungerIndicator == 100;
        if (hunger)
            this.hungerIndicator = 100;
        else
    }

}
