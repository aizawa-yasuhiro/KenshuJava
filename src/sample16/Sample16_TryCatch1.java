package sample16;

/*
 *	サンプル１６：例外
 *	@author test
 *	@version 
*/
public class Sample16_TryCatch1 {
	public static void main(String args[]){
		calc(args);
	}

	public static void calc(String args[]){
		// 100 ÷ 引数 する
		System.out.println(100 / Integer.parseInt(args[0]));
	}
}