package sample13;

/*
	サンプル１３：パッケージ、アクセスレベル
*/
public class Sample13_Car {
	private String maker;		// メーカー
	private String kind;		// 車種

	/* コンストラクタ */
	public Sample13_Car(String _maker, String _kind){
		maker = _maker;
		kind = _kind;
	}

	/* 内容表示 */
	public void print(){
		System.out.println("メーカー：" + maker);
		System.out.println("車種：" + kind);
	}

}