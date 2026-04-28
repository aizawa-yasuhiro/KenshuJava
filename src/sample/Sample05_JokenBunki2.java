package sample;

/*
サンプル０５：条件分岐（if文以外）
*/
public class Sample05_JokenBunki2 {

	public static void main(String[] args) {
		System.out.println((args[0].equals("A")) ? "A" : "A以外");
		switch (args[0]) {
		case "A":
			System.out.println("Aです");
		case "B":
			System.out.println("Bです");
			break;
		case "C":
			System.out.println("Cです");
		default:
			System.out.println("A,B,C以外です");
		}
	}

}
