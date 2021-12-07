package sec01;

import java.util.Scanner;

/**
 * Section0109
 */
public class Section0109 {

    public static void main(String[] args) {
        dispAccount();
    }

    public static void dispAccount() {
        System.out.println("あなたの名前を入力してください");
        String name=new Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        int age=new Scanner(System.in).nextInt();

        System.out.println(name+"さんは、"+age+"歳ですね");
    }
}