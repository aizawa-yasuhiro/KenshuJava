package kadai05.ani;

import kadai05.Animal;

/**
 * 課題【５】<br>
 * 動物クラスを継承した 猫クラス。<br>
 *
 * @author  Nishimoto
 * @version 1.0
*/
public class Cat extends Animal {

	/**
	 * 動物クラスのtalk()のオーバーライドメソッド<br>
	 * 親クラスから名前を取得し、猫用の文章を出力する。
	*/
	public void talk() {
		System.out.println("私は" + getName() + "だニャン");
	}
}