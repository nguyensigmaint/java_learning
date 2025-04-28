package excellence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Player {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Random rd = new Random();

	public Player() {

	}

	public int playerHandInput() {
		int playerChoice = 0;
		do {
			String tempPlayerChoice;
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
		return playerChoice;
	}

	public int computerChoiceHand(int[][] history, int i) {
		int computerChoiceHand;
		int randomStrategy = rd.nextInt(3);
		//プレイヤーの手を真似する
		if (randomStrategy == 0) {
			if (i > 0) {
				computerChoiceHand = history[i - 1][0];
			} else {
				computerChoiceHand = rd.nextInt(3);
			}
		}
		//同じ手を出さない
		else if (randomStrategy == 1) {
			if (i > 0) {
				do {
					computerChoiceHand = rd.nextInt(3);
				} while (computerChoiceHand == history[i - 1][1]);
			} else {
				computerChoiceHand = rd.nextInt(3);
			}
		} 
		//random
		else {
			computerChoiceHand = rd.nextInt(3);
		}
		return computerChoiceHand;
	}

	public int choiceNumbersOfJanken() {
		int numbersOfJanken = 0;
		do {
			String tempNumbersOfChoice;
			try {
				tempNumbersOfChoice = br.readLine();
				numbersOfJanken = Integer.parseInt(tempNumbersOfChoice);
			} catch (NumberFormatException | IOException c) {
				System.out.println("システムエラーが発生しました。");
				System.out.println("システムが終了です。");
				System.exit(0);
			}
			if (numbersOfJanken < 1) {
				System.out.println("回数をもう一度入力してください");
			}
		} while (numbersOfJanken < 1);
		return numbersOfJanken;
	}

}
