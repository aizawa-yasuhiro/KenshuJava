package sample;

/*
	サンプル１１：クラス
*/
public class Sample11_PC {
	private String maker;		// メーカー
	private String os;			// ＯＳ

	/* コンストラクタ（引数なし） */
	public Sample11_PC(){
		maker = "不明";
		os = "不明";
	}
	/* コンストラクタ（引数あり） */
	public Sample11_PC(String _maker, String _os){
		maker = _maker;
		os = _os;
	}

	/* 内容表示 */
	public void print(){
		System.out.println("メーカー：" + maker);
		System.out.println("ＯＳ：" + os);
	}

}