package sec05;

import java.util.Scanner;

/**
 * Section0508
 */
public class Section05082 {

    public static void main(String[] args) {
        // int[] dat={10,20,30,40,50,60,70,80}; //データ
        // int x=50; //探索地
        System.out.print("配列を入力(,で区切る) > ");
        String[] datst=new Scanner(System.in).nextLine().split(","); //データ
        int[] dat=new int[datst.length];
        for (int i = 0; i < datst.length; i++) {
            dat[i]=Integer.parseInt(datst[i]);
        }
        // System.out.print("探索地を入力 > ");
        // int x=new Scanner(System.in).nextInt(); //探索地
        int x=Integer.parseInt(args[0]); //探索地
        int target=linerSearch(x, dat);

        if (target==-1) {
            System.out.println("見つかりませんでした");
        }else{
            System.out.println(x+"は"+target+"番目の添え字");
        }
    }

    public static int linerSearch(int x ,int[] dat) {
        
        int target=-1;
        for (int i = 0; i < dat.length; i++) {
            if (dat[i]==x) {
                target=i;
                break;
            }
        }
        return target;
    }
}