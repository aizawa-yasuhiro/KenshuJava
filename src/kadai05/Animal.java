package kadai05;

/**
 * 課題【５】<br>
 * 名前をメンバ変数に持ち、会話メソッドをもつ動物クラス（抽象クラス）<br>
 *
 * @author Nishimoto
 * @version 1.0
*/
public abstract class Animal {

	private String name;	// 名前


	/**
	 * コンストラクタ<br>
	 * 特に処理なし
	*/
	public Animal() {
		// 処理なし
	}

	/**
	 * 名前を設定する。
	 *
	 * @param _name 名前
	*/
	public void setName(String _name) {
		name = _name;
	}

	/**
	 * 名前を返す。
	 *
	 * @return 名前
	*/
	public String getName() {
		return name;
	}
	
	
	/**
	 * 自己紹介用の抽象メソッド。<br>
	 * 子クラスでオーバーライドされる
	*/
	public abstract void talk();
}