package sec01;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Section0110
 */
public class Section0110 {

    public static void main(String[] args) {
        dispAdult();
    }

    public static void dispAdult() {
        System.out.println("あなたの年齢を入力してください");
        int age = new Scanner(System.in).nextInt();

        // InputStreamReader isr=new InputStreamReader(System.in);
        // BufferedReader br=new BufferedReader(isr);
        // int age=0;
        // try {
        //     age=br.read();
        //     br.close();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        if (age>=20) {
            System.out.println("成人です");
        } else {
            System.out.println("未成年です");
        }
    }
}