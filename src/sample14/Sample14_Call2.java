package sample14;

/*
	サンプル１４：呼び出しクラス
*/
public class Sample14_Call2 {
	public static void main(String args[]){

		// 消費税クラスをインスタンス化する
		Sample14_Shohizei objShohizei;
		if(args[0].equals("5")){
			objShohizei = new Sample14_Shohizei5Per();
		} else {
			objShohizei = new Sample14_Shohizei8Per();
		}

		// 金額を設定する
		objShohizei.setPrice(1000);
		
		// 税計算して表示する
		objShohizei.calcTax();

	}
}