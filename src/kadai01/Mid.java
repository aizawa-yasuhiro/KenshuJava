/*
	課題【１】
		String#substring() と異なる意味の引数指定で同じように動作する関数を作成する。
		・文字列の中央取得（文字数指定）を行う。
		・引数は３つ（処理対象の文字列、開始桁（インデックスではなく何文字目）、取得する文字数）。
		・String#length(), String#substring() などを利用する。
*/
package kadai01;

public class Mid {
	public static void main(String args[]) {

		String sTaisho;					// 対象文字列
		int iStartPos;					// 開始桁
		int iMojisu;					// 文字数


		// ■前処理
		// ・引数が3つ存在しない場合はエラー
		if(args.length < 3) {
			System.out.println("引数が足りません。（対象文字列 開始桁 文字数）");
			return;
		}

		// ・引数の1つめ(対象文字列)を取得
		sTaisho = args[0];

		// ・引数の2つめ(開始桁)、3つめ(文字数)を数値変換して取得
		//	 数値以外の場合はエラー
		try {
			iStartPos = Integer.parseInt(args[1]);
		} catch(NumberFormatException ex) {
			System.out.println("第2引数(開始桁)が数値ではありません。");
			return;
		}

		try {
			iMojisu = Integer.parseInt(args[2]);
		} catch(NumberFormatException ex) {
			System.out.println("第3引数(文字数)が数値ではありません。");
			return;
		}

		// ・引数の2つ目(開始桁)が 0以下 または対象文字数を超える場合、エラー
		if(iStartPos <= 0 || iStartPos > sTaisho.length()){
			System.out.println("第2引数(開始桁)は、1 以上 " + sTaisho.length() + " 以下で入力してください。");
			return;
		}

		// ・引数の3つ目(文字数)が 0以下の場合、エラー
		if(iMojisu <= 0){
			System.out.println("第3引数(文字数)は、1 以上で入力してください。");
			return;
		}


		// ■主処理
		// 文字列編集を行い、結果を表示する
		System.out.println(mid(sTaisho, iStartPos, iMojisu));

	}


	/* 文字列編集を行う */
	private static String mid(String sTaisho, int iStartPos, int iMojisu) {

		String sRet;					// 処理結果


		// 終了位置(開始桁＋文字数)が、対象文字列の文字数未満の場合は、部分文字列を取得する
		if( (iStartPos + iMojisu) <= sTaisho.length() ) {
			sRet = sTaisho.substring(iStartPos - 1, iStartPos + iMojisu - 1);

		// 終了位置(開始桁＋文字数)が、文字列の文字数より大きい場合は、開始桁以降の全文字を取得する
		} else {
			 sRet =	 sTaisho.substring(iStartPos - 1);
		}

		return sRet;
	}

}
