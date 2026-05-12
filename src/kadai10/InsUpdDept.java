package kadai10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBUtil;

/**
 *	課題【１０－１】<br>
 *	DEPT表の INSERT/UPDATE を行うクラス
 *
 *	@author	 Nishimoto
 *	@version 1.0
*/
public class InsUpdDept {

	/**
	 *	起動メソッド<br>
	 *	MariaDBに接続し、DEPT表の INSERT/UPDATEを行い、結果を出力する
	 *
	 *	@param args	引数リスト（DEPTNO, DNAME, LOC）
	*/
	public static void main(String args[]) {

		// 引数が足りない場合はメッセージを表示し、処理を終了する
		if(args.length < 3) {
			System.out.println("引数が足りません（DEPTNO, DNAME, LOC）。");
			return;
		}

		// DB接続変数定義
		// Connection con = null;				// DB接続
		PreparedStatement pstmt = null;		// SQL結果保持用オブジェクト
		ResultSet rst = null;				// レコード
		
// DBUtilクラスを使用して、DB接続処理を簡略化する
// try-with-resources構文を使用して、DBクローズ処理を簡略化する
		try(Connection con = DBUtil.getConnection()){

			// 入力された部門番号の存在確認を行う
			// ・件数取得用の SQL文を構築する
			String sql = "SELECT COUNT(*) CNT";
			sql = sql + "   FROM DEPT";
			sql = sql + "  WHERE DEPTNO = ?";

			// ・件数取得用の SQL文を実行する
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, args[0]);
			rst = pstmt.executeQuery();
			rst.next();


			// 部門番号が存在しない場合：新規登録
			if(rst.getInt("CNT") == 0) {
				// ・INSERT用の SQL文を構築する
				sql = "INSERT INTO DEPT(DEPTNO, DNAME, LOC)";
				sql = sql + " VALUES(?, ?, ?)";

				// ・INSERT用の SQL文を実行する
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, args[0]);
				pstmt.setString(2, args[1]);
				pstmt.setString(3, args[2]);
				pstmt.executeUpdate();

				System.out.println("データを1件追加しました。");

			// 部門番号が存在する場合：更新
			} else {
				// ・UPDATE用の SQL文を構築する
				sql = "UPDATE DEPT";
				sql = sql + "   SET DNAME = ?, LOC = ?";
				sql = sql + " WHERE DEPTNO = ?";

				// ・UPDATE用の SQL文を実行する
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, args[1]);
				pstmt.setString(2, args[2]);
				pstmt.setString(3, args[0]);
				pstmt.executeUpdate();

				System.out.println("データを1件更新しました。");
			}


			// INSERT/UPDATE後のDEPT表を取得する
			sql = "SELECT * FROM DEPT ORDER BY DEPTNO";
			pstmt = con.prepareStatement(sql);
			rst = pstmt.executeQuery();		// SQL実行

			// 取得したDEPT表を出力する
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

		}

	}
}