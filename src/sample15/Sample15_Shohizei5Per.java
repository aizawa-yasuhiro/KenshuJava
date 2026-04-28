package sample15;

/*
	サンプル１５：インタフェースを実装
*/
public class Sample15_Shohizei5Per implements Sample15_Shohizei {
	/* 税計算 */
	public void calcTax(int price){
		System.out.println("消費税：" + (int)(price * 1.05));
	}
}