package sample19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
	サンプル１９：基本的なクラス（ファイルIO/文字ストリーム）
*/
public class Sample19_05_FileIO_Moji{
	public static void main(String args[]){

		// Sample19 ⇒ Windowsエクスプローラーでファイルを表示
		File fl = new File("..\\Sample19\\sample19_05.txt");
		FileWriter out = null;			// ファイル書き込み
		BufferedReader in = null;		// ファイル読み込み

		// ファイル書き込み
		try{
			out = new FileWriter(fl);
			out.write("ファイルI/O\n");
			out.write("文字ストリーム");
		} catch(IOException ex){
			ex.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException ex){}
		}

		// ファイル読み込み
		try{
			in = new BufferedReader(new FileReader(fl));
			String s;
			while ((s = in.readLine()) != null) {
				System.out.println(s);
			}
		} catch(IOException ex){
			ex.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException ex){}
		}
	}
}