package sample19;

/*
	サンプル１９：基本的なクラス（StringBuffer）
*/
public class Sample19_01_StringBuffer {
	public static void main(String args[]){

		StringBuffer sb = new StringBuffer();

		sb.append("SELECT * ");
		sb.append("FROM EMP ");
		sb.append("ORDER BY EMP_NO;");

		System.out.println(sb.toString());
	}
}