package jp.javawcp;

public class Continue01 {
	public static void main(String[] args) {
		for (int count = 0; count < 5; count++) {
			
			// countが2の場合、この処理をスキップする
			if(count == 2) {
				continue;
			}
			System.out.println("Continue01= " + count);
		}
	}
}
