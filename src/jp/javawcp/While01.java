package jp.javawcp;


public class While01 {

	public static void main(String[] args) {
		int num = 1;
		
		// while文：ループ開始
        // numが50未満の場合、ブロックの処理を行なう
		while(num < 50) {
			
			// ブロック：
            // numにnum * 2 を代入して、numberを出力
			num *= 2;
			System.out.println("while01= " + num);
		}
	}
}
