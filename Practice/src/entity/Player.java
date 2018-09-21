package entity;

public class Player {

	private String position;
	String name;
	String country;
	String team;

	 public String getposition() {

	 return getPosition();
	}
	 public void setposition(String position) {

	 this.setPosition(position);
	}


	 public String getName() {

	 return getPosition();
	}
	 public void setName(String name) {

	 this.name = name;
	}


	 public String getcountry() {

	 return country;
	}
	 public void setcountry(String country) {

	 this.country = country;
	}


	 public String getteam() {

	 return team;
	}
	 public void setteam(String team) {

	 this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}


	public String toString() {

		return position +","+ name +","+ country  +","+ team;
	}

}


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