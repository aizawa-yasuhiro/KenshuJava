package sample16;

/*
	サンプル１６：例外（独自の Exception）
*/
public class Sample16_TryCatch5_Exception
								extends Exception {

	/* メンバ変数 */
	private String errMsg;			// エラー内容

	/* コントスラクタ */
	public Sample16_TryCatch5_Exception(String _errMsg) {
		errMsg = _errMsg;
	}

	/* メッセージ表示 */
	public void print(){
		System.out.println(errMsg);
	}
}