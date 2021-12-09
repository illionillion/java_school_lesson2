package sec03;

import java.util.Scanner;

/**
 * Section0308
 */
public class Section0308 {

    public static void main(String[] args) {
        System.out.println("税込み金額を計算したい値段を入力してください");
        int price=calcTax(new Scanner(System.in).nextInt());
        System.out.println("税込み婚額は"+price+"です");
    }

    public static int calcTax(int price) {
        return (int)(price * 1.08);
    }
}