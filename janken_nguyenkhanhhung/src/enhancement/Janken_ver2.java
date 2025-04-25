package enhancement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Janken_ver2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rd = new Random();
		String[] janken = { "グー", "チョキ", "パー" };
		System.out.println("【じゃんけん開始】");
		System.out.println();
		int playerWin = 0;
		int comuterWin = 0;
		int playerChoice = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "【回戦目】");
			System.out.println("プレイヤーの手を決めてください");
			System.out.println("(グー:0、チョキ:1、パー:2)");
			do {
				String tempPlayerChoice = null;
				try {
					tempPlayerChoice = br.readLine();
					playerChoice = Integer.parseInt(tempPlayerChoice);
				} catch (NumberFormatException | IOException c) {
					System.out.println("システムエラーが発生しました。");
					System.out.println("システムが終了です。");
					System.exit(0);
				}
				if (playerChoice < 0 || playerChoice > 2)
					System.out.println("0～2を選択してください");
			} while (playerChoice < 0 || playerChoice > 2);
			int computerChoice = rd.nextInt(3);
			if (playerChoice == computerChoice) {
				System.out.println(janken[playerChoice] + "対" + janken[computerChoice]);
				System.out.println("で引き分けです！");
			} else {
				if ((playerChoice == 0 && computerChoice == 1) || (playerChoice == 1 && computerChoice == 2)
						|| (playerChoice == 2 && computerChoice == 0)) {
					System.out.println(janken[playerChoice] + "対" + janken[computerChoice]);
					System.out.println("プレイヤーが勝ちました！");
					playerWin++;
				} else {
					System.out.println(janken[playerChoice] + "対" + janken[computerChoice]);
					System.out.println("コンピューターが勝ちました！");
					comuterWin++;
				}
			}
		}
		System.out.println();
		System.out.println("【じゃんけん終了】");
		System.out.println();
		System.out.print(playerWin + "対" + comuterWin + "で");
		if (playerWin > comuterWin)
			System.out.print("プレイヤーの勝ちです。");
		else if (playerWin < comuterWin)
			System.out.println("コンピューターの勝ちです。");
		else
			System.out.println("引き分けです。");
	}
}
