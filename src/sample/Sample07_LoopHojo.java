package sample;

/*
サンプル０７：繰り返し補助（continue・break文）
*/
public class Sample07_LoopHojo {

	public static void main(String[] args) {
		// continue
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("for文：" + i + "回目");
		}

		// break
		int j = 1;
		while (j <= 5) {
			if (j == 3) {
				break;
			}
			System.out.println("while文：" + j + "回目");
			j++;
		}

		System.out.println("Job End");
	}

}