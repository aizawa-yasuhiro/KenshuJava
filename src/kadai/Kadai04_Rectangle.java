package kadai;

/*
	課題４
	「＋」「｜」「－」を使用して長方形を表示する。
	第１引数を行（2以上の整数）、第２引数（2以上の整数）を列とする。
	引数が足りない場合はエラーとし、引数が 2以上の数値以外の場合を考慮しない。
*/
public class Kadai04_Rectangle {
	public static void main(String[] args) {

		int iRow;			// 行数（第１引数）
		int iCol;			// 列数（第２引数）


		// 引数が足りない場合はメッセージを表示し、処理を終了する
		if(args.length < 2) {
			System.out.println("引数が足りません。");
			return;
		}

		// 引数を数値に変換して取得する
		iRow = Integer.parseInt(args[0]);
		iCol = Integer.parseInt(args[1]);


		// 行数分ループする
		for(int r = 1; r <= iRow ; r++) {

			// 列数分ループする
			for(int c = 1; c <= iCol; c++ ){

				// 1行目、または最終行の場合
				if( r == 1 || r == iRow ) {

					// １文字目または最終列の場合
					if( c == 1 || c == iCol){
						System.out.print("＋");

					// 中間列の場合
					} else {
						System.out.print("－");

					}

				// 中間行の場合
				} else {

					// １文字目または最終列の場合
					if( c == 1 || c == iCol){
						System.out.print("｜");

					// 中間列の場合
					} else {
						System.out.print("　");
					}

				}
			
			} 

			// 列の最後に改行を出力する
			System.out.print("\n");
		}
		
	}
}