package sec02;

import java.util.Scanner;

/**
 * Section0208
 */
public class Section0208 {

    public static void main(String[] args) {
        System.out.println("数字を入力してください");
        int value=new Scanner(System.in).nextInt();
        dispSharp(value);
    }

    public static void dispSharp(int value) {

        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();            
        }

    }
}