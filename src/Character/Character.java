package Character;


public abstract class Character {
    private String name;
    private String gender;
    private int age;
    private int hungerIndicator = 100;
    private int fatigueIndicator = 100;
    private int christmasIndicator = 100;
    private boolean isActive = false;
    private boolean isAlive = true;

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

    public boolean getActivity() {
        return this.isActive;
    }

    public boolean isAlive() {
        return isAlive;
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
        this.hungerIndicator = hungerIndicator >= 0 ? hungerIndicator : 0;
    }

    public void setFatigueIndicator(int fatigueIndicator) {
        this.fatigueIndicator = fatigueIndicator >= 0 ? fatigueIndicator : 0;
    }

    public void setChristmasIndicator(int christmasIndicator) {
        this.christmasIndicator = christmasIndicator >= 0 ? christmasIndicator : 0;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void makeSound () {
        System.out.println("Bonjour !\n");
    }

    public void restore (Food food) {
        if (this.getHungerIndicator() == 100) {
            System.out.println("Le personnage ne peut pas avaler cet ingédient.");
            return;
        }
        int hunger = food.getNutritionalValue() + this.hungerIndicator;
        if (hunger > 110) {
            System.out.println("Le personnage n'a pas assez de place pour cet ingrédient.");
        }
        else this.hungerIndicator = hunger;
    }

    public void changeActivity () {
        this.isActive = !isActive;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", hungerIndicator=" + hungerIndicator +
                ", fatigueIndicator=" + fatigueIndicator +
                ", christmasIndicator=" + christmasIndicator +
                ", isActive=" + isActive +
                ", isAlive=" + isAlive +
                '}';
    }

    
}
