package jp.javawcp;

public class Break01 {
	public static void main(String[] args) {
		for(int count = 0; count < 5; count++) {
			
			// countが2の場合、for文を終了する
			if (count == 2) {
				break;
			}
			System.out.println("Break01= " + count);
		}
	}
}
