package sample19;

import java.util.HashMap;

import sample13.Sample13_Car;

/*
	サンプル１９：基本的なクラス（HashMap）
*/
public class Sample19_04_HashMap {
	public static void main(String args[]) {

		HashMap<String, Sample13_Car> objMap = new HashMap<String, Sample13_Car>();
		objMap.put("T01", new Sample13_Car("トヨタ", "プリウス"));
		objMap.put("N01", new Sample13_Car("日産", "マーチ"));
		objMap.put("H01", new Sample13_Car("ホンダ", "FIT"));
		objMap.put("S01", new Sample13_Car("スバル", "フォレスター"));

		objMap.put("H01", new Sample13_Car("ホンダ", "オデッセイ"));
		objMap.remove("N01");

		//		Set<String> keySet = objMap.keySet();
		//        Iterator<String> iteKeys = keySet.iterator();
		//		while(iteKeys.hasNext()){
		//			Object sKey = iteKeys.next();
		//			Sample13_Car objCar = objMap.get(sKey);
		//			objCar.print();
		//		}

		// 拡張for文で書き直した 2019.3.6
		for (String sKey : objMap.keySet()) {
			objMap.get(sKey).print();
		}
	}
}