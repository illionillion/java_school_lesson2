package sec05;

import java.util.Scanner;

/**
 * Section0501
 */
public class Section0501 {

    public static void main(String[] args) {
        System.out.println("いくつ#を表示したいですか");
        int num=new Scanner(System.in).nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("#");
        }
    }
}