package kadai;

/*
	課題８
	入力された引数までの正の整数の素数を、最大１０個まで表示する。
	引数が無い場合はエラーとし、数値以外の場合を考慮しない。
	先に見つけた素数は一度配列にためておく。
	素数 n とは 1 < x < n の素数 x で、割り切れる x がない n。
	上記の素数判定をメソッドとする（引数は、判定対象値・発見済の素数配列・発見数。戻り値は、素数か否か）
*/
public class Kadai08_GetPrime {
	public static void main(String[] args) {

		int[] x = new int[10];		// 素数を格納する配列
		int iCnt = 0;				// 配列の件数＝要素番号
		int iVal;					// 入力された引数

		// 引数が無い場合はメッセージを表示し、処理を終了する
		if(args.length == 0) {
			System.out.println("引数がありません。");
			return;
		}

		// 引数を数値変換して取得する
		iVal = Integer.parseInt(args[0]);


		// 2から引数までループする
		for(int n = 2; n <= iVal; n++ ) {

			// 対象値が素数かどうか判定し、素数の場合は素数配列に格納する
			if( isPrime(n, iCnt, x) ) {
				x[iCnt] = n;		// 素数配列に格納
				iCnt ++;			// 件数を+1

				// 配列に10個格納できた場合、ループ終了
				if( iCnt == x.length ) {
					break;
				}
			}
		}

		// 素数配列に格納した素数を出力する
		for(int i = 0; i < iCnt; i++ ) {
			System.out.println(x[i]);
		}
	}


	/* 素数かどうか判定する（引数は、判定対象値・発見済の素数配列・発見数。戻り値は、素数か否か） */
	public static boolean isPrime(int n, int iCnt, int[] x) {

		boolean bPrimeFlg = true;	// 素数フラグ


		// 素数配列に格納されている値の個数分ループし、
		// 配列に格納されている素数で割り切れる場合は、素数ではないため処理を抜ける
		for(int i = 0; i < iCnt; i++ ) {
			if( (n % x[i]) == 0 ) {
				bPrimeFlg = false;
				break;
			}
		}

		// 素数フラグを返す
		return bPrimeFlg;
	}

}
