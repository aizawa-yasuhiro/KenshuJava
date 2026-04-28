/*
	課題【４－２】
		kadai04.Shainクラスを呼び出すクラスを作成。
*/
package kadai04.call;

import kadai04.Shain;

public class CallShain {
	public static void main(String args[]) {
		
		Shain objShain;					// Shainクラスのオブジェクト


		// 引数が無い場合はメッセージを表示し、処理を終了する
		if(args.length == 0) {
			System.out.println("引数がありません。");
			return;
		}

		// 引数に応じて Shainクラスをインスタンス化してオブジェクトを生成する
		// ・引数が1つの場合（name）
		if(args.length == 1) {
			// shainNo無しでインスタンス化する
			objShain = new Shain(args[0], "");

		// ・引数が2つの場合（name, shainNo）
		} else if(args.length == 2) {
			// 引数2つでインスタンス化する
			objShain = new Shain(args[0], args[1]);

		// 引数が3つ以上の場合
		} else {

			try {
				// 第2引数（年齢）をint型に変換
				int age = Integer.parseInt(args[1]);
				// 引数3つ(name, age, shainNo)でインスタンス化する
				objShain = new Shain(args[0], age, args[2]);

			} catch(NumberFormatException ex) {
				System.out.println("第2引数(年齢)が数値ではありません。");
				return;

			} catch(IllegalArgumentException ex) {
				System.out.println("年齢が 20～65 ではありません。");
				return;
			}
		}
		
		// 自己紹介を表示する
		objShain.intro();

	}
}