package sec02;

import java.util.Scanner;

/**
 * Section0210
 */
public class Section0210 {

    public static void main(String[] args) {
        System.out.println("あなたの点数を入力してください");
        int score = new Scanner(System.in).nextInt();
        judgeGrade(score);
    }

    public static void judgeGrade(int score) {
        if (score>=90) {
            System.out.println(score+"はSです");
        } else if (score>=80 && score <90) {
            System.out.println(score+"はAです");
        } else if (score>=70 && score <80) {
            System.out.println(score+"はBです");
        } else if (score>=60 && score <70) {
            System.out.println(score+"はCです");
        } else if (score <60) {
            System.out.println(score+"はDです");
        } else {
            System.out.println("エラー");
        }
    }
}