package kadai05.ani;

import kadai05.Animal;

/**
 * 課題【５】<br>
 * 動物クラスを継承した 犬クラス。<br>
 *
 * @author  Nishimoto
 * @version 1.0
*/
public class Dog extends Animal {
	
	/**
	 * 動物クラスのtalk()のオーバーライドメソッド<br>
	 * 親クラスから名前を取得し、犬用の文章を出力する。
	*/
	public void talk() {
		System.out.println("ボクは" + getName() + "だワン");
	}
}