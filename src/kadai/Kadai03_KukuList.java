package kadai;

/*
	課題３
	九九表（タブ区切り）を表示する。
	第１引数は行値、第２引数は列値とする。
	引数がない場合のデフォルトは「9」とする。
	引数が 1～9 の数値以外の場合を考慮しない。
*/
public class Kadai03_KukuList {
	public static void main(String[] args) {

		int iRow = 9;			// 行値。初期値は 9
		int iCol = 9;			// 列値。初期値は 9


		// 引数が1個以上の場合は第１引数で行値を上書きする
		if(args.length > 0){
			iRow = Integer.parseInt(args[0]);
		}
		// 引数が2個以上の場合は第２引数で列値を上書きする
		if(args.length > 1){
			iCol = Integer.parseInt(args[1]);
		}


		// 行数分ループする
		for (int r = 1; r <= iRow; r++) {
			// 列数分ループする
			for(int c = 1; c <= iCol; c++){

				// 九九をタブ区切りで出力する
				System.out.print(r * c + "\t");
			}

			// 各行ごとに改行する
			System.out.print("\n");
		}
	}

}