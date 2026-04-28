package kadai08;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *	課題【８】<br>
 *	合計点数・人数クラス<br>
 *	合計点数と人数を保持し、平均点を算出するクラス
 *
 *	@author	 Nishimoto
 *	@version 1.0
*/
public class ScoreNinzu {

	private int iTtlScore;			// 合計点数
	private int iTtlNinzu;			// 合計人数


	/**
	 *	コンストラクタ（引数：点数）<br>
	 *	点数・人数加算メソッドを呼び出す
	 *
	 *	@param _iScore 点数
	*/
	public ScoreNinzu(int _iScore){
		addScore(_iScore);
	}

	/**
	 *	点数・人数加算メソッド<br>
	 *	点数を加算し、人数をカウントアップする
	 *
	 *	@param _iScore 点数
	*/
	public void addScore(int _iScore){
		iTtlScore = iTtlScore + _iScore;
		iTtlNinzu ++;
	}

	/**
	 *	平均点算出メソッド<br>
	 *	合計点数と人数から平均点を計算・フォーマットして返す
	 *
	 *	@return 小数点第２位で四捨五入した平均点
	*/
	public String getAvgScore() {
		BigDecimal bdScore = new BigDecimal(iTtlScore);			// 点数を BigDecimal型に変換
		BigDecimal bdNinzu = new BigDecimal(iTtlNinzu);			// 人数を BigDecimal型に変換

		// 合計点数÷人数
		// 小数第２位を四捨五入してString型を返す
		// 2026/04/28 非推奨のため変更(ROUND_HALF_UPはRoundingMode.HALF_UPに変更) )
		return bdScore.divide(bdNinzu, 1, RoundingMode.HALF_UP).toString();
	}
}