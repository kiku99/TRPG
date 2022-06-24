import java.util.Scanner;

public class Game {
Character character;
Menu menu;
//Interactive interactive;
Scanner scanner;

    public Game(){
        this.menu = new Menu();
        this.character = new Character();
//        this.interactive = new Interactive();
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        menu.mainMenu(); // 메인 메뉴 실행
    }
}
