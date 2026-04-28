package kadai;

/*
	課題２
	2 の累乗を求めて表示する。累乗値の引数は「0」～「10」。
	引数がない場合は、引数が「0」の場合と同じ動作とする。
	引数が 0～10 の数値以外の場合を考慮しない。
*/

public class Kadai02_Power {
	public static void main(String[] args) {

		int iRui = 0;			// 累乗値。初期値は 0
		int iAns = 1;			// 累乗結果。初期値は 1


		// 引数が存在する場合、累乗値を上書きする(存在しない場合は初期値のまま)
		if(args.length != 0) {
			iRui = Integer.parseInt(args[0]);
		}


		// 累乗結果として、引数の回数分 2 を掛けていく
		for(int i = 0; i < iRui; i++ ){
			iAns = iAns * 2;
		}

		// 累乗結果を出力する
		System.out.println("2 の " + iRui + "乗 --> " + iAns);

	}
}