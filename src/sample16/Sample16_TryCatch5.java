package sample16;

/*
	サンプル１６：例外（独自の Exception）
*/
public class Sample16_TryCatch5 {
	public static void main(String args[]){

		try {
			if (args.length == 0){
				throw new Sample16_TryCatch5_Exception
									("引数なしエラー");

			} else if (args[0].equals("0")) {
				throw new Sample16_TryCatch5_Exception
									("引数「0」エラー");

			}
		} catch(Sample16_TryCatch5_Exception ex) {
			ex.print();

		} finally {
			System.out.println("例外後の処理です。");
		}

		System.out.println("後続処理です。");
	}

}
