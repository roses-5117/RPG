package humans;

import java.util.Random;

import bases.Human;

public class Fighter extends Human {

    public Fighter(String name, String weapon) {
        super(name, weapon);

        Random rand = new Random();
        this.hp = rand.nextInt(61) + 240;       // 240〜300（=60+1）
        this.offensive = rand.nextInt(7) + 17;   // 17〜23（=6+1）
    }
}
