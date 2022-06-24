import java.util.Scanner;

public class Game {
Character character;
Menu menu;
Status status;
//Interactive interactive;

    public Game(){
        this.menu = new Menu();
        this.character = new Character();
        this.status = new Status();
//        this.interactive = new Interactive();
    }

    public void start(){
        menu.mainMenu(); // 메인 메뉴 실행
        status.setStatus();
    }
}
