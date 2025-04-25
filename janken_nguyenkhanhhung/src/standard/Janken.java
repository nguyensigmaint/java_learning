package standard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Janken {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rd = new Random();
		String[] janken = { "グー", "チョキ", "パー" };
		System.out.println("【じゃんけん開始】");
		System.out.println();
		int playerWin = 0;
		int computerWin = 0;
		int playerChoice;
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "【回戦目】");
			System.out.println("プレイヤーの手を決めてください");
			System.out.println("(グー:0、チョキ:1、パー:2)");
			do {
				String tempPlayerChoice = br.readLine();
				playerChoice = Integer.parseInt(tempPlayerChoice);
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
					computerWin++;
				}
			}
		}
		System.out.println();
		System.out.println("【じゃんけん終了】");
		System.out.println();
		System.out.print(playerWin + "対" + computerWin + "で");
		if (playerWin > computerWin)
			System.out.print("プレイヤーの勝ちです。");
		else if (playerWin < computerWin)
			System.out.println("コンピューターの勝ちです。");
		else
			System.out.println("引き分けです。");
	}
}
