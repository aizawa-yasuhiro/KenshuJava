package kadai;

/*
	課題６
	金額を入れると、貨幣ごとの枚数を表示する。
	0枚の貨幣は表示しない。
	配列 {10000, 5000, 2000, 1000, 500, 100, 50, 10, 5, 1} を用意して実施する。
	上記配列の中身の値や数が変化しても、この配列以外は変更せずに対応できること。
	（配列内は 1以上であり、かつ、降順にソートされていることのみが前提）
	引数が無い場合はエラーとし、1円以上の数値以外の場合を考慮しない。
*/
public class Kadai06_Money {
	public static void main(String[] args) {

		int[] iKaheiList = {10000, 5000, 2000, 1000, 500, 100, 50, 10, 5, 1};	// 貨幣リスト

		int iPos = 0;		// 貨幣リストの現在位置(要素番号)
		int iMaisu;			// 枚数
		int iAmari;			// 余り
		int iKngk;			// 残金


		// 引数が無い場合はメッセージを表示し、処理を終了する
		if(args.length == 0) {
			System.out.println("引数がありません。");
			return;
		}

		// 引数を残金の初期値として設定する
		iKngk = Integer.parseInt(args[0]);

		// 残金が1円以上の間、ループする
		while(iKngk >= 1) {

			// 枚数と余りを計算する
			iMaisu = iKngk / iKaheiList[iPos];
			iAmari = iKngk % iKaheiList[iPos];

			// 枚数が 0でない場合、貨幣の種類と枚数を出力し、余りの金額を残金額に再設定する
			if(iMaisu > 0) {
				System.out.println(iKaheiList[iPos] + "円 --> " + iMaisu + "枚");
				iKngk = iAmari;
			}

			// 貨幣リストの現在位置を次の貨幣に移動する
			iPos++;
		}
	}
}