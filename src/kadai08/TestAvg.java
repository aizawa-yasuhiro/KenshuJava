package kadai08;

import java.util.HashMap;

/**
 *	課題【８－１】<br>
 *	引数で任意の数の 教科と点数の組合せ を指定し、各教科の平均点（小数点第２位を四捨五入）を表示する。<br>
 *		・教科と点数の組合せは、 教科名(1文字)＋「:」＋点数（0～100）とする。<br>
 *		・教科は 1文字目、点数は 3文字目以降として各引数から抜き出して使用する。<br>
 *		・各教科の種類は常に同じとは限らない（「数」「英」、「数」のみ など）<br>
 *		・各教科の数は同じとは限らない（「数」が3人、「英」が2人など）<br>
 *		・教科名をキーとし、合計点数・人数オブジェクトを値として、HashMap に保持する。<br>
 *
 *	@author	 Nishimoto
 *	@version 1.0
*/
public class TestAvg {

	/**
	 *	起動メソッド<br>
	 *	HashMap（キー：教科名、値：合計点数・人数オブジェクト）に値を貯め込み、
	 *	最後に <教科名>:<平均点> の形式でコンソールに出力する
	 *
	 *	@param args	教科名＋「:」＋点数（0～100） のリスト
	*/
	/**
	 * @param args
	 */
	public static void main(String args[]) {

		String sKyoka; // 引数から取得した教科名
		int iScore; // 引数から取得した点数
		// ScoreNinzu objScoreNinzu; // 合計点数・人数オブジェクト

		// 引数が無い場合、メッセージを表示して処理を終了する
		if (args.length == 0) {
			System.out.println("引数がありません。");
			return;
		}

		// HashMap（キー：教科名、値：合計点数・人数オブジェクト）のオブジェクトを生成する
		HashMap<String, ScoreNinzu> hmpTtlScoreNinzu = new HashMap<>();

		// 引数の分だけループし、教科毎に点数と人数を集計する
		for (String key : args) {

			// ・引数が３文字未満の場合、メッセージを表示して処理を終了する
			if (key.length() < 3) {
				System.out.println("３文字未満の引数が存在します。");
				return;
			}

			// 教科名(1文字目)を取得する
			sKyoka = key.substring(0, 1);

			// 点数(3文字目以降)を取得し、数値化する
			// 数値以外の場合、メッセージを表示して処理を終了する
			try {
				iScore = Integer.parseInt(key.substring(2));
			} catch (NumberFormatException ex) {
				System.out.println("点数(引数の３文字目以降)が数値ではありません。");
				return;
			}

			// 点数（0～100）以外の場合、メッセージを表示して処理を終了する
			if (iScore < 0 || iScore > 100) {
				System.out.println("点数（0～100）以外の教科が存在します。");
				return;
			}

			// 既に HashMap内に対象の教科名が存在する場合
			if (hmpTtlScoreNinzu.containsKey(sKyoka)) {
				// HashMapから点数人数クラスを取り出し、点数と人数を加算する
				hmpTtlScoreNinzu.get(sKyoka).addScore(iScore);

				// HashMapに対象の教科名が存在しない場合
			} else {
				// 新しく合計点数・人数オブジェクトを生成する
				hmpTtlScoreNinzu.put(sKyoka, new ScoreNinzu(iScore));
			}

		}

		// 前述で取得した HashMap からキー（教科名）リストを取得し、
		// Iteratorをループして合計点数・人数オブジェクトを出力する
		//		Set<String> keys = hmpTtlScoreNinzu.keySet();
		//
		//		Iterator<String> iteKeys = keys.iterator();
		//		while(iteKeys.hasNext()) {
		//			sKyoka = iteKeys.next();							// Iteratorから教科名取得
		//			objScoreNinzu = hmpTtlScoreNinzu.get(sKyoka);		// HashMapから合計点数・人数オブジェクトを取得
		//
		//			// 合計点数・人数オブジェクトから平均点を取得して画面に出力する
		//			System.out.println(sKyoka + "：" + objScoreNinzu.getAvgScore());
		//		}
		
		// 拡張for文で書き直し 2026/04/28
		for (String key : hmpTtlScoreNinzu.keySet()) {
			System.out.println(key + "：" + hmpTtlScoreNinzu.get(key).getAvgScore());
		}
	}
}