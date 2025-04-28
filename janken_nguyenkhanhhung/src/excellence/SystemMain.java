package excellence;

public class SystemMain {

	public static void main(String[] args) {
		System.out.println("【じゃんけん開始】");
		JankenJudge jankenJudge = new JankenJudge();
		Player player = new Player();
		System.out.println("じゃんけんの回数を入力してください");
		int jankenOfNumbers = player.choiceNumbersOfJanken();
		int jankenHistory[][] = new int[jankenOfNumbers][2];

		for (int i = 1; i <= jankenOfNumbers; i++) {
			System.out.println("【" + i + "回戦目】");
			System.out.println("プレイヤーの手を決めてください");
			System.out.println("(グー:0、チョキ:1、パー:2)");
			jankenJudge.checkJanken(player.computerChoiceHand(jankenHistory,i), player.playerHandInput());
			jankenHistory[i][0]=player.playerHandInput();
			jankenHistory[i][1]=player.computerChoiceHand(jankenHistory,i);
		}
		System.out.println("【じゃんけん終了】");
		jankenJudge.checkAllResult();

	}
}
