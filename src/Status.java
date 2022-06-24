import java.util.HashMap;

public class Status {

    Character character;
    HashMap<String, String> characterMap = Character.characterMap;
    HashMap<String, Integer> statusMap = new HashMap<String, Integer>();
    public Status(){
        this.character = new Character();
    }
    public enum status{
        STR, DEX, INT, CON, BLS;
    }

    public void setStatus(){
        setRaceStatus();
        setJobsStatus();
    }

    // Á¾Á· ½ºÅÈ ¼³Á¤
    public void setRaceStatus(){
        if (characterMap.get(Interactive.KEY_RACE).equals("OAK")){
            statusMap.put(status.STR.name(), 4);
            statusMap.put(status.DEX.name(), 1);
            statusMap.put(status.INT.name(), 0);
            statusMap.put(status.CON.name(), 4);
            statusMap.put(status.BLS.name(), 1);
        }
        else if (characterMap.get(Interactive.KEY_RACE).equals("HUMAN")){
            statusMap.put(status.STR.name(), 1);
            statusMap.put(status.DEX.name(), 3);
            statusMap.put(status.INT.name(), 3);
            statusMap.put(status.CON.name(), 1);
            statusMap.put(status.BLS.name(), 2);
        }
        else if (characterMap.get(Interactive.KEY_RACE).equals("ELF")){
            statusMap.put(status.STR.name(), 1);
            statusMap.put(status.DEX.name(), 2);
            statusMap.put(status.INT.name(), 3);
            statusMap.put(status.CON.name(), 0);
            statusMap.put(status.BLS.name(), 4);
        }
        else if (characterMap.get(Interactive.KEY_RACE).equals("DWARF")){
            statusMap.put(status.STR.name(), 2);
            statusMap.put(status.DEX.name(), 5);
            statusMap.put(status.INT.name(), 1);
            statusMap.put(status.CON.name(), 2);
            statusMap.put(status.BLS.name(), 0);
        }
    }


    //Á÷¾÷ ½ºÅÈ ¼³Á¤
    public void setJobsStatus(){
        //±â»ç ½ºÅÈ ¼³Á¤
        if (characterMap.get(Interactive.KEY_JOB).equals("KNIGHT")){
            statusMap.put(status.STR.name(), statusMap.get(status.STR.name()) + 5);
            statusMap.put(status.DEX.name(), statusMap.get(status.DEX.name()) + 5);
            statusMap.put(status.INT.name(), statusMap.get(status.INT.name()) + 5);
            statusMap.put(status.CON.name(), statusMap.get(status.CON.name()) + 5);
            statusMap.put(status.BLS.name(), statusMap.get(status.BLS.name()) + 5);
        }
        //µµÀû ½ºÅÈ ¼³Á¤
        else if(characterMap.get(Interactive.KEY_JOB).equals("THIEF")){
            statusMap.put(status.STR.name(), statusMap.get(status.STR.name()) + 5);
            statusMap.put(status.DEX.name(), statusMap.get(status.DEX.name()) + 5);
            statusMap.put(status.INT.name(), statusMap.get(status.INT.name()) + 5);
            statusMap.put(status.CON.name(), statusMap.get(status.CON.name()) + 5);
            statusMap.put(status.BLS.name(), statusMap.get(status.BLS.name()) + 5);
        }
        //¼öµµ»ç ½ºÅÈ ¼³Á¤
        else if(characterMap.get(Interactive.KEY_JOB).equals("MONK")){
            statusMap.put(status.STR.name(), statusMap.get(status.STR.name()) + 5);
            statusMap.put(status.DEX.name(), statusMap.get(status.DEX.name()) + 5);
            statusMap.put(status.INT.name(), statusMap.get(status.INT.name()) + 5);
            statusMap.put(status.CON.name(), statusMap.get(status.CON.name()) + 5);
            statusMap.put(status.BLS.name(), statusMap.get(status.BLS.name()) + 5);
        }
        //±Ã¼ö ½ºÅÈ ¼³Á¤
        else if(characterMap.get(Interactive.KEY_JOB).equals("ARCHER")){
            statusMap.put(status.STR.name(), statusMap.get(status.STR.name()) + 5);
            statusMap.put(status.DEX.name(), statusMap.get(status.DEX.name()) + 5);
            statusMap.put(status.INT.name(), statusMap.get(status.INT.name()) + 5);
            statusMap.put(status.CON.name(), statusMap.get(status.CON.name()) + 5);
            statusMap.put(status.BLS.name(), statusMap.get(status.BLS.name()) + 5);
        }
    }
}


