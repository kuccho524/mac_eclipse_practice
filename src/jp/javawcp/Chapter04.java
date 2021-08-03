package jp.javawcp;

/*
 * 自分の名前を「String」型の変数に代入して出力
 * 好きな言葉を同じ変数に再代入して出力
 * ラッキーナンバーとして「int」型で宣言した定数を出力
 */

public class Chapter04 {
	public static void main(String[] args) {
		
		// 自分の名前を「String」型の変数に代入して出力し、ラッキーナンバーとして「int」型で定数を宣言
		String name = "Snorlax";
		final int number = 143;
		System.out.println(name);
		
		// 好きな言葉を同じ変数に再代入して出力
		name = "カビゴン";
		System.out.println(name);
		
		// 定数を出力
		System.out.println(number);
	}
}
