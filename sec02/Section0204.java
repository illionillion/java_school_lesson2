package sec02;

import java.util.Scanner;

/**
 * Section0204
 */
public class Section0204 {

    public static void main(String[] args) {
        System.out.println("設定したいHPを入力してください");
        int hp = new Scanner(System.in).nextInt();
        setHp(hp);

    }

    public static void setHp(int hp) {
        System.out.println("設定されたHPは"+hp+"です");
    }
}