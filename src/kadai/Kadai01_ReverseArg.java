package kadai;

/*
	課題１
	入力された引数を入力とは逆順に表示する。
	引数の数は不定とし、引数がない場合はエラーとする。
*/
public class Kadai01_ReverseArg {
	public static void main(String args[]) {

		// 引数が無い場合はメッセージを表示し、処理を終了する
		if(args.length == 0) {
			System.out.println("引数がありません。");
			return;
		}

		// 配列の中身を、要素数-1 ～ 0 まで順番に出力する
		for(int i = args.length - 1; i >= 0 ; i--) {
			System.out.print(args[i] + " ");
		}

	}

}