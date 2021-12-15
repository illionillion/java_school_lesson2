package sec06;

import java.util.Scanner;

/**
 * Section0601
 */
public class Section0601 {

    public static void main(String[] args) {
        int numA,numB;
        while (true) {
            System.out.println("加算を開始する整数を入力してください");
            numA=new Scanner(System.in).nextInt();    
            System.out.println("加算を終了する整数を入力してください");
            numB=new Scanner(System.in).nextInt();
            
            if(numA<=numB){
                break;
            }
        }


        

        int sum=0;

        for (int i = numA; i <= numB; i++) {
            sum+=i;
        }

        System.out.println("合計結果："+sum);
    }


}