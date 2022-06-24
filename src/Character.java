import java.util.HashMap;
import java.util.Scanner;

public class Character {

    private Jobs job;
    private Race race;

    public void setJob(Jobs job) {
        this.job = job;
    }

    public void setRace(Race race) {
        this.race = race;
    }

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
}
