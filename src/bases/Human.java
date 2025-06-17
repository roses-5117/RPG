package bases;

//人間を表現する抽象クラス
public abstract class Human extends Living {

	// コンストラクタ
	public Human(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name,weapon);
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int dice = utils.Dice.get(1, 10);  // Diceクラスを利用
		int damage = this.offensive * dice;
		
		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp()-damage);
		
		// 自分の攻撃力を1だけ減ら
		if(this.offensive>0) {
			this.offensive--;
		}
		
		// コンソールにステータスを表示
		System.out.println("「" + this.name + "」が「" + this.weapon + "」で攻撃！「" + target.getName() + "」に" + damage + "のダメージを与えた。");
		System.out.println("しかし自分の攻撃力も1減少した");
	}
}
