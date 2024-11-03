package test09;

public class Cytech09 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int score;
		String[] students = {"A", "B", "C", "D", "E"};
		String[] subjects = {"国語", "数学", "理科", "社会"};
		
		for(int i = 0; i < 1; i++) {
			for(String j : students) {
				for(String k : subjects) {
					score = (int)(Math.random() * 100);
					System.out.println(j + "さんの" + k + "の点数は" + score + "点です。");
				}
			}
		}
	}
}
