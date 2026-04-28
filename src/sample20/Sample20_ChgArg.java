package sample20;

/**
 *  サンプル20用クラス<br>
 *  引数の値渡しと参照渡しを確認する
 *
 *  @author CAICA Inc.
 *  @version 1.0
*/
public class Sample20_ChgArg {

    /**
     * 初期起動メソッド<br>
     * プリミティブ型の変数とオブジェクト型の変数を
     * メソッド先で変更し、自メソッドでどうなるか確認
     *
     * @param args コマンドライン引数
     */
    public static void main(String args[]){
        int prim = 100;
        StringBuffer obj  = new StringBuffer("あいうえお");

        chgArgs(prim, obj);

        System.out.println(prim);
        System.out.println(obj.toString());
    }

    /**
     * 値変更用メソッド
     *
     * @param i  プリミティブ型引数
     * @param sb  オブジェクト型引数
     */
    public static void chgArgs(int i, StringBuffer sb){
        i = 200;
        sb.append("かきくけこ");
    }

}