package kadai;

/*
	課題７
	第１引数の年～第２引数の年の、うるう年の回数を出力する。
	引数が足りない場合はエラーとし、数値以外の場合を考慮しない。
	引数が「1 ≦ 第１引数 ≦ 第２引数」でない場合はエラーメッセージを表示する。
	うるう年の定義は下記の通りとする。
		・年が 4 で割り切れる年はうるう年とする
		・ただし、年が 100 で割り切れる年はうるう年から除く
		・ただし、年が 400 で割り切れる年はうるう年とする
	上記のうるう年判定をメソッドとする（引数は年、戻り値は、うるう年か否か）
*/
public class Kadai07_Biss {
	public static void main(String[] args) {

		int iYearFrom;				// 開始年
		int iYearTo;				// 終了年
		int iBissCnt = 0;			// 開始年～終了年の間のうるう年の件数


		// 引数が足りない場合はメッセージを表示し、処理を終了する
		if(args.length < 2) {
			System.out.println("引数が足りません。");
			return;
		}

		// 引数を数値に変換して取得する
		iYearFrom = Integer.parseInt(args[0]);
		iYearTo = Integer.parseInt(args[1]);

		// 1 ≦ 第1引数 ≦ 第2引数 でない場合、エラーとする
		if( iYearFrom >= 1 && iYearFrom <= iYearTo ) {
		} else {
			System.out.println("引数の大小が不正です。");
			return;
		}


		// 開始年～終了年をループし、
		// うるう年判定して、うるう年であればうるう年の件数をカウントアップする
		for(int i = iYearFrom; i <= iYearTo ; i++ ) {
			if(isBiss(i)) {
				iBissCnt ++;
			}
		}

		// うるう年の件数を表示する
		System.out.println(iBissCnt + "回");

	}


	/* うるう年の判定（引数は年、戻り値は、うるう年か否か） */
	public static boolean isBiss(int iYear) {

		boolean bBissFlg = false;	// うるう年フラグ


		// 4 で割り切れる場合、うるう年である
		if( (iYear % 4) == 0 ) {
			bBissFlg = true;
		}

		// 100で割り切れる場合、うるう年ではない
		if( (iYear % 100) == 0 ) {
			bBissFlg = false;
		}

		
		// 400で割り切れる場合、うるう年である
		if( (iYear % 400) == 0 ) {
			bBissFlg = true;
		}


		// 結果を返す
		return bBissFlg;
	}
}