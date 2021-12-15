package sec05;

import java.util.Scanner;

/**
 * Section0504
 */
public class Section0504 {

    public static void main(String[] args) {
        introduceOneself();
    }

    public static void introduceOneself() {
        System.out.print("名前を入力 > ");
        String name=new Scanner(System.in).nextLine();
        System.out.print("年齢を入力 > ");
        int age=new Scanner(System.in).nextInt();
        System.out.print("身長を入力 > ");
        double height=new Scanner(System.in).nextDouble();
        System.out.print("十二支を入力 > ");
        char eto=new Scanner(System.in).nextLine().charAt(0);
        System.out.println();
        System.out.println("自己紹介");
        System.out.println("名前："+name+"さん");
        System.out.println("年齢："+age+"歳");
        System.out.println("身長："+height+"cm");
        System.out.println("十二支："+eto);
    }
}