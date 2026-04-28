package sample;

/*
	サンプル１２：呼び出しクラス
*/
public class Sample12_Call {
	public static void main(String args[]){

		// PCクラスをインスタンス化する
		Sample12_NotePC objNotePC_A = new Sample12_NotePC();
		Sample12_NotePC objNotePC_B = new Sample12_NotePC("DELL", "Windows8.1", "B5");

		// 内容を表示する
		objNotePC_A.print();
		objNotePC_B.print();

	}
}