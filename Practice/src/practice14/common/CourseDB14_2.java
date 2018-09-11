package practice14.common;

public class CourseDB14_2  implements practice14.common.Course{

	@Override
	public String getCourseName() {

		return "【Eラーニング】DB基礎";
	}

	@Override
	public String[] getCourseUnit() {

		String[] word2 = new String[4];

		word2[0] = "DB基礎";
		word2[1] = "SQL基礎";
		word2[2] = "正規化";
		word2[3] = "SQL応用";


		return word2;
	}

}
/*
 * ★ common.Courseを実装した、DBCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】DB基礎」
 * 単元
 * 		DB基礎
 * 		SQL基礎
 * 		正規化
 * 		SQL応用
 */