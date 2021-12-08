package sec02;

import java.util.Scanner;

/**
 * Section0201
 */
public class Section0201 {

    public static void main(String[] args) {
        System.out.println("どこまでカウントアップするか入力してください");

        int num=new Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

}