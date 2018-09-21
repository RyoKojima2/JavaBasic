/*
 * PTra17_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

class Util {

public static void dispMessageSlowly(String message, long millisecond) {

	char[] array = message.toCharArray();

	for (int i = 0; i < message.length(); i++) {

		System.out.print(array[i]);


		try {
			Thread.sleep(millisecond);

		} catch (InterruptedException e) {
			/* エラーが発生した場合はここにくる */
		}
	}
  }
}

public class PTra17_04 {
	public static void main(String[] args) {

		String str = "スッキリわかるJava入門";

		Util.dispMessageSlowly(str, 1000);

		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
		 * ※ Thread.sleep を使用すること
		 */

	}
}
