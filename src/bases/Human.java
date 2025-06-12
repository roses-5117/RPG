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
		int dice=(int)(Math.random()*10)+1;
		int damage=this.offensive*dice;
		
		// 相手のHPをダメージ値だけ減らす
		target.hp-=damage;
		
		// 自分の攻撃力を1だけ減らす
		if(this.offensive>0) {
			this.offensive--;
		}
		// コンソールにステータスを表示
		System.out.println(this.name + "が" + target.name + "を攻撃した！");
		System.out.println("サイコロの目: " + dice);
		System.out.println("与えたダメージ: " + damage);
		System.out.println(target.name + "の残りHP: " + target.hp);
		System.out.println(this.name + "の攻撃力: " + this.offensive);

	}
}