package sample16;

/*
	サンプル１６：例外（try-catch-finally）
*/
public class Sample16_TryCatch2 {
	public static void main(String args[]){
		calc(args);
	}

	public static void calc(String args[]){
		// 100 ÷ 引数 する
		try {
			System.out.println(100 / Integer.parseInt(args[0]));

		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("引数がありません。");
			return;

		} catch(NumberFormatException ex) {
			System.out.println("引数が数字ではありません。");
			return;

		} finally {
			System.out.println("例外後の処理です。");

		}

		System.out.println("後続処理です。");

	}
}