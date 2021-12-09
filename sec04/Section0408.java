package sec04;

/**
 * Section0408
 */
public class Section0408 {

    public static void main(String[] args) {
        receive(10);

        receive(10.5);

        receive("100");
    }

    public static void receive(int x) {
        System.out.println(x+"を受け取りました");
    }

    public static void receive(double x) {
        System.out.println(x+"を受け取りました");
    }

    public static void receive(String x) {
        System.out.println(x+"を受け取りました");
    }
}