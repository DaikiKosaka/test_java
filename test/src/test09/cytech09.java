package test09;

public class cytech09 {

	public static void main(String[] args) {
		// 設問9
		int[][] kamoku = {
				{90, 80, 70},
				{60, 70, 80},
				{50, 75, 99},
				{45, 65, 85},
				{60, 80, 100}
		};
		
		String[] subject = {"国語", "数学", "理科", "社会"};
		
		for(int i = 0; i< kamoku.length; i++) {
			System.out.println((i+1) + "人目の点数");
			for(int a = 0; a <kamoku[i].length; a++) {
				System.out.println(subject[a] + "" + kamoku[i][a] + "点");
			}
			System.out.println();
		}
	}

}
