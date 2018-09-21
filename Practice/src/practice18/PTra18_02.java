/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;



public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		  // file/BestElevenCandidate.csv に記述された文字列を1行毎に line に代入します。
        ArrayList<Player> array = new ArrayList<>();


        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] a = line.split(",");
                
                Player player = new Player();
                
                player.setposition(a[0]);
                player.setName(a[1]);
                player.setcountry(a[2]);
                player.setteam(a[3]);
                
                
                array.add(player); 
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }



        for(Player num : array){
            System.out.println(num);
        }


		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */


		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう

	}
}
