package sec01;

import java.util.Scanner;

/**
 * Section0108
 */
public class Section0108 {

    public static void main(String[] args) {
        dispCalc();
    }

    public static void dispCalc() {
        System.out.println("A + Bを行います");
        System.out.println("Aの値は？");
        int numA=new Scanner(System.in).nextInt();
        System.out.println("Bの値は？");
        int numB=new Scanner(System.in).nextInt();

        int sum=numA+numB;

        System.out.println("A + B = "+sum);
        // System.out.println(numA + " + " + numB + " = "+sum);
    }
}