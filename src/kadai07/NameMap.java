package kadai07;

import java.util.HashMap;

/**
 *	課題【７】<br>
 *	引数の内容を集計してそれぞれの件数を表示する
 *
 *	@author  Nishimoto
 *	@version 1.0
*/
public class NameMap {

	/**
	 *	起動メソッド<br>
	 *	HashMap（キー：名前、値：人数）に値を貯め込み、
	 *	最後に <名前>:<人数> の形式でコンソールに出力する
	 *
	 *	@param args	名前リスト
	*/
	public static void main(String args[]) {

		// int iCnt; // 人数
		// String sName; // 名前

		// 引数が無い場合、メッセージを表示して処理を終了する
		if (args.length == 0) {
			System.out.println("引数がありません。");
			return;
		}

		// HashMap（キー：名前、値：人数）のオブジェクトを生成する
		HashMap<String, Integer> hmpNameMap = new HashMap<>();

		// 引数の数だけループして以下の処理を行う
		for (String key : args) {

			// 既に HashMap内に存在している場合、人数を取得して +1 する
			// Java8以降は、Genericsを利用しているため、HashMapから値の
			// 出し入れの際もint型に変換する必要がない
			if (hmpNameMap.containsKey(key)) {
				hmpNameMap.replace(key, hmpNameMap.get(key) + 1);
				// まだ存在していない場合、人数を「1」とする
			} else {
				hmpNameMap.put(key, 1);
			}
		}

		// 前述で取得した HashMap からキー（名前）リストを取得し、
		// Iteratorをループして人数を出力する
		// Set<String> keys = hmpNameMap.keySet();
		//
		// Iterator<String> iteKeys = keys.iterator();
		// while(iteKeys.hasNext()) {
		// 	sName = iteKeys.next();						// Iteratorから名前取得
		//	iCnt = hmpNameMap.get(sName).intValue();	// HashMapから人数を取得
		//
		// 画面に出力する
		//	System.out.println(sName + ":" + iCnt + "名");
		//}

		// 拡張for文で書き直し 2026/04/28
		for (String key : hmpNameMap.keySet()) {
			System.out.println(key + ":" + hmpNameMap.get(key) + "名");
		}
		
		// 例 Java8以降は、forEachとラムダ式で書き直しできる 2026/04/28
		// hmpNameMap.forEach((key, value) -> System.out.println(key + ":" + value + "名"));
		
	}
}