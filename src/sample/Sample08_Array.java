package sample;

/*
サンプル０８：配列
*/
public class Sample08_Array {

	public static void main(String[] args) {
		// 配列の宣言・初期化・データ設定
		int[] i = new int[5]; // 整数型の配列を5個作成
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;
		char[] c = { 'A', 'B', 'C', 'D', 'E' }; // 宣言と同時に代入
		String[] s = args; // 引数の配列をすべて代入
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
		
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
		
		for (int j = 0; j < s.length; j++) {
			System.out.println(s[j]);
		}
	}

}
