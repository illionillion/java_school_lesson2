package sec02;

import java.util.Scanner;

/**
 * Section0211
 */
public class Section0211 {

    public static void main(String[] args) {
        System.out.println("2進数に変換したい値を入力してください");
        int value=new Scanner(System.in).nextInt();
        radixConv(value);
    }

    public static void radixConv(int value) {
        
        int bin[] =new int[16]; //あまりほ保存する
        int n=0; //桁数

        // 割るのを繰り返して割り切れなくなるまで
        while (value>=2) {
            bin[n]=value%2;
            n++;
            value/=2;
        }

        // 割るのを繰り返した最終値を配列の最後(2進数の最初の値)に保存
        bin[n]=value;
        n++;

        // 逆順に出力
        for (int i = n-1; i >= 0; i--) {
            System.out.print(bin[i]);
        }

    }
}