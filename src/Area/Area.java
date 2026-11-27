package Area;

import java.util.ArrayList;

public class Area {
    private ArrayList<Character> present;

    public Area(ArrayList<Character> present){
        this.present = present;
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
    
}
