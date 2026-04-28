package kadai;

/*
	課題１２
	配列Ａ {1, 2, 4, 6, 8, 10}（配列の中はすでにソートされている）
	配列Ｂ {1, 2, 3, 4, 5, 6, 7, 9, 10}（配列の中はすでにソートされている）
	配列Ｃ {2, 3, 6, 7, 8}（配列の中はすでにソートされている）
	に対し、各値がどちらにあるかを表示する。
	ループは１度（順方向）のみ使用し、配列の要素は +1 や -1 して参照不可とする。
*/

public class Kadai12_Matching2 {
	public static void main(String[] args) {
		
		int[] arrayA = {1, 2, 4, 6, 8, 10};				// 配列A
		int[] arrayB = {1, 2, 3, 4, 5, 6, 7, 9, 10};	// 配列B
		int[] arrayC = {2, 3, 6, 7, 8};					// 配列C
		int iPosA = 0;									// 配列Aの要素番号の現在位置
		int iPosB = 0;									// 配列Bの要素番号の現在位置
		int iPosC = 0;									// 配列Cの要素番号の現在位置
		int iKeyA;										// 配列Aのマッチングキー
		int iKeyB;										// 配列Bのマッチングキー
		int iKeyC;										// 配列Cのマッチングキー
		int iMinVal;									// 配列A～Cの最小値
		int iHighValue = 999;							// HIGH_VALUE


		// 配列A,配列B,配列Cの中身を全て調べ終わるまでループ
		while( (iPosA != arrayA.length) || (iPosB != arrayB.length) || (iPosC != arrayC.length) ) {

			// 配列A・B・Cのマッチングキーを取得する
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

			if(iPosC != arrayC.length){
				iKeyC = arrayC[iPosC];
			} else {
				iKeyC = iHighValue;
			}


			// A,B,C のマッチングキーの中から最小値を取得し、最小値を出力する
			iMinVal = getMinVal(iKeyA, iKeyB, iKeyC);
			System.out.print(iMinVal + " -> ");


			// マッチングを実施する
			// ・配列Aが最小値と一致する場合は「A」を出力して現在位置+1する
			if(iKeyA == iMinVal) {
				System.out.print("A");
				iPosA ++;
			}

			// ・配列Bが最小値と一致する場合は「B」を出力して現在位置+1する
			if(iKeyB == iMinVal) {
				System.out.print("B");
				iPosB ++;
			}

			// ・配列Cが最小値と一致する場合は「C」を出力して現在位置+1する
			if(iKeyC == iMinVal) {
				System.out.print("C");
				iPosC ++;
			}

			// 改行する
			System.out.print("\n");
		}
	}


	/* 最小値を取得する */
	public static int getMinVal(int iValA, int iValB, int iValC) {
		int iMinVal;				// 最小値

		// 一旦、Aを最小値に設定する
		iMinVal = iValA;

		// 最小値 ＞ B の場合、最小値をBに書き換える
 		if( iMinVal > iValB) {
			iMinVal = iValB;
		}

		// 最小値 ＞ C の場合、最小値をCに書き換える
		if ( iMinVal > iValC) {
			iMinVal = iValC;
		}

		// 最小値を返す
		return iMinVal;
	}
}