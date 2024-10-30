package test04;

import java.time.Instant;

public class Cytech04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long date = Instant.now().getEpochSecond();
		
		switch((int)date % 2) {
		case 0:
			System.out.println("偶数です");
			break;
			
		default:
			System.out.println("奇数です");
			break;
		}

	}

}
