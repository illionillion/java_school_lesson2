package sec02;

import java.util.Scanner;

/**
 * Section0207
 */
public class Section0207 {

    public static void main(String[] args) {
        System.out.println("名前を入力してください");
        String name = new Scanner(System.in).nextLine();
        System.out.println("年齢を入力してください");
        int age = new Scanner(System.in).nextInt();

        setProfile(name, age);
    }

    public static void setProfile(String name, int age) {
        System.out.println(name+"さんは"+age+"歳ですね");
    }
}