package sample15;

/*
	サンプル１５：呼び出しクラス
*/
public class Sample15_Call {
	public static void main(String args[]){

		// 消費税インタフェースをインスタンス化する
		Sample15_Shohizei objShohizei;
		if(args[0].equals("5")){
			objShohizei = new Sample15_Shohizei5Per();
		} else {
			objShohizei = new Sample15_Shohizei8Per();
		}

		// 税計算して表示する
		objShohizei.calcTax(1000);

	}
}