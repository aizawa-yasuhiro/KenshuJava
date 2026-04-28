package sample;

/*
サンプル０６：繰り返し（for・while・do-while文）
*/
public class Sample06_Loop {

	public static void main(String[] args) {
		// for文でループ
		for (int i = 1; i <= 5; i++) {
			System.out.println("for文：" + i + "回目");
		}
		
		// while文でループ
		int j = 1;
		while (j <= 5) {
			System.out.println("while文：" + j + "回目");
			j++;
		}
		
		// do-while文でループ
		int k = 1;
		do {
			System.out.println("do while文：" + k + "回目");
			k++;
		} while (k <= 5);
	}

}
