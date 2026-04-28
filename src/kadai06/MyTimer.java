package kadai06;

/**
 *	課題【６】<br>
 *	インスタンス生成～メソッド呼び出しまでの経過ミリ秒を取得するクラス
 *
 *	@Author  Nishimoto
 *	@Version 1.0
*/
public class MyTimer {
	
	private long lStartMs;				// 1970/1/1 から現在時刻までの経過ミリ秒

	/**
	 *	コンストラクタ<br>
	 *	メンバ変数に 1970/1/1 から現在時刻までの経過ミリ秒を設定する
	*/
	public MyTimer() {
		lStartMs = System.currentTimeMillis();
	}

	/** 
	 *	経過時間取得メソッド<br>
	 *	インスタンス生成からの経過ミリ秒を取得する
	 *
	 *	@return インスタンス生成からの経過ミリ秒
	*/
	public long getPastTime() {
		// 1970/1/1 から現在時刻までの経過ミリ秒 － メンバ変数のミリ秒
		return System.currentTimeMillis() - lStartMs;
	}
}