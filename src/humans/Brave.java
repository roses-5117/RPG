package humans;

import java.util.Random;

import bases.Human;

public class Brave extends Human {

    public Brave(String name, String weapon) {
        super(name, weapon);

        Random rand = new Random();
        this.hp = rand.nextInt(61) + 170;       // 170〜230（=60+1）
        this.offensive = rand.nextInt(7) + 7;   // 7〜13（=6+1）
    }
}
