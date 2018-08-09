package practice07;
/*
 * PTra07_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_03 {
	public static void main(String[] args) {

		// ★ char型の配列keywordを定義し 「'平', '島', '沼', '山', '森'」 で初期化してください
          char[]keyword = {'平', '島', '沼', '山', '森'};
          char[]b       = {'森','山', '沼','島','平',};

		// ★ 配列keywordに格納されている値を後ろから順番に全て表示してください
         b = keyword;

         b[0] = '森';
         b[1] = '山';
         b[2] = '沼';
         b[3] = '島';
         b[4] = '平';
        	  System.out.println(keyword[0]);
        	  System.out.println(keyword[1]);
        	  System.out.println(keyword[2]);
        	  System.out.println(keyword[3]);
        	  System.out.println(keyword[4]);


	}
}
