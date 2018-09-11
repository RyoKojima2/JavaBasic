/*
 * PTra13_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Item;
import practice13.common.Slime;
import practice13.common.SuperHero;

public class PTra13_07 {

	/*
	 * ★ common.Item, common.SuperHero, common.Slimeを使用します
	 */

	public static void main(String[] args) {

		// ★ SuperHeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者（装備あり）", "スライム"を設定してください
		 SuperHero sphero = new  SuperHero();

		   sphero.setName("勇者（装備あり）");


		 Slime slime = new Slime();

		   slime.setName("スライム");

		// ★ Itemクラスのインスタンスを作成し、("こんぼう", 4）をコンストラクタの引数にしてください
         Item kitem = new Item();

           kitem.setName("こんぼう");
           kitem.setAdditionalDamage(4);


		// ★ 作成したItemインスタンスをSuperHeroに持たせてください
           sphero.setEquipment(kitem);

		/*
		 * ★ SuperHeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●SuperHeroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

           while(true){

           	System.out.println(sphero.getName() + "は、攻撃した！");

           	   if(slime.damage(sphero.attack())) {

           		   System.out.println(sphero.getName()+"は"+slime.getName()+"との戦闘に勝利した");
           	  break;
           	   }

           	System.out.println(slime.getName() + "は、攻撃した！");

           	   if(sphero.damage(slime.attack()))  {

           		   System.out.println(slime.getName()+"は"+sphero.getName()+"との戦闘に勝利した");

              break;
      }
    }
           
  }
}
