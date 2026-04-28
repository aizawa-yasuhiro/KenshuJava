package sample16;

/*
	サンプル１６：例外（throw）
*/
public class Sample16_TryCatch4 {
	public static void main(String args[]){
		try {
			calc(args);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("引数がありません。");

		} catch(Exception ex) {
			System.out.println(ex.getMessage());

		} finally {
			System.out.println("例外後の処理です。");
		}

	}

	public static void calc(String args[]) throws Exception{
		// 100 ÷ 引数 する
		if(args.length == 0){
			throw new Exception("引数が指定されていません。");
		}

		System.out.println(100 / Integer.parseInt(args[0]));
		System.out.println("後続処理です。");
	}
}
