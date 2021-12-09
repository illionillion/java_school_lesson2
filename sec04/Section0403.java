package sec04;

/**
 * Section0403
 */
public class Section0403 {

    public static void main(String[] args) {
        System.out.println("10 + 20 = "+add(10, 20));
        System.out.println("10 + 20 + 30 = "+add(10, 20, 30));
    }
    // 1.引数の数が2つ（いずれもint）
    public static int add(int x,int y) {
        return x + y;
    }

    // 2.引数の数が3つ（いずれもint）
    public static int add(int x,int y,int z) {
        return x + y + z;
    }
}