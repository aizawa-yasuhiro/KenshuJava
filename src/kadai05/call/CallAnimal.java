package kadai05.call;

import kadai05.Animal;
import kadai05.ani.Cat;
import kadai05.ani.Dog;

/**
 * 課題【５】<br>
 * Catクラス、Dogクラスのオブジェクトを生成し、
 * 自己紹介メソッドを呼び出して内容を確認する<br>
 *
 * @author	Nishimoto
 * @version 1.0
*/
public class CallAnimal {

	/**
	 * 初期起動メソッド<br>
	 * Catクラス、Dogクラスをインスタンス化し、各メソッドを呼び出す
	 *
	 * @param args コマンドライン引数（指定不要）
	*/
	public static void main(String args[]) {

		// インスタンス生成
		Animal cat = new Cat();
		Animal dog = new Dog();
		
		// 名前をセット
		cat.setName("タマ");
		dog.setName("ポチ");

		// 自己紹介を表示
		cat.talk();
		dog.talk();
	}
}