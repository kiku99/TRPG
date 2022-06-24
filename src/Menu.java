import java.util.Scanner;

public class Menu {

    Scanner scanner;
    Interactive interactive;
    Status status;

    public Menu(){
        this.interactive = new Interactive();
        this.status = new Status();
        this.scanner = new Scanner(System.in);
    }

    public void mainMenu(){
        System.out.println("""
                -----------------------------------
                            메인 메뉴
                -----------------------------------""");
        System.out.println("1. 게임 시작 2. 게임 종료");

        int menuNum = scanner.nextInt();
        switch (menuNum){
            case 1 -> {
                interactive.createCharacter();
                status.setStatus();
            }
            case 2 -> System.exit(0);
        }

    }

}
