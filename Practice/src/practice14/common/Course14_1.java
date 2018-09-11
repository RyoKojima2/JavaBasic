package practice14.common;

public class Course14_1 implements practice14.common.Course{


	public String getCourseName() {

		return "「【Eラーニング】Java」";
	}


	public String[] getCourseUnit() {

		String[] word = new String[7];

		word[0] = "式と演算";
		word[1] = "制御構文";
		word[2] = "メソッド";
		word[3] = "配列";
		word[4] = "オブジェクト指向";
		word[5] = "継承";
		word[6] = "高度な継承";

		return word;
	}








}
/*
 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】Java」
 * 単元
 * 		式と演算
 * 		制御構文
 * 		メソッド
 * 		配列
 * 		オブジェクト指向
 * 		継承
 * 		高度な継承
 */