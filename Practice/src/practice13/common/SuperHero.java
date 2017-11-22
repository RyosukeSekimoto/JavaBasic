package practice13.common;

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

public class SuperHero extends Hero {

	//コンストラクタ
	public SuperHero() {
		super();
	}

	//フィールド
	private Item equipment;

	//メソッド
	public int attack() {
		return super.attack() + this.equipment.getAdditionalDamage();
	}

	//アクセサ
	public Item getEquipment() {
		return this.equipment;
	}

	public void setEquipment(Item item) {
		this.equipment = item;
	}

}
