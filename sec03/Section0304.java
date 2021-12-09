package sec03;

import java.util.Scanner;

/**
 * Section0304
 */
public class Section0304 {

    public static void main(String[] args) {
        System.out.println("xの値を入力してください");
        int x=new Scanner(System.in).nextInt();
        System.out.println("yの値を入力してください");
        int y=new Scanner(System.in).nextInt();

        System.out.println(x+"-"+ y + "=" + sub(x, y));
    }

    public static int sub(int x, int y) {        
        return x-y;
    }
}