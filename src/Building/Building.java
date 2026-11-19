package Building;

import java.util.ArrayList;

public class Building {
    private int area;
    private int capacity;
    private Cleanliness state;
    private int nbPresent;
    private ArrayList<Character> present;

    protected static enum Cleanliness {
        BAD,
        GOOD,
        CLEAN;
    }
    
    public Building(int area, int capacity, Cleanliness state){
        this.area = area;
        this.capacity = capacity;
        this.state = state;
        this.nbPresent = 0;
        this.present = new ArrayList<Character>();        
    }

    public int getArea() {
        return area;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getNbPresent() {
        return nbPresent;
    }
    public ArrayList<Character> getPresent() {
        return present;
    }
    public Cleanliness getState() {
        return state;
    }
    public String getFeatCharacter(){
        if (!(present.isEmpty())){
            StringBuilder str = new StringBuilder();
            for (int i=0; i<present.size()-1; i++){
                str.append(present.get(i).toString() + '\n');
            }
            return str.toString();
        }
        return "No Character in this builbing";
    }

    public void setNbPresent(int nbPresent) {
        this.nbPresent = nbPresent;
    }
    public void setPresent(ArrayList<Character> present) {
        this.present = present;
    }

    public String maintenance(){
        if (state == Cleanliness.CLEAN){
            return "Etat du batiment: CLEAN";
        } else{
            if (nbPresent == 0){
                return "Netoyage finis" + '\n' + "Etat du batiment: CLEAN";
            }else{
                return "Netoyage impossible, personne(s) presente(s)";
            }
        }
    }
}
