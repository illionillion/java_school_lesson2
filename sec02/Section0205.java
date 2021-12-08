package sec02;

import java.util.Scanner;

/**
 * Section0205
 */
public class Section0205 {

    public static void main(String[] args) {
        System.out.println("カウントダウンをします\n値を入力してください");
        int count = new Scanner(System.in).nextInt();
        countDown(count);
    }

    public static void countDown(int count) {
        for (int i = count; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("start!");
    }
}