package practice.practice16;

public class Merchant {                //クラス マーチャント

	final int price = 100;             //フィールド
	int stock = 100;
	int money = 0;



   void sellitem (int count) {         //商品を売るメソッド

	   this.stock -= count;

	   this.money += this.price*count;

   }

   String confirmMoney() {                        //売り上げの取得メソッド

	   return "売上は"+this.money+"円です。";
   }

}
