package sec03;

import java.util.Scanner;

/**
 * Section0305
 */
public class Section0305 {

    public static void main(String[] args) {
        System.out.println("値を入力してください");
        int value=new Scanner(System.in).nextInt();
        System.out.println("奇数判定は"+judgeOdd(value));
    }

    public static boolean judgeOdd(int value) {
        if (value%2==0) { //偶数
            return false;
        } else {          //奇数
            return true;
        }
    }
}