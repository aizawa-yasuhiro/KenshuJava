/*
	課題【２】
		String#trim() は文字列の前後から半角スペースを削除する関数だが、
		後ろは消さずに前のみ消し、全角スペースも削除する関数を作成する。
		・引数の文字列の左側のスペース（全角、半角とも）を消して返す。
		・標準出力はスペースの存在有無が判定できるように括弧（ 「」）で囲む。
		・String#toCharArray(), String#substring() などを利用。
*/
package kadai02;

public class LTrim {
	public static void main(String args[]) {
		
		// ■前処理
		// ・引数が無い場合はメッセージを表示して処理を終了する
		if(args.length == 0) {
			System.out.println("引数がありません。");
			return;
		}

		// ■主処理
		// 文字列編集を行い、結果を表示する
		System.out.println("「" + lTrim(args[0]) + "」");

	}


	/* 左側だけトリムを行う */
	private static String lTrim(String sTarget) {
		String sRet = "";				// 返し値
		int iPos = 0;					// 空白以外の最初の文字位置

		// 対象文字列を1文字ずつ配列に格納する
		char[] cTargetCharList = sTarget.toCharArray();

		
		// 空白以外の文字が現れる位置を調べる
		for(int i = 0; i < cTargetCharList.length; i++) {

			// 空白文字以外の場合、ループ回数から文字位置を取得し、ループを抜ける
			if(cTargetCharList[i] != ' ' && cTargetCharList[i] != '　' ) {
				iPos = i;
				break;
			}
		}


		// 位置が取得できた場合、対象文字列から取得した位置以降を切り出す
		if(iPos > 0) {
			sRet = sTarget.substring(iPos);
		}

		return sRet;
	}
	
}