package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_06 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

		//合計値とarrayの要素数の初期化
		double sum = 0;
		int scoreCount = 0;

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください
		for(int[]scores: array) {
			//スコアの数を足し上げて格納
			scoreCount += scores.length;
			//スコアを合計
			for(int i: scores) {
				sum += i;
			}
		}
		//平均値を計算
		double scoreAverage = sum / scoreCount;
		//コンソールへ出力
		System.out.println(scoreAverage);
	}
}
