package jp.javawcp;

/*
 * プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
 * ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
 * 要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
 */

public class Chapter05 {
	public static void main(String[] args) {
		
		// プリミティブ型の「long」「double」「boolean」の変数に値を代入して出力
		long l = 1234567890L;
		double d = 0.125;
		boolean b = false;
		
		System.out.println(l);
		System.out.println(d);
		System.out.println(b);
		
		// ラッパークラスの「Float」「Integer」「Character」の変数に値を代入して出力
		Float f = 3.14f;
		Integer i = 96;
		Character c = '未';
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(c);
		
		// 要素数が5の「int」配列に値を代入して、インデックス番号が3の値を出力
		int [] numbers = {1, 25, 96, 143, 150 };
		System.out.println(numbers[3]);
	}
}
