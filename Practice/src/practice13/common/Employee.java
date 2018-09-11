package practice13.common;

public class Employee extends practice13.common.Person{

	 private String departmentNm;

	 private int departmentCnt;




	 public String getdepartmentNm() {
			return departmentNm;
		}
		public void setName(String departmentNm) {
			this.departmentNm = departmentNm;
		}



	public int departmentCnt() {
			return  departmentCnt;
		}
		public void departmentCnt(int departmentCnt) {
			this.departmentCnt = departmentCnt;
		}
		public void setPass(String string) {
			// TODO 自動生成されたメソッド・スタブ
			
		}
		public void setquater(String string) {
			// TODO 自動生成されたメソッド・スタブ
			
		}
		
}
/*
 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
 *
 * フィールド
 * 		departmentNm（部署名）		:	String
 * 		departmentCnt（部署人数）	:	int
 * メソッド
 * 		各フィールドのアクセサ
 */