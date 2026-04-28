package kadai06.call;

import kadai06.MyTimer;

/**
 *	課題【６】<br>
 *	String/StringBuilderの性能比較を行う
 *
 *	@Author	 Nishimoto
 *	@Version 1.0
*/
public class ResTimeSokutei{

	/**
	 *	起動メソッド<br>
	 *	MyTimerクラスを使用し、String/StringBuilderの性能比較を行う
	 *
	 *	@param args	引数（指定不要）
	*/
	public static void main(String args[]){

		final int N = 100000;

		// String で N個の「*」を連結して経過秒数を出力
		MyTimer myTimer1 = new MyTimer();
		String str1 = "";
		for (int i = 0; i < N; i++) {
			str1 = str1 + "*";
		}
		System.out.println("String:" + myTimer1.getPastTime() + "ミリ秒");
		
		// StringBuilder で N個の「*」を連結して経過秒数を出力
		MyTimer myTimer2 = new MyTimer();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append("*");
		}
		String str2 = sb.toString();			// StringBuilder の値を String型に変換
		System.out.println("StringBuilder:" + myTimer2.getPastTime() + "ミリ秒");

		// // 上記(str1,str2)で同じものができているかどうかの比較
		if (str1.equals(str2)) {
			System.out.println("String/StringBuilder Match");
		} else {
			System.out.println("String/StringBuilder UnMatch");
		}
	}
}