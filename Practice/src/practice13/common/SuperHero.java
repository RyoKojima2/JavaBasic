package practice13.common;

public class SuperHero extends practice13.common.Hero  {

	 private practice13.common.Item equipment;



	 public int attack(){
			return super.attack() + equipment.getAdditionalDamage();
		}




	 public practice13.common.Item getEquipment() {
			return equipment;
		}

		public void setEquipment(practice13.common.Item equipment) {
			this.equipment = equipment;
		}



}
/*
 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 *
 * フィールド
 * 		equipment	:	common.Item
 * メソッド
 * 		attackメソッドをオーバーライドし、
 * 		powerに加えて、additionalDamage分を加算した値としてください
 *
 * 		equipmentのアクセサ
 */