package kadai09;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBUtil;

/**
 *	課題【９－１】<br>
 *	DEPT表の全件出力クラス
 *
 *	@author	 Nishimoto
 *	@version 1.0
*/
public class SearchDeptAll{

	/**
	 *	起動メソッド<br>
	 *	Oracleに接続し、DEPT表の全件を出力する
	 *
	 *	@param args	引数リスト（指定不要）
	*/
	public static void main(String args[]){

		// DB接続変数定義
		Connection con = null;					// DB接続
		Statement stmt = null;					// SQL結果保持用オブジェクト
		ResultSet rst  = null;					// レコード
		String sql = "SELECT * FROM DEPT";		// SQL文

		// DB接続情報定義
//		String url = "jdbc:mariadb://localhost/kenshudb";	//接続パス
//		String id  = "root";	  //ログインID（SQL研修で使用したユーザ）
//		String pw  = "aizawa";	//パスワード（SQL研修で使用したパスワード）
//
//
//		// JDBCドライバをロードする
//		try{
//			Class.forName("org.mariadb.jdbc.Driver");	// DBごとの決まり文句
//		} catch(ClassNotFoundException ex) {	
//			System.out.println("JDBCドライバを読み込めませんでした。");
//			ex.printStackTrace();
//			return;
//		}


		try{
			// DBとのコネクションを接続する
			con = DBUtil.getConnection();

			// 実行するSQL文を指定し、実行する
			stmt = con.createStatement();
			rst = stmt.executeQuery(sql);

			// 取得した部門番号、部門名、場所を全件出力する
			while(rst.next()){
				System.out.print(rst.getInt("DEPTNO"));
				System.out.print("\t");
				System.out.print(rst.getString("DNAME"));
				System.out.print("\t");
				System.out.println(rst.getString("LOC"));
			}

		} catch(SQLException ex) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			ex.printStackTrace();
			return;

		} finally {
			
//			try {
//				// DB接続を閉じる
//				if(rst != null) rst.close();
//				if(stmt!= null) stmt.close();
//				if(con != null) con.close();
//				
//			} catch(SQLException ex) {
//				System.out.println("DBの close時にエラーが発生しました。");
//				ex.printStackTrace();
//				return;
//			}
			
			DBUtil.close(rst, stmt, con);
		}

	}
}
