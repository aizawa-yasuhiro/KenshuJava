/*
	課題【３－１】
		JavaBeansの仕様に基づいた
		・メンバ変数： name(名前。文字列)，age(年齢。数値），worker（働いているかどうか。フラグ）
		・特にコンストラクタでの処理はない。
		をもつクラス
*/
package kadai03;

import java.io.Serializable;

public class Person implements Serializable {

	private String name;		// 名前
	private int age;			// 年齢
	private boolean worker;		// 働いているかどうか
	
	
	/* コンストラクタ*/
	public Person() {
		// 処理無し
	}

	/* アクセサメソッド*/

	// ■名前
	/* 名前格納 */
	public void setName(String _name) {
		name = _name;
	}
	/* 名前取得 */
	public String getName() {
		return name;
	}

	// ■年齢
	/* 年齢格納 */
	public void setAge(int _age) {
		age = _age;
	}
	/* 年齢取得 */
	public int getAge() {
		return age;
	}
	
	// ■働いているかどうか
	/* 働いているかどうか格納 */
	public void setWorker(boolean _worker) {
		worker = _worker;
	}
	/* 働いているかどうか取得 */
	public boolean isWorker() {
		return worker;
	}

}