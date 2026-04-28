package sample13.call;

import sample13.Sample13_Car;

/*
	サンプル１３：呼び出しクラス
*/
public class Sample13_Call {
	public static void main(String args[]){

		// 車クラスをインスタンス化する
		Sample13_Car objCar_A = new Sample13_Car("トヨタ", "プリウス");
		Sample13_Car objCar_B = new Sample13_Car("日産", "マーチ");

		// 内容を表示する
		objCar_A.print();
		objCar_B.print();

	}
}