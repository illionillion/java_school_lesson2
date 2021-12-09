package sec03;

import java.util.Scanner;

/**
 * Section0309
 */
public class Section0309 {

    public static void main(String[] args) {
        System.out.println("2乗したい値を入力してください");
        int value=calcPow(new Scanner(System.in).nextInt());
        System.out.println("2乗した値は"+value);
    }

    public static int calcPow(int value) {
        return value*value;
    }
}