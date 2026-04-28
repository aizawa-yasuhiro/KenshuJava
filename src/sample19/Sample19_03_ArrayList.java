package sample19;

import java.util.ArrayList;

import sample13.Sample13_Car;

/*
	サンプル１９：基本的なクラス（ArrayList）
*/
public class Sample19_03_ArrayList{
	public static void main(String args[]){

		ArrayList<Sample13_Car> objList = new ArrayList<Sample13_Car>();
		objList.add(new Sample13_Car("トヨタ", "プリウス"));
		objList.add(new Sample13_Car("日産", "マーチ"));
		objList.add(new Sample13_Car("ホンダ", "FIT"));
		objList.add(new Sample13_Car("スバル", "フォレスター"));

		objList.set(2, new Sample13_Car("ホンダ", "オデッセイ"));
		objList.remove(1);

		for(int i=0; i < objList.size(); i ++){
			Sample13_Car objCar = objList.get(i);
			objCar.print();
		}
	}
}