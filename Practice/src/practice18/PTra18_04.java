/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		//各ポジションごとのPlayerインスタンスを格納するArrayListを作成
		ArrayList<Player> GK_List = new ArrayList<Player>();
		ArrayList<Player> DF_List = new ArrayList<Player>();
		ArrayList<Player> MF_List = new ArrayList<Player>();
		ArrayList<Player> FW_List = new ArrayList<Player>();

		//各ポジションごとのPlayerインスタンスを格納
		for(Iterator<Player> it = playersList.iterator(); it.hasNext();) {

			Player p = it.next();
            String str = p.getPosition();

            if(str.equals("GK")) {
            	GK_List.add(p);
            }else if(str.equals("DF")){
            	DF_List.add(p);
            }else if(str.equals("MF")){
            	MF_List.add(p);
            }else if(str.equals("FW")){
            	FW_List.add(p);
            }
		}

		//各ポジションリストをランダムに並び替え
		Collections.shuffle(GK_List);
		Collections.shuffle(DF_List);
		Collections.shuffle(MF_List);
		Collections.shuffle(FW_List);

		//選手を出力
		System.out.println("GK1名");
		playerPrintln(GK_List, 1);

		System.out.println("DF4名");
		playerPrintln(DF_List, 4);

		System.out.println("MF4名");
		playerPrintln(MF_List, 4);

		System.out.println("FW2名");
		playerPrintln(FW_List, 2);
	}

	//選手出力メソッド
	public static void playerPrintln(ArrayList<Player> list, int num) {
		for(int i = 0; i < num; i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
