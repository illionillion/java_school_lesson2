package sec05;

/**
 * Section0507
 */
public class Section0507 {

    public static void main(String[] args) {
        System.out.println("三角形の面積："+calcTriangleArea(10.0, 5.0)+"cm^2");
        System.out.println("円の面積："+calcCircleArea(5.0)+"cm^2");
    }

    public static double calcTriangleArea(double bottom,double height) {
        return (bottom*height)/2;
    }

    public static double calcCircleArea(double radius) {
        return (radius*radius)*3.14;
    }
}