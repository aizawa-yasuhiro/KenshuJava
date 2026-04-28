package sample18;

/*
	サンプル１８：イニシャライザ
*/
public final class Sample18_Init {

	static {
		System.out.println("イニシャライザ");
	}

	public Sample18_Init(){
		System.out.println("コンストラクタ");
	}
}