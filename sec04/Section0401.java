package sec04;

import java.util.Scanner;

/**
 * Section0401
 */
public class Section0401 {

    public static void main(String[] args) {
        int sum=0;
        int i=1;
        while (i<=10) {
            System.out.println(i+"人目の点数を入力してください");
            sum+=new Scanner(System.in).nextInt();
            i++;
        }
        System.out.println("平均は"+(sum/10));
    }
}