package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */


		Car[] cars = new Car[3];



		Car car1 = new Car();

		    car1.color = "Red";
		     car1.gasoline = 50;


        Car car2 = new Car();

		    car2.color = "Blue";
		     car2.gasoline = 40;


        Car car3 = new Car();

		    car3.color = "Yellow";
		     car3.gasoline = 70;



		 cars[0] = car1;

		 cars[1] = car2;

	     cars[2] = car3;

	     for(int n = 0; n < cars.length; n++) {
         cars[n].run();

		   System.out.println("目的地まで"+ n +"時間かかりました。" );
			System.out.println("残りのガソリンは"+  cars[n].gasoline + "ℓです。");


	     }
	}
}
