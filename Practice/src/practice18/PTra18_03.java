/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
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

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
		String str1 = "レアル・マドリード";
		String str2 = "バルセロナ";

        for(Iterator<Player> i = playersList.iterator(); i.hasNext();){
            String str = i.next().getTeam();
            // "レアル・マドリード"または"バルセロナ"なら除外
            if(str.equals(str1) || str.equals(str2)){
                i.remove();
            }
        }

		// ★ 削除後のArrayListの中身を全件出力してください
		for(Player player: playersList) {
			System.out.println(player.toString());
		}

	}
}
