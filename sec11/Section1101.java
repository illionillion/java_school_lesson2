package sec11;

import java.util.Scanner;

/**
 * Section1101
 */
public class Section1101 {

    public static void main(String[] args) {
        System.out.print("正の整数を入力>");
        int num=new Scanner(System.in).nextInt();

        for(int i=1;i<=num;i++){
            if (num%i==0) {
                System.out.print(i+" ");
            }
        }
    }
}