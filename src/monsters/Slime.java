package monsters;

import java.util.Random;

import bases.Monster;

public class Slime extends Monster {

    public Slime(String name, String weapon) {
        super(name, weapon);
        
        Random rand = new Random();
        this.hp = rand.nextInt(61) + 70;       // 70〜130（=60+1）
        this.offensive = rand.nextInt(7) + 5;   // 5〜11（=6+1）
    }

}
