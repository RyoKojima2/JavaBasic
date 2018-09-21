/*
 * PTra18_03.java
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

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {


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

	        ArrayList<Player> del = new ArrayList<>();

	        for(Player num : array){
	            if(num.getteam().equals("レアル・マドリード") || num.getteam().equals("バルセロナ")) {

	            	del.add(num);
	            }
	        }

           

	        for(Player num : array){
	            System.out.println(num);
	        }

	}
}
/*
 * ①
 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
 * ★ ArrayListを作成して、Playerインスタンスを格納してください
 */


// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください


// ★ 削除後のArrayListの中身を全件出力してください

