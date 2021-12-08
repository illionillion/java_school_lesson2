package sec02;

import java.util.Scanner;

/**
 * Section0209
 */
public class Section0209 {

    public static void main(String[] args) {
        System.out.println("表示したい段を入力してください");
        int value=new Scanner(System.in).nextInt();
        kuku(value);
    }

    public static void kuku(int value) {
        
        for (int i = 1; i <= 9; i++) {
            System.out.println(value+"*"+i+"="+(value*i));
        }

    }
}