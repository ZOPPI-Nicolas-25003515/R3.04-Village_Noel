package Area;

import java.util.ArrayList;

public class Area {
    private ArrayList<Character> present;
    private String name;

    public Area(String name){
        this.present = new ArrayList<Character>();
        this.name = name;
    }

    public ArrayList<Character> getPresent() {
        return present;
    }
    public String getStringCharacter(){
        if (!(present.isEmpty())){
            StringBuilder str = new StringBuilder();
            for (int i=0; i<present.size()-1; i++){
                str.append(present.get(i).toString() + '\n');
            }
            return str.toString();
        }
        return "Pas de personnages présent dans la zone";
    }
    public String getName() {
        return name;
    }
    
}
