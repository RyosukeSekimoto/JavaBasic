package practice10;

public class Car {

	//ここからフィールド
	int serialNo;
	String color;
	int gasoline;
	int advance;

	//ここからメソッド
	public int run() {
		this.gasoline--;
		if(this.gasoline < 0) {
			return -1;
		}
		return 1;
	}
}
