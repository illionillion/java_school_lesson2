package sec01;

import java.util.Scanner;

/**
 * Section0101
 */
public class Section0101 {

    public static void main(String[] args) {
        System.out.print("あなたの名前を入力してください>");
        String name=new Scanner(System.in).nextLine();
        System.out.println();

        System.out.println("こんにちは、"+name+"さん");
    }
}