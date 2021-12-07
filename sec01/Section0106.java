package sec01;

import java.util.Scanner;

/**
 * Section0106
 */
public class Section0106 {

    public static void main(String[] args) {
        calcBMI();
    }

    public static void calcBMI() {
        System.out.println("体重を入力してください");
        double weight=new Scanner(System.in).nextDouble();

        System.out.println("身長をm単位で入力してください");
        double height=new Scanner(System.in).nextDouble();

        double bmi = weight/(height*height);
        System.out.println("あなたのBMIは"+bmi+"です。");
    }
}