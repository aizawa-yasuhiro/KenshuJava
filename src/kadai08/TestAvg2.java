package kadai08;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *	課題【８－２】<br>
 *	課題【８－１】に対して以下を改修<br>
 *		・初めて出てくる教科の場合、教科名を ArrayList に保持する。<br>
 *		・出力時は HashMap のキー集合からではなく、ArrayList から教科名を取得して HashMap を
 *		検索することにより、引数として入力された順番に教科名を出す。<br>
 *
 *	@author	 Nishimoto
 *	@version 1.0
*/
public class TestAvg2 {

	/**
	 *	起動メソッド<br>
	 *	ArrayList（教科名）にキー値、
	 *	HashMap（キー：教科名、値：合計点数・人数オブジェクト）に値を貯め込み、
	 *	最後に ArrayListの順に <教科名>:<平均点> の形式でコンソールに出力する
	 *
	 *	@param args	教科名＋「:」＋点数（0～100） のリスト
	*/
	public static void main(String args[]) {
		
		String sKyoka;					// 引数から取得した教科名
		int iScore;						// 引数から取得した点数
		// ScoreNinzu objScoreNinzu;		// 合計点数・人数オブジェクト


		// 引数が無い場合、メッセージを表示して処理を終了する
		if(args.length == 0) {
			System.out.println("引数がありません。");
			return;
		}


		// HashMap（キー：教科名、値：合計点数・人数オブジェクト）のオブジェクトを生成する
		HashMap<String, ScoreNinzu> hmpTtlScoreNinzu = new HashMap<>();

		// ArrayList（教科名）のオブジェクトを生成する
		ArrayList<String> lstKyoka = new ArrayList<String>();


		// 引数の分だけループし、教科名を ArrayListに取得し、教科毎に点数と人数を集計する
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
				lstKyoka.add(sKyoka);	// 教科名を ArrayList に保持
				hmpTtlScoreNinzu.put(sKyoka, new ScoreNinzu(iScore));
			}

		}		
		
		// 前述で作成した ArrayList から教科名を取得し、
		// HashMapから合計点数・人数オブジェクトを出力する
		//		for(int i=0; i < lstKyoka.size(); i++){
		//			sKyoka = lstKyoka.get(i);							// ArrayListから教科名取得
		//			objScoreNinzu = hmpTtlScoreNinzu.get(sKyoka);		// HashMapから合計点数・人数オブジェクトを取得
		//
		//			// 合計点数・人数オブジェクトから平均点を取得して画面に出力する
		//			System.out.println(sKyoka + "：" + objScoreNinzu.getAvgScore());
		//		}
		
		// 拡張for
		for(String skey : lstKyoka) {

			// 合計点数・人数オブジェクトから平均点を取得して画面に出力する
			System.out.println(skey + "：" + hmpTtlScoreNinzu.get(skey).getAvgScore());
		}

	}
	
}