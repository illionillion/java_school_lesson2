package sec06.section0607;

import java.util.Random;

/**
 * FightLogic
 */
public class FightLogic {

    public static int slimeAttack(int a) {
        return a-(new Random().nextInt(11));
    }

    public static int goblinAttack(int a) {
        return a-(new Random().nextInt(51));
    }

    public static int dragonAttack(int a) {
        return a-(new Random().nextInt(101));
    }
}