package sample19;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
	サンプル１９：基本的なクラス（BigDecimal）
*/
public class Sample19_02_BigDecimal{
	public static void main(String args[]){

		double d1 = 1.0;
		double d2 = 0.9;
		System.out.println(d1 - d2);

		BigDecimal bd1 = new BigDecimal(d1);
		BigDecimal bd2 = new BigDecimal(d2);
		BigDecimal bd3 = bd1.subtract(bd2);
		
		// 2026/04/28 非推奨のため変更(ROUND_HALF_UPはRoundingMode.HALF_UPに変更) )
		bd3 = bd3.setScale(1, RoundingMode.HALF_UP);

		System.out.println(bd3);
	}
}