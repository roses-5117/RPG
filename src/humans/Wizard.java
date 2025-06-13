package humans;

import java.util.Random;

import bases.Human;

public class Wizard extends Human {

    public Wizard(String name, String weapon) {
        super(name, weapon);

        Random rand = new Random();
        this.hp = rand.nextInt(61) + 120;       // 120〜180（=60+1）
        this.offensive = rand.nextInt(7) + 12;   // 12〜18（=6+1）
    }
}