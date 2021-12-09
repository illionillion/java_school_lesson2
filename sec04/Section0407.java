package sec04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Section0407
 */
public class Section0407 {

    public static void main(String[] args) {
        System.out.println("配列の総数を入力");
        int num=new Scanner(System.in).nextInt();

        // 配列作成
        int[] arr=makeArray(num);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] makeArray(int size) {

        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=i;
        }

        return arr;
    }
}