package sample;

/*
	サンプル１１：呼び出しクラス
*/
public class Sample11_Call {
	public static void main(String args[]){

		// PCクラスをインスタンス化する
		Sample11_PC objPC_A = new Sample11_PC();
		Sample11_PC objPC_B = new Sample11_PC("DELL", "Windows8.1");

		// 内容を表示する
		objPC_A.print();
		objPC_B.print();

	}
}