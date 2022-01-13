package sec11.section1105;

/**
 * Hero
 */
public class Hero {

    String name;
    int hp;

    public void sleep() {
        this.hp=100; //自分のhpフィールド
        System.out.println(this.name+"は、眠って回復した！");
    }
}