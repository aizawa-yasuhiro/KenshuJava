package sample;

/*
サンプル０４：条件分岐（if文）
*/
public class Sample04_JokenBunki {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("引数がありません。");
			return;
		} else if (args[0].equals("ABC")) {
			System.out.println("引数が\"ABC\" です。");
			return;
		} else {
			System.out.println("引数が\"ABC\" 以外です。");
		}
		System.out.println("引数：" + args[0]);
	}

}
