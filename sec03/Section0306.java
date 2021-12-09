package sec03;

/**
 * Section0306
 */
public class Section0306 {

    public static void main(String[] args) {
        System.out.println(add(add(30, 50),add(30, 40)));        
    }

    public static int add(int x,int y) {
        int ans=x+y;
        return ans;
    }
}