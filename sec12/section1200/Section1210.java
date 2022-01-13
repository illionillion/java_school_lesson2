package sec12.section1200;

/**
 * Section1210
 */
public class Section1210 {

    public static void main(String[] args) {
        Cleric C=new Cleric();
        C.name="ゆうと";
        
        C.selfAid();
        System.out.println(C.HP);
        System.out.println(C.MP);
        C.pray(10);
        System.out.println(C.HP);
        System.out.println(C.MP);

    }
}