import java.util.Scanner;

public class Game {
Character character = new Character();
Menu menu = new Menu();

Scanner scanner = new Scanner(System.in);
    public void start(){
        menu.mainMenu(); // 메인 메뉴 실행
        int menuNum = scanner.nextInt();
        switch (menuNum) {
            case 1 -> character.createCharacter();
            case 2 -> System.exit(0);
        }

    }
}
