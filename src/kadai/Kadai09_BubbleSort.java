package kadai;

/*
	課題９
	引数の数字（引数の数は２個以上で不定）を以下の手順でソートする。
	・a[n-1]～a[0]まで、隣接したデータ同士を比較し、小さい方を前に入れ替える。
	　　　→ a[0]に最小値が浮き上がってくる。
	・a[n-1]～a[1]まで、隣接したデータ同士を比較し、小さい方を前に入れ替える。
	　　　→ a[1]に２番目に小さい値が浮き上がってくる。
		・・・
	・a[n-1]～a[n-2] の隣接したデータ同士を比較し、小さい方を前に入れ替える。
	　　　→ a[n-2]に (n-1)番目に小さい値が浮き上がってくる。
*/
public class Kadai09_BubbleSort {
	public static void main(String[] args) {

		int n = args.length;	// 引数の数
		int iTmp;				// 値入替え時の保持用変数


		// 引数が足りない場合はメッセージを表示し、処理を終了する
		if(n < 2) {
			System.out.println("引数が足りません。");
			return;
		}

		// 引数の配列を整数配列に数値変換しながら入れ直す
		int[] a = new int[n];
		for(int i = 0; i < n; i++ ) {
			a[i] = Integer.parseInt(args[i]);
		}


		// 0 ～ (n-2) まで、ループさせる
		for(int i = 0; i <= (n - 2); i++ ) {

			// (n-1) ～ 前述のループインデックスまで大小比較を行う
			for(int j = (n-1); j > i; j-- ) {

				// 比較対象の値が、右隣の値よりも大きい場合は入れ替える
				if( a[j-1] > a[j] ) {
					iTmp = a[j];
					a[j] = a[j-1];
					a[j-1] = iTmp;
				}
			}
		}

		// 並び替えた配列を出力する
		for(int i = 0; i < n; i++ ) {
			System.out.print(a[i] + " ");
		}
	}
}