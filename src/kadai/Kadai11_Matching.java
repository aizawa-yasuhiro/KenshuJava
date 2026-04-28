package kadai;

/*
	課題１１
	配列Ａ {1, 2, 4, 6, 8, 10}（配列の中はすでにソートされている）
	配列Ｂ {1, 3, 4, 5, 6, 7, 9, 10}（配列の中はすでにソートされている）
	に対し、各値がどちらにあるかを表示する。
	ループは１度（順方向）のみ使用し、配列の要素は +1 や -1 して参照不可とする。
*/
public class Kadai11_Matching {
	public static void main(String[] args) {

		int[] arrayA = {1, 2, 4, 6, 8, 10};				// 配列A
		int[] arrayB = {1, 3, 4, 5, 6, 7, 9, 10};		// 配列B
		int iPosA = 0;									// 配列Aの要素番号の現在位置
		int iPosB = 0;									// 配列Bの要素番号の現在位置
		int iKeyA;										// 配列Aのマッチングキー
		int iKeyB;										// 配列Bのマッチングキー
		int iHighValue = 999;							// HIGH_VALUE


		// 配列A,配列Bの中身を全て調べ終わるまでループ
		while((iPosA != arrayA.length) || (iPosB != arrayB.length)) {

			// 配列A・Bのマッチングキーを取得する
			// 最後まで処理済の場合はHIGH_VALUEを設定する
			if(iPosA != arrayA.length){
				iKeyA = arrayA[iPosA];
			} else {
				iKeyA = iHighValue;
			}
				
			if(iPosB != arrayB.length){
				iKeyB = arrayB[iPosB];
			} else {
				iKeyB = iHighValue;
			}

			
			// マッチングを実施する
			// ・Aの現在値 ＝ Bの現在値 の場合、ABともに出力し、A･Bともに現在値を進める
			if ( iKeyA == iKeyB ) {
				System.out.println(iKeyA + " -> AB");
				iPosA ++;
				iPosB ++;

			// ・Aの現在値 ＜ Bの現在値 の場合、Aのみ出力し、Aのみ現在値を進める
			} else if ( iKeyA < iKeyB ) {
				System.out.println(iKeyA + " -> A");
				iPosA ++;
				
				
			// ・Bの現在値 ＜ Aの現在値 の場合、Bのみ出力し、Bのみ現在値を進める
			} else {
				System.out.println(iKeyB + " -> B");
				iPosB ++;
			}
		}
	}
}