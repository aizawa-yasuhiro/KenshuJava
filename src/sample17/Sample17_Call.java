package sample17;

/*
	サンプル１７：呼び出しクラス
*/
public class Sample17_Call {
	public static void main(String args[]){

		// クラスを2つインスタンス化する
		Sample17_Shopping objA = new Sample17_Shopping();
		Sample17_Shopping objB = new Sample17_Shopping();

		/* どのオブジェクトが実行しても同じ */

		// ・objAで値引き率を設定し、objBで確認
		Sample17_Shopping.nebiki_ritsu = 0.03;
		Sample17_Shopping.printSame();

		// ・objBで値引き率を設定し、クラスで確認
		Sample17_Shopping.nebiki_ritsu = 0.04;
		Sample17_Shopping.printSame();

		// ・クラスで値引き率を設定し、objAで確認
		Sample17_Shopping.nebiki_ritsu = 0.05;
		Sample17_Shopping.printSame();


		/* オブジェクトごとに結果が異なる */

		// ・金額を設定する
		objA.price = 1000;
		objB.price = 2000;

		// ・税計算して表示する
		objA.printJobDiff();
		objB.printJobDiff();
	}
}