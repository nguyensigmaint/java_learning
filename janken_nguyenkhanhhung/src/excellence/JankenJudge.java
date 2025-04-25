package excellence;

public class JankenJudge {
	private int playerHand;
	private int computerHand;
	private int playerWin = 0;
	private int computerWin = 0;
	private String[] janken = { "グー", "チョキ", "パー" };

	public JankenJudge() {
	}

	public void checkJanken(int playerChoice, int computerChoice) {
		if (playerChoice == computerChoice) {
			System.out.println(janken[playerChoice] + "対" + janken[computerChoice]);
			System.out.println("引き分けです！");
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

	public void checkAllResult() {
		System.out.print(playerWin + "対" + computerWin + "で");
		if (playerWin > computerWin)
			System.out.print("プレイヤーの勝ちです。");
		else if (playerWin < computerWin)
			System.out.println("コンピューターの勝ちです。");
		else
			System.out.println("引き分けです。");
	}

	public int getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(int playerHand) {
		this.playerHand = playerHand;
	}

	public int getComputerHand() {
		return computerHand;
	}

	public void setComputerHand(int computerHand) {
		this.computerHand = computerHand;
	}

}
