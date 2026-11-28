package Building;

import java.util.ArrayList;

import Area.Area;

public class Building extends Area{
    private int capacity;
    private int surface;
    private Cleanliness state;
    private int nbPresent;

    protected static enum Cleanliness {
        BAD,
        GOOD,
        CLEAN;
    }
    
    public Building(int area, int capacity, Cleanliness state, String name){
        super(name);
        this.state = state;
        this.nbPresent = 0;
    }

    public int getCapacity() {
        return capacity;
    }
    public int getSurface() {
        return surface;
    }
    public int getNbPresent() {
        return nbPresent;
    }
    public Cleanliness getState() {
        return state;
    }
    
    @Override 
    public String getStringCharacter(){
        if (!this.getPresent().isEmpty()){
            StringBuilder str = new StringBuilder();
            for (int i=0; i<this.getPresent().size()-1; i++){
                str.append(this.getPresent().get(i).toString() + '\n');
            }
            return str.toString();
        }
        return "Aucun personnage présent dans le bâtiment.";
    }

    public void setNbPresent(int nbPresent) {
        this.nbPresent = nbPresent;
    }

    public String maintenance(){
        if (state == Cleanliness.CLEAN){
            return "Etat du bâtiment: CLEAN";
        } else{
            if (nbPresent == 0){
                return "Netoyage fini" + '\n' + "Etat du batiment: CLEAN";
            }else{
                return "Nett                                                                                                                                                                                oyage impossible, personne(s) presente(s)";
            }
        }
    }
}
