package sec06.section0607;

// import sec06.section0607.FightLogic;
/**
 * Fight
 */
public class Fight {

    public static void main(String[] args) {
        int hp=100;

        hp=FightLogic.slimeAttack(hp);
        System.out.println("スライムの攻撃を受けた！　残HP"+hp);
        if (hp<0) {
            System.out.println("GAME OVER");
            return;
        }
        hp=FightLogic.goblinAttack(hp);
        System.out.println("ゴブリンの攻撃を受けた！　残HP"+hp);
        if (hp<0) {
            System.out.println("GAME OVER");
            return;
        }
        hp=FightLogic.dragonAttack(hp);
        System.out.println("ドラゴンの攻撃を受けた！　残HP"+hp);
        if (hp<0) {
            System.out.println("GAME OVER");
            return;
        }

        System.out.println("残HP"+hp);
    }
}