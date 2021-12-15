package sec06;

/**
 * Section0602
 */
public class Section0602 {

    public static void main(String[] args) {
        int a=10;
        int b=2;
        int total=tasu(a, b);
        int delta=hiku(a, b);
        System.out.println("足すと"+total+"引くと"+delta);
    }

    /**
     * 
     * @param a 1つ目の整数
     * @param b 2つ目の整数
     * @return 足し算の結果
     */
    public static int tasu(int a, int b) {
        return (a+b);
    }
    /**
     * 
     * @param a 1つ目の整数
     * @param b 2つ目の整数
     * @return 引き算の結果
     */
    public static int hiku(int a,int b) {
        return (a-b);
    }
}