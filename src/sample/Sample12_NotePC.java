package sample;

/*
	サンプル１２：継承
*/
public class Sample12_NotePC extends Sample11_PC {
	private String size;

	/* コンストラクタ（引数なし） */
	public Sample12_NotePC(){
		size = "不明";
	}
	/* コンストラクタ（引数あり） */
	public Sample12_NotePC(String _maker, String _os, String _size){
		super(_maker, _os);
		size = _size;
	}

	/* 内容表示 */
	public void print(){
		super.print();
		System.out.println("サイズ：" + size);
	}

}