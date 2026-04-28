package sample;

/*
サンプル０９：メソッド
*/
public class Sample09_Method {
	private static int i;

	public static void main(String args[]) {
		int a = add(10, 20);
		print(a);
		i = 50;
		print();
	}

	/* 引数を加算して返す*/
	public static int add(int x, int y) {
		return x + y;
	}

	/* 引数をコンソールに表示*/
	public static void print(int z) {
		System.out.println(z);
	}

	/* メンバ変数をコンソールに表示*/
	private static void print() {
		System.out.println(i);
	}

}
