import java.util.Scanner;

public class Game {
Character character;
Menu menu;
//Interactive interactive;

    public Game(){
        this.menu = new Menu();
        this.character = new Character();
//        this.interactive = new Interactive();
    }

    public void start(){
        menu.mainMenu(); // 메인 메뉴 실행
    }
}
