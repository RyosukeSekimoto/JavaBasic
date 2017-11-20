package practice18.entity;

public class Player {
	//フィールド
	String position;
	String name;
	String country;
	String team;

	//コンストラクタ
	public Player(String position, String name, String country, String team) {
		this.position = position;
		this.name = name;
		this.country = country;
		this.team = team;
	}

	//getterメソッド
	public String getPosition() {
		return this.position;
	}
	public String getName() {
		return this.name;
	}
	public String getCountry() {
		return this.country;
	}
	public String getTeam() {
		return this.team;
	}

	//setterメソッド
	public void setPosition(String position) {
		this.position = position;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	//toStringメソッドのオーバーライド
	public String toString() {
		return this.position + "," + this.name + "," + this.country + "," + this.team;
	}
}
