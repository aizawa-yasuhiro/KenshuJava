package kadai09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *	課題【９－３】<br>
 *	課題【９－２】の改修。SQLインジェクション対応
 *
 *	@author	 Nishimoto
 *	@version 1.0
*/
public class SearchEmp2{

	/**
	 *	起動メソッド<br>
	 *	Oracleに接続し、EMP表の部分一致データを出力する
	 *
	 *	@param args	ENAMEの部分一致条件
	*/
	public static void main(String args[]){
		
		String sWord = "";						// 検索文字列

		// 引数が指定されている場合、検索文字列を取得する
		if(args.length != 0){
			sWord = args[0];
		}
   
		// DB接続変数定義
		Connection con = null;					// DB接続
		PreparedStatement pstmt = null;			// SQL結果保持用オブジェクト
		ResultSet rst  = null;					// レコード

		// SQL文
		String sql = "SELECT EMPNO, ENAME";
		sql = sql + "   FROM EMP";
		sql = sql + "  WHERE ENAME LIKE ?";
		sql = sql + "  ORDER BY EMPNO";

		// DB接続情報定義
		String url = "jdbc:mariadb://localhost/kenshudb";	//接続パス
		String id  = "root";	  //ログインID（SQL研修で使用したユーザ）
		String pw  = "aizawa";	//パスワード（SQL研修で使用したパスワード）

		try{
		// JDBCドライバをロードする
			Class.forName("org.mariadb.jdbc.Driver");	// DBごとの決まり文句
		} catch(ClassNotFoundException ex) {	
			System.out.println("JDBCドライバを読み込めませんでした。");
			ex.printStackTrace();
			return;
		}

		try{
			// DBとのコネクションを接続する
			con = DriverManager.getConnection(url, id, pw);
	   
			// 実行するSQL文を指定し、実行する
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + sWord + "%");
			rst = pstmt.executeQuery();

			// 取得した社員番号、社員名を出力する
			while(rst.next()){
				System.out.print(rst.getInt("EMPNO"));
				System.out.print("\t");
				System.out.println(rst.getString("ENAME"));
			}

		} catch(SQLException ex) {
			System.out.println("DBアクセス時にエラーが発生しました。");
			ex.printStackTrace();
			return;

		} finally {
			
			try {
				// DB接続を閉じる
				if(rst != null)   rst.close();
				if(pstmt != null) pstmt.close();
				if(con != null)   con.close();
				
			} catch(SQLException ex) {
				System.out.println("DBの close時にエラーが発生しました。");
				ex.printStackTrace();
				return;
			}
		}

	}
}
