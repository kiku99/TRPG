import java.util.HashMap;

public class Status {

    Character character;
    HashMap<String, String> characterMap = Character.characterMap;
    HashMap<String, Integer> statusMap = new HashMap<String, Integer>();
    public Status(){
        character = new Character();

    }
    public enum status{
        STR, DEX, INT, CON, BLS;
    }

    public void setStatus(){
        setRaceStatus();
        setJobsStatus();
    }

    // 종족 스탯 설정
    public void setRaceStatus(){
        if (characterMap.get("race").equals("OAK")){
            statusMap.put(status.STR.name(), 4);
            statusMap.put(status.DEX.name(), 1);
            statusMap.put(status.INT.name(), 0);
            statusMap.put(status.CON.name(), 4);
            statusMap.put(status.BLS.name(), 1);
        }
        else if (characterMap.get("race").equals("HUMAN")){
            statusMap.put(status.STR.name(), 1);
            statusMap.put(status.DEX.name(), 3);
            statusMap.put(status.INT.name(), 3);
            statusMap.put(status.CON.name(), 1);
            statusMap.put(status.BLS.name(), 2);
        }
        else if (characterMap.get("race").equals("ELF")){
            statusMap.put(status.STR.name(), 1);
            statusMap.put(status.DEX.name(), 2);
            statusMap.put(status.INT.name(), 3);
            statusMap.put(status.CON.name(), 0);
            statusMap.put(status.BLS.name(), 4);
        }
        else if (characterMap.get("race").equals("DWARF")){
            statusMap.put(status.STR.name(), 2);
            statusMap.put(status.DEX.name(), 4);
            statusMap.put(status.INT.name(), 1);
            statusMap.put(status.CON.name(), 2);
            statusMap.put(status.BLS.name(), 0);
        }
    }


    // 직업 스탯 설정
    public void setJobsStatus(){
        if (characterMap.get("jobs").equals("KNIGHT")){
            statusMap.put(status.STR.name(), statusMap.get(status.STR.name()) + 5);
            System.out.println(statusMap.get(status.STR.name()));
        }
    }

    }


