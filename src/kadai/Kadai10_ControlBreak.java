package kadai;

/*
	課題１０
	配列 {10,10,10,20,20,30,40,50,50,60}（配列の中はすでにソートされている）
	に対し、各値がいくつずつあるかを表示する。
	ループは１度（順方向）のみ使用し、配列の要素は +1 や -1 して参照不可とする。
*/
public class Kadai10_ControlBreak {
	public static void main(String[] args) {
		
		int[] list = {10,10,10,20,20,30,40,50,50,60};
		int iPreVal;					// 前回値
		int iCnt = 0;					// 件数

		// 前回値に1件目の値を設定する
		iPreVal = list[0];

		// 対象のリストの要素分だけループする
		for(int i = 0; i <= list.length - 1 ; i++ ) {

			// 最初の場合 または 前回値と同じ場合はカウントアップする
			if(i == 0 || list[i] == iPreVal) {
				iCnt++;

			// 前回値と異なる場合、前回値の件数を出力し、前回値と件数を初期化する
			} else {
				System.out.println(iPreVal + " -> " + iCnt );
				iPreVal = list[i];
				iCnt = 1;
			}
		}

		// 最後の対象値の件数を出力する
		System.out.println(iPreVal + " -> " + iCnt );

	}
}