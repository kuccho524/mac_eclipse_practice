package jp.javawcp;

public class Recursive01 {
	public static void main(String[] args) {
		int number = 1;
		
		// printNumメソッドを呼び出す
		printNum(number);
	}
	
	// printNumメソッドを定義
	public static int printNum(int number) {
		if(number < 50) {
			number *= 2;
			System.out.println("While01= " + number);
			
			// 条件にマッチしたら自分自身を呼び出す
			printNum(number);
		}
		
		// 変数numberを返す
		return number;
	}
}
