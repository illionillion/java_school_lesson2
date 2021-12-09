package sec03;

import java.util.Scanner;

/**
 * Section0301
 */
public class Section0301 {

    public static void main(String[] args) {
        
        int[] points={10,20,30,40,50,60,70,80,90,100};

        System.out.println("合格点を入力してください");
        int goukaku=new Scanner(System.in).nextInt();

        int count=0;

        for (int i = 0; i < points.length; i++) {
            if (points[i]>=goukaku) {
                count++;
            }
        }

        System.out.println("合格者は"+count);
        
    }
}