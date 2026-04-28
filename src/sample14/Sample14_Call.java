package sample14;

/*
	サンプル１４：呼び出しクラス
*/
public class Sample14_Call {
	public static void main(String args[]){

		// 消費税クラスをインスタンス化する
		Sample14_Shohizei5Per obj5Per = new Sample14_Shohizei5Per();
		Sample14_Shohizei8Per obj8Per = new Sample14_Shohizei8Per();

		// 金額を設定する
		obj5Per.setPrice(1000);
		obj8Per.setPrice(2000);
		
		// 税計算して表示する
		obj5Per.calcTax();
		obj8Per.calcTax();

	}
}