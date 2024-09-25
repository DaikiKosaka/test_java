package test04;

import java.time.Instant;

public class cytech04 {

	public static void main(String[] args) {
		// 設問4
		long epochSecond = Instant.now().getEpochSecond();
		
		System.out.println("1970年1月1日 00:00:00現在まで何秒経ったか" + epochSecond);
		
		int henkan =(int) (epochSecond % 2);
		
		switch(henkan) {
			case 0:
				System.out.println("偶数です。");
				break;
			case 1:
				System.out.println("奇数です。");
				break;
		}

	}

}
