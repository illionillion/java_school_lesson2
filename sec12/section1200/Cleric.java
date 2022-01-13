package sec12.section1200;

import java.util.Random;

/**
 * Cleric
 */
public class Cleric {

    String name;
    int HP=50;
    final int MAXHP=50;
    int MP=10;
    final int MAXMP=10;

    public void selfAid() {
        System.out.println(this.name+"はセルフエイドを唱えた！");
        this.HP=this.MAXHP;
        this.MP-=5;
        System.out.println("HPが最大まで回復した");
    }

    public int pray(int sec) {
        
        System.out.println(this.name+"は"+sec+"秒間天に祈った！");

        int recover=new Random().nextInt(3)+sec;

        int recoverActual=Math.min(this.MAXHP-this.MP, recover);

        this.MP+=recoverActual;
        System.out.println("MPが"+recoverActual+"回復した");
        return recoverActual;

    }


}