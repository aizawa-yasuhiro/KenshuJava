/*
	課題【４－１】
		kadai03.Personクラスを継承して、社員クラスを作成する。
*/
package kadai04;

import kadai03.Person;

public class Shain extends Person {
	
	private String shainNo;		// 社員番号


	/* コンストラクタ（引数なし） */
	public Shain() {
		// 処理無し
	}

	/* コンストラクタ（引数2つ） */
	public Shain(String _name, String _shainNo) {
		// コンストラクタ（引数3つ）を age=22 で呼び出し
		this(_name, 22, _shainNo);
	}

	/* コンストラクタ（引数3つ） */
	public Shain(String _name, int _age, String _shainNo) {

		// 値の設定
		setName(_name);					// 名前
		setAge(_age);					// 年齢
		shainNo = _shainNo;				// 社員番号

		// 社員番号が "" の場合は worker←false、それ以外の場合、true
		if("".equals(_shainNo)){
			setWorker(false);
		} else {
			setWorker(true);
		}
	}	


	/* 自己紹介 */
	public void intro() {

		String sIntro;			// 自己紹介文

		// 名前(年齢)です。
		sIntro = getName() + "(" + getAge() + ")です。";

		// 働いて[います。社員番号は XXXX です。|いません]。
		if(isWorker()) {
			sIntro = sIntro + "働いています。社員番号は " + shainNo + " です。";
		} else {
			sIntro = sIntro + "働いていません。";
		}

		// 自己紹介を出力する
		System.out.println(sIntro);
	}

	/* Personクラスの setAge() をオーバーライド */
	public void setAge(int _age) {

		// 年齢が 20～65 以外の場合は、IllegalArgumentExceptionをスローする
		if(20 > _age || _age > 65) {
			throw new IllegalArgumentException();
		}

		// Personクラスの setAge() を呼び出す
		super.setAge(_age);
	}
}