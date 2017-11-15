package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		//Car型の変数が3つ入る配列carsを宣言・確保
		Car[] cars = new Car[3];
		//配列carsの各要素にインスタンスを代入
		for(int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
		}

		//3つのインスタンスのフィールドを操作
		cars[0].color = "red";
		cars[0].gasoline = 50;
		cars[1].color = "green";
		cars[1].gasoline = 30;
		cars[2].color = "blue";
		cars[2].gasoline = 10;

		// 目的地までの距離
		final int distance = 300;

		// 各車の色とガソリンの表示
		for(int i = 0; i < cars.length; i++) {
			System.out.println((i + 1) + "台目の車の色とガソリン");
			System.out.println("色：" + cars[i].color);
			System.out.println("ガソリン：" + cars[i].gasoline);
			System.out.println("");
		}

		//３つの車が目的地へと進むコード
		for(int i = 0; i < cars.length; i++) {

			// 経過時間の初期化
			int hour = 0;
			// 移動距離の初期化
			int advance = 0;

			//目的地に到着もしくはガソリンが無くなるまで繰り返す
			while(true) {
				//時間経過を記録
				hour++;
				//runメソッドの実行
				int result = cars[i].run();
				//ガソリンが残っているとき実行
				if(result == 1) {
					advance += new java.util.Random().nextInt(15) + 1;
					if(advance > distance) {
						System.out.println((i + 1) + "台目の結果");
						System.out.println("目的地にまで" + hour + "時間かかりました。残りのガソリンは、" + cars[i].gasoline + "リットルです");
						System.out.println("");
						break;
					}
				//ガソリンが無くなったとき実行
				} else if(result == -1) {
					System.out.println((i + 1) + "台目の結果");
					System.out.println("目的地に到達できませんでした");
					System.out.println("");
					break;
				}
			}

		}


	}
}
