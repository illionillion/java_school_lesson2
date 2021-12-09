package sec03;

import java.util.Scanner;

/**
 * Section0310
 */
public class Section0310 {

    public static void main(String[] args) {
        System.out.println("xの値を入力してください");
        int x=new Scanner(System.in).nextInt();
        System.out.println("yの値を入力してください");
        int y=new Scanner(System.in).nextInt();
        System.out.println("zの値を入力してください");
        int z=new Scanner(System.in).nextInt();

        int min=judgeMin(x, y, z);

        System.out.println("最小値は"+min+"です");
    }

    public static int judgeMin(int x,int y,int z) {
        int value = Math.min(x, y);
        value=Math.min(value, z);
        return value;
    }
}