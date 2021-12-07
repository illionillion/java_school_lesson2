package sec01;

import java.util.Scanner;

/**
 * Section0107
 */
public class Section0107 {

    public static void main(String[] args) {
        dispAddress();
    }

    public static void dispAddress() {
        System.out.println("メールアドレスを入力してください");
        String mail=new Scanner(System.in).nextLine();
        System.out.println(mail+"で合っていますか？");
    }
}