package sample14;

/*
	サンプル１４：抽象クラス・メソッド
*/
abstract public class Sample14_Shohizei {
	private int price;			// 税抜き金額

	/* 税抜き金額設定 */
	public void setPrice(int _price){
		price = _price;
	}
	/* 税抜き金額取得 */
	public int getPrice(){
		return price;
	}

	/* 税計算 */
	abstract public void calcTax();
}