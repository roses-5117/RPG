package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {

    public Brave(String name, String weapon) {
        super(name, weapon);

        this.hp = Dice.get(170, 230);         // 170〜230の間の乱数
        this.offensive = Dice.get(7, 13);     // 7〜13の間の乱数
    }
}
