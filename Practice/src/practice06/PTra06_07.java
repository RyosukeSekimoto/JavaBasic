package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 5; j++) {
				//iが5までの処理
				if(i <= 5) {
					if(j < i) {
						System.out.print("■");
					} else {
						System.out.print("□");
					}
				//iが5より大きいときの処理
				} else if(i > 5) {
					if(j < 10 - i) {
						System.out.print("■");
					} else {
						System.out.print("□");
					}
				}
			}
			System.out.println("");
		}
	}
}
