package sec04;

/**
 * Section0402
 */
public class Section0402 {

    public static void main(String[] args) {
    
        // 1のメソッド呼び出し
        System.out.println(add(10, 20));
        // 2のメソッド呼び出し
        System.out.println(add(3.5, 2.7));
        // 3のメソッド呼び出し
        System.out.println(add("Hello","wWorld"));
    }

    // 1.引数がint型のメソッド
    public static int add(int x,int y) {
        return x + y;
    }
    
    // 2.引数がint型のメソッド
    public static double add(double x,double y) {
        return x + y;
    }

    // 3.引数がint型のメソッド
    public static String add(String x,String y) {
        return x + y;
    }

}