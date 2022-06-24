import java.util.HashMap;
import java.util.Scanner;

public class Character {

    static HashMap<String, String> characterMap = new HashMap<String, String>();
    public enum Jobs{
        KNIGHT, THIEF, MONK, ARCHER
        }
    public enum Race{
        OAK, HUMAN, ELF, DWARF
    }

//public void selectJob(Character.Jobs job) {
//        characterMap.put("jobs", job.name());
//}
    public void setStatus(){
        if (characterMap.get("race").equals("OAK")){
            System.out.println("test oak");
        }
    }
}
