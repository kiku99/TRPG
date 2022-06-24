import java.util.Scanner;

public class Interactive {

    Character character;
    Scanner scanner;
    public static final String KEY_JOB = "jobs";
    public static final String KEY_RACE = "race";


    public Interactive(){
        character = new Character();
        scanner = new Scanner(System.in);
    }

    public void createCharacter(){
        selectRace();
        selectJobs();
    }

    public void selectJobs(){
        System.out.println("직업을 선택해 주세요");
        System.out.println("1.기사 2.도적 3.수도승 4.궁수");
        int jobs = scanner.nextInt();
        switch (jobs) {
            case 1 -> {
                Character.characterMap.put(KEY_JOB, Character.Jobs.KNIGHT.name());
                System.out.println("당신의 직업은 기사입니다.\n");

            }
            case 2 -> {
                Character.characterMap.put(KEY_JOB, Character.Jobs.THIEF.name());
                System.out.println("당신의 직업은 도적입니다.\n");
            }
            case 3 -> {
                Character.characterMap.put(KEY_JOB, Character.Jobs.MONK.name());
                System.out.println("당신의 직업은 수도승입니다.\n");
            }
            case 4 -> {
                Character.characterMap.put(KEY_JOB, Character.Jobs.ARCHER.name());
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
                Character.characterMap.put("race", Character.Race.OAK.name());
                System.out.println("당신의 종족은 오크입니다.\n");
            }
            case 2 -> {
                Character.characterMap.put("race", Character.Race.HUMAN.name());
                System.out.println("당신의 종족은 인간 입니다.\n");
            }
            case 3 -> {
                Character.characterMap.put("race", Character.Race.ELF.name());
                System.out.println("당신의 종족은 엘프입니다.\n");
            }
            case 4 -> {
                Character.characterMap.put("race", Character.Race.DWARF.name());
                System.out.println("당신의 종족은 드워프입니다.\n");
            }
        }
    }
}
