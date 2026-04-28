package kadai;

/*
	課題５
	第１引数を f(0)、第２引数を f(1) としたときに下記の内容を返す。
		「f(n) = f(n-1) + f(n-2) (n=2,3,4,...)」
	f(0)～f(10) を一旦配列に取得し、その配列の値をコンソールに表示する。
	引数が足りない場合はエラーとし、引数が数値以外の場合を考慮しない。
*/
public class Kadai05_Fibonacci {
	public static void main(String[] args) {

		int[] f = new int[11];		// f(0)～f(10)を格納する配列を宣言する


		// 引数が足りない場合はメッセージを表示し、処理を終了する
		if(args.length < 2) {
			System.out.println("引数が足りません。");
			return;
		}

		// 引数を配列変数に取得する
		f[0] = Integer.parseInt(args[0]);
		f[1] = Integer.parseInt(args[1]);

		// f(2)～f(10) を計算する（f(n) = f(n-1) + f(n-2)）
		for(int i = 2; i < f.length; i++ ) {
			f[i] = f[i-1] + f[i-2];
		}

		// f(0)～f(10) の配列を出力する
		for(int i = 0; i < f.length; i++ ) {
			// 出力
			System.out.println("f(" + i + ") = " + f[i]);
		}
		
	}
	
	
}