/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_02 {

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

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		//csvファイルに含まれている選手ごとデータの数
		int index = 0;
		//選手ごとのデータ（1行分）を格納する配列を用意
		String[] fileRow = new String[65536];
		//Playerインスタンスを格納するArrayListを用意
		ArrayList<Player> playersList = new ArrayList<Player>();

		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

			//選手ごとのデータ（1行分）を格納
            while (scanner.hasNext()) {
            		fileRow[index] = scanner.nextLine();
            		index++;
            }

            //Player型の配列を選手分用意
            Player[] players = new Player[index];

            //Playerインスタンスを生み出して情報を格納
            for(int i = 0; i < index; i++) {
            		String[] rowArray = fileRow[i].split(",", 0);
            		players[i] = new Player(rowArray[0],rowArray[1],rowArray[2],rowArray[3]);
            }

            //Player型インスタンスをArrayList型のplayersListに格納
            for(Player player: players) {
            		playersList.add(player);
            }

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう
		for(Player player: playersList) {
			System.out.println(player.toString());
		}
	}
}
