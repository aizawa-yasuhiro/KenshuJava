/*
	課題【３－２】
		kadai03.Personクラスを呼び出し、アクセサメソッドで値を設定→取得し、
		自己紹介文を表示する。
*/
package kadai03.call;

import kadai03.Person;

public class CallPerson {
	public static void main(String args[]) {

		// Personクラスをインスタンス化してオブジェクト生成
		Person objPerson_A = new Person();
		Person objPerson_B = new Person();

		// 値をアクセサメソッドでセット
		objPerson_A.setName("青木");
		objPerson_A.setAge(28);
		objPerson_A.setWorker(true);
		
		objPerson_B.setName("井上");
		objPerson_B.setAge(22);
		objPerson_B.setWorker(false);

		// 自己紹介を構築して表示
		System.out.println(intro(objPerson_A));
		System.out.println(intro(objPerson_B));
	}

	
	/* 自己紹介を構築 */
	public static String intro(Person objPerson) {

		String sIntro;			// 自己紹介文

		// 名前(年齢)です。
		sIntro = objPerson.getName() + "(" + objPerson.getAge() + ")です。";
		
		// 働いて[います|いません]。
		if(objPerson.isWorker()) {
			sIntro = sIntro + "働いています。";
		} else {
			sIntro = sIntro + "働いていません。";
		}

		// 自己紹介文を返す
		return sIntro;
	}
}