package sample14;

/*
	サンプル１４：抽象クラス・メソッドを継承
*/
public class Sample14_Shohizei5Per extends Sample14_Shohizei {
	/* 税計算 */
	public void calcTax(){
		System.out.println("消費税：" + (int)(getPrice() * 1.05));
	}
}