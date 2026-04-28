package sample16;

/*
	サンプル１６：例外（throws）
*/
public class Sample16_TryCatch3 {
	public static void main(String args[]){
		try {
			calc(args);

		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("引数がありません。");

		} catch(NumberFormatException ex) {
			System.out.println("引数が数字ではありません。");

		} finally {
			System.out.println("例外後の処理です。");

		}
	}

	public static void calc(String args[]) 
	 throws ArrayIndexOutOfBoundsException, NumberFormatException{
		// 100 ÷ 引数 する
		System.out.println(100 / Integer.parseInt(args[0]));
		System.out.println("後続処理です。");
	}
}
