import java.util.HashMap;

public class Status {

    Character character;
    HashMap<String, String> characterMap = Character.characterMap;
    HashMap<String, Integer> statusMap = new HashMap<String, Integer>();

    public int STR;
    public int DEX;
    public int INT;
    public int CON;
    public int BLS;
    public Status(){
        this.character = new Character();
    }

    public void setStatus(){
        setRaceStatus();
        setJobsStatus();
    }

    // ���� ���� ����
    public void setRaceStatus(){

    }


    //���� ���� ����
    public void setJobsStatus(){


    }

    //mac test
}


