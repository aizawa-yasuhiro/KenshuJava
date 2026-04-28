package sample;

/*
サンプル０３：文字列（String）
*/
public class Sample03_String {

	public static void main(String[] args) {
		String s1 = "あいうえお"; 			// 文字列の変数
		String s2 = args[0]; 				// 引数の１つめ
		String s3 = args[1]; 				// 引数の２つめ
		System.out.println(s1 + s2 + s3); 	// 文字列の結合
		int i2 = Integer.parseInt(s2); 	// String ⇒ int
		int i3 = Integer.parseInt(s3); 	// String ⇒ int
		System.out.println(i2 + i3); 		// 加算
		System.out.println("length():" + s1.length()); // 文字列の長さ
		System.out.println("charAt():" + s1.charAt(2)); // インデックス「2」の位置
		System.out.println("substring():" + s1.substring(1, 4)); // インデックス「1」から「4」の手前
		System.out.println("replace():" + s1.replace("いうえ", "ＡＺ")); // 「いうえ」を「ＡＺ」に置換
	}

}
