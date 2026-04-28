package sample17;

/*
	サンプル１７：final、static
*/
public final class Sample17_Shopping {
	public final static double TAX_RITSU     = 0.08;		// 消費税率
	public 		 static double nebiki_ritsu;				// 値引き率
	public				double price;						// 税抜き金額

	/* どのオブジェクトが実行しても同じ結果 */
	public static void printSame(){
		System.out.println("どのオブジェクトが実行しても同じ結果");
		System.out.println("消費税率：" + TAX_RITSU);
		System.out.println("値引き率：" + nebiki_ritsu);
		System.out.println("----------------------------");
	}

	/* オブジェクトごとに結果が異なる */
	public void printJobDiff(){
		System.out.println("オブジェクトごとに結果が異なる");
		System.out.println("税込金額：" + (int)(price * (1 + TAX_RITSU - nebiki_ritsu)));
		System.out.println("----------------------------");
	}

}