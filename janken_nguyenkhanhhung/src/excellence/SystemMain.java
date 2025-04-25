package excellence;


public class SystemMain {

	public static void main(String[] args) {
		System.out.println("【じゃんけん開始】");
		JankenJudge jankenJudge= new JankenJudge();
		Player player=new Player();
		
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "【回戦目】");
			System.out.println("プレイヤーの手を決めてください");
			System.out.println("(グー:0、チョキ:1、パー:2)");
			int computerChoice = player.computerChoiceHand();
			int playerChoice=player.playerHandInput();
			jankenJudge.checkJanken(playerChoice, computerChoice);
		}
		System.out.println("【じゃんけん終了】");
		jankenJudge.checkAllResult();
		
	}
}
