package test03;

import java.time.Instant;

public class cytech03 {

	public static void main(String[] args) {
		// 設問3
		long epochSecond = Instant.now().getEpochSecond();
		
		System.out.println("1970年1月1日 00:00:00何秒経ったか。" + epochSecond);
		
		//if文
		if(epochSecond % 2 == 0) {
			System.out.println("偶数です。") ;
		}else {
			System.out.println("奇数です。");
		}

	}

}
