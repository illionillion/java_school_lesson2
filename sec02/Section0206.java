package sec02;

/**
 * Section0206
 */
public class Section0206 {

    public static void main(String[] args) {
        add(100, 20); //100と20を渡してaddメソッドを呼び出す
        add(200, 50); //200と50を渡してaddメソッドを呼び出す
    }

    public static void add(int x,int y) {
        int ans= x + y;
        System.out.println(x + "+" + y +"=" + ans);
    }
}