/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

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


	        ArrayList<Player> GK = new ArrayList<>();

	        for(int i =0;i<array.size();i++){

	        	if(GK.size() >= 1) {
	        		break;
	        	}
	            if(array.get(i).getposition().equals("GK")) {

	            	GK.add(array.get(i));
	            }
	        }
	        Collections.shuffle(GK);

	        for(Player i : GK){
	            System.out.println(i);
	        }



	        ArrayList<Player> DF = new ArrayList<>();

	        for(int i =0;i<array.size();i++){

	        	if(DF.size() >= 4) {
	        		break;
	        	}

	        	if(array.get(i).getposition().equals("DF")) {

	            	DF.add(array.get(i));
	            }
	        }
	        Collections.shuffle(DF);

	        for(Player i : DF){
	            System.out.println(i);
	        }



	        ArrayList<Player> MF = new ArrayList<>();

	        for(int i =0;i<array.size();i++){

	        	if(MF.size() >= 4) {
	        		break;
	        	}

	        	if(array.get(i).getposition().equals("MF")) {

	            	MF.add(array.get(i));
	            }
	        }
	        Collections.shuffle(MF);

	        for(Player i : MF){
	            System.out.println(i);
	        }



	        ArrayList<Player> FW = new ArrayList<>();

	        for(int i =0;i<array.size();i++){

	        	if(FW.size() >= 2) {
	        		break;
	        	}

	        	if(array.get(i).getposition().equals("FW")) {

	            	FW.add(array.get(i));
	            }
	        }
	        Collections.shuffle(FW);

	        for(Player i : FW){
	            System.out.println(i);
	        }

	}
}
/*
 * ①
 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
 * ★ ArrayListを作成して、Playerインスタンスを格納してください
 */
// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください





//各ポジションのリスト作成→各ポジションごとにfor文処理とシャッフル（Collections.shuffle(list名);）してから出力
