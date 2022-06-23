import java.util.HashMap;
import java.util.Scanner;

public class Character {

    public static Character character;
    Status status = new Status();
    HashMap<String, String> characterMap = new HashMap<String, String>();

    Scanner scanner = new Scanner(System.in);

    public enum Jobs{
        KNIGHT, THIEF, MONK, ARCHER
        }

    public enum Race{
        OAK, HUMAN, ELF, DWARF
    }

public void createCharacter(){
    System.out.println("캐릭터를 생성합니다.");
    selectRace();
    selectJobs();
    setStatus();
}

public void selectJobs(){
    System.out.println("직업을 선택해 주세요");
    System.out.println("1.기사 2.도적 3.수도승 4.궁수");
    int jobs = scanner.nextInt();
    switch (jobs) {
        case 1 -> {
            characterMap.put("jobs", Jobs.KNIGHT.name());
            System.out.println("당신의 직업은 기사입니다.\n");
        }
        case 2 -> {
            characterMap.put("jobs", Jobs.THIEF.name());
            System.out.println("당신의 직업은 도적입니다.\n");
        }
        case 3 -> {
            characterMap.put("jobs", Jobs.MONK.name());
            System.out.println("당신의 직업은 수도승입니다.\n");
        }
        case 4 -> {
            characterMap.put("jobs", Jobs.ARCHER.name());
            System.out.println("당신의 직업은 궁수입니다.\n");
        }
    }
}

public void selectRace(){
    System.out.println("종족을 선택해 주세요");
    System.out.println("1.오크 2.인간 3.엘프 4.드워프");
    int race = scanner.nextInt();
    switch (race) {
        case 1 -> {
            characterMap.put("race", Race.OAK.name());
            System.out.println("당신의 종족은 오크입니다.\n");
        }
        case 2 -> {
            characterMap.put("race", Race.HUMAN.name());
            System.out.println("당신의 종족은 인간 입니다.\n");
        }
        case 3 -> {
            characterMap.put("race", Race.ELF.name());
            System.out.println("당신의 종족은 엘프입니다.\n");
        }
        case 4 -> {
            characterMap.put("race", Race.DWARF.name());
            System.out.println("당신의 종족은 드워프입니다.\n");
        }
    }
}

    public HashMap<String, String> getCharacterMap() {
        return characterMap;
    }

    public void setStatus(){
        if (characterMap.get("race").equals("OAK")){
            System.out.println("test oak");
        }
    }
}
