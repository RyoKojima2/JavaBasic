package practice.practice16;

public class main {

	 public static void main(String[] args) {

		 Merchant merchant = new Merchant();    //マーチャントのインスタンスを呼び出す。

		 merchant.sellitem(50);                  //マーチャントの商品を売るメソッド
		                                         //を書き引数に商品の個数を書く。

		 System.out.println(merchant.confirmMoney());	//出力をする。

	 }
}
