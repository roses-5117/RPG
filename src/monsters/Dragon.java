package monsters;

import java.util.Random;

import bases.Monster;

public class Dragon extends Monster {

    public Dragon(String name, String weapon) {
        super(name, weapon);
        
        Random rand = new Random();
        this.hp = rand.nextInt(61) + 270;       // 270〜330（=60+1）
        this.offensive = rand.nextInt(7) + 12;   // 12〜18（=6+1）
    }

}