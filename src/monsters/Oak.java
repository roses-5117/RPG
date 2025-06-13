package monsters;

import java.util.Random;

import bases.Monster;

public class Oak extends Monster {

    public Oak(String name, String weapon) {
        super(name, weapon);
        
        Random rand = new Random();
        this.hp = rand.nextInt(61) + 170;       // 170〜230（=60+1）
        this.offensive = rand.nextInt(7) + 9;   // 9〜15（=6+1）
    }

}
