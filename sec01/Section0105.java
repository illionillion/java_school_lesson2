package sec01;

import java.util.Scanner;

/**
 * Section0105
 */
public class Section0105 {

    public static void main(String[] args) {
       dispName(); // dispNameメソッドの呼び出し
    }

    public static void dispName() {
        System.out.println("お名前は？");
        String name = new Scanner(System.in).nextLine();
        System.out.println(name+"さん、こんにちは");
    }
}