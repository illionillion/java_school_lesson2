package sec12;
import java.util.Scanner;
/**
 * Section1201
 */
public class Section1201 {

    public static void main(String[] args) {
        System.out.print("整数を入力してください>");
        int num=new Scanner(System.in).nextInt();
        int i=1;
        int count=0;
        while(true){
            if (i%2==1) {
                count++;
                if (i>num) {
                    System.out.println("20を初めて超えるのは"+count+"個目で"+i+"です");
                    break;
                }
                // System.out.print(i+" ");
            }
            i++;
        }
    }
}