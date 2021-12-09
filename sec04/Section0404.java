package sec04;

/**
 * Section0404
 */
public class Section0404 {

    public static void main(String[] args) {
        System.out.println("10 - 20 ="+sub(10, 20)); //1のメソッド呼び出し

        System.out.println("3.5 - 2.7 ="+sub(3.5, 2.7)); //2のメソッド呼び出し

    }

    public static int sub(int x, int y) {
        return x-y;
    }

    public static double sub(double x, double y) {
        return x-y;
    }
}