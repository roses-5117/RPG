package bases;
//②
public  abstract class Living {
		protected String name;
		protected String weapon;
		protected int hp;
		protected int offensive;
		
		//③				
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		public String getWeapon() {
			return weapon;
		}
		
		public void setWeapon(String weapon) {
			this.weapon=weapon;
		}
		
		public int getHp() {
			return hp;
		}
		
		public void setHp(int hp) {
			this.hp=hp;
		}
	
		public int getOffesive(int offensive) {
			return offensive;
		}
		
		public void setOffensive(int offensive) {
			this.offensive=offensive;
		}
		
		//④			
		public Living(String name,String weapon) {
			this.name=name;
			this.weapon=weapon;
		}
		
		//⑤	
		public abstract void attack(Living target);

		//⑥	
		@Override
		public String  toString() {
			String status="名前"+name+",武器"+ weapon + ", HP: " + hp + ", 攻撃力: " + offensive;
			if(hp<=50) {
				status +="※警告！HPが危険れべるです。";
			}
			return status;
		}
}
